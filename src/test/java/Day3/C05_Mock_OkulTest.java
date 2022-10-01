package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {

    // okul class'ımız işlemler'e bağımlı
    // bağımlı olunanı mocklamalıyız
    // test ettiğimiz methodu bağımlılıklarından arındırarak test etmemizi sağlıyor
    // bunu fake objeler ve fake methodlar ile yapıyor


    // burada operasyonlar() methodunun düzgün çağırılıp çağırılmadığını test ediyoruz
    @Test
    void operasyonlarTest(){
    C05_Mock_Islemler dummyObject = Mockito.mock(C05_Mock_Islemler.class);
    dummyObject.guncelleOgrenci("Ahmet");
    dummyObject.silOgrenci("Mehmet");
    dummyObject.ekleOgrenci("Kasım");

    // methodlar çağrılmış mı kontrol edelim, önemli olan sadece bu
        // değeri dönmüş dönmemiş, method hatalı vs bunlar önemsiz
        // verify() -> dummyObject üzerinde "Kasım" parametresiyle ekleOgrenci() çağırıldı mı?
        verify(dummyObject).ekleOgrenci("Kasım");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");
    }


    // method kaç kere çağırıldığını test edelim
    // buradaki method çağırma sayılarını test ettiğimiz class'daki gibi yapıyoruz
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler dummyObject2 = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.guncelleOgrenci("Mehmet");
        dummyObject2.silOgrenci("Ahmet");

        // Acaba "Ahmet" parametresi ile ekleOgrenci() methodu 2 defa çağırıldı mı
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");

        // ekleOgrenci() methodunu "Buse" parametresi ile çağırılıp çağırılmadığını test edelim:
        verify(dummyObject2,times(0)).ekleOgrenci("Buse");

        // herhangi bir parametre ile hiç çağırılmayan methodu test etmek istersek:
        verify(dummyObject2,never()).silOgrenci(anyString());
    }
}
