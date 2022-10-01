import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParametrelizedTest {

    @Test
    void testLength(){
        assertTrue("Mirac".length()>0);
        assertTrue("Tarik".length()>0);
        assertTrue("Ismail".length()>0);
        assertTrue("Taha".length()>0);
    }

    // yukarıdaki methodu daha kolay yazmak için parametreli testler kullanırıız
    @ParameterizedTest // az sonra yapacağım test parametreler alacak
    @ValueSource(strings = {"Mirac","Tarik","Ismail","Taha"})
    // testte kullanacağımız parametreleri yukarıdaki gibi giriyoruz
    // ints = {], strings = {} şeklinde yazıyoruz
    void testLength2(String str){ // burada da parametrelerin türünü yazmamız yeterli
        // kendisi array'den bir bir alıyor
        assertTrue(str.length()>0);
    }

    // 2. örnek:
    @Test
    void testUpperCase(){
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }

    // yukarıdaki örneği parametreli olarak test edelim
    @ParameterizedTest
    @CsvSource(value = // paramtere vermenin 2.yolu: comma separated values
            {          // önce expected, sonra actual value yu sırayla yazıyoruz
            "MERHABA, merhaba",
            "JAVA, java",
            "TEST, test"
    })
    void testUpperCase2(String str1, String str2){
        assertEquals(str1,str2.toUpperCase());
    }

    // 3. örnek:
    @ParameterizedTest
    @CsvSource(value = {"true, java,a","true,junit,u","false,hello,a"})
    void testContains(boolean b1, String str1, String str2){
         assertEquals(b1,str1.contains(str2));
        // assertTrue(str1.contains(str2) == b1);
        // assertTrue'da 3. parametreyi almadı onun için ayrıca assertFalse yapmak gerek
        // o nedenle burada assertEquals uygun
    }

}
