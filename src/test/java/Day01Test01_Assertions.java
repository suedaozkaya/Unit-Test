import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test01_Assertions {

    @Test
    public void test(){
        // main methodu yokken nasıl çalıştı?
        // Junit içinde gömülü gelen Main methodu çağrılıyor
        // class boş olduğu için test geçti
    }

    @Test
    public void testLength(){
        String cumle = "Merhaba Dünyam"; // 14 karakter
        int anlikDeger = cumle.length();
        int beklenenDeger = 14;
        //assertEquals(beklenenDeger,anlikDeger);

        // testim hata verdiginde mesaj vermek istiyorsam:
        assertEquals(beklenenDeger,anlikDeger,"Uzunluklar uyusmadi");
    }

    // farkli bir ornek:

    @Test
    public void testUpperCase(){
         String anlikDeger = "Merhaba".toUpperCase();
         String beklenenDeger = "MERHABA";
         assertEquals(beklenenDeger,anlikDeger,"UpperCase methodu duzgun calismiyor");
    }

    // toplama islemini test edelim
    @Test
    public void testToplama(){
        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1,sayi2);
        int beklenenDeger = 15;
        assertEquals(beklenenDeger,anlikDeger);
    }

    // contains() test edelim
    @Test
    public void testContains(){
        assertEquals(false,"Mirac".contains("z"));
    }
}
