package Day3;

public class C05_Mock_Okul {

    C05_Mock_Islemler islemler = new C05_Mock_Islemler();

    public void operasyonlar(){
        islemler.ekleOgrenci("Ahmet");
        islemler.ekleOgrenci("Ahmet");
        islemler.guncelleOgrenci("Mehmet");
        islemler.silOgrenci("Ahmet");
    }
}
