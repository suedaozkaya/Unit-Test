import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test05_TestingExceptions {
    // test ettiğimiz method beklediğimiz excepitonu fırlattı mı?

    // assertThrows() methodu:
    // 1. parametre olarak beklenen exception.class,
    // 2. parametre olarak çalışabilir kod parçası: lambda exp. veya method call olabilir.

    @Test
    void testException(){
        String str = "Merhaba Dünya";
        assertThrows(NullPointerException.class, () -> {
            System.out.println("testException is run");
            str.length();
        });
    }

    // bölme işlemi için exception kontrolü

    @Test
    void testException2() {
        int sayi1 = 1;
        int sayi2 = 0;

        // test ettiğimiz exceptionın parentını da yazabiliriz: RuntimeException
        assertThrows(ArithmeticException.class, () -> {
            System.out.println(sayi1 / sayi2);
        });
    }


    // yukarıdaki soruyu method ekleyerek yapalım

    @Test
    void testException3(){
        int sayi1 = 1;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class, () -> {
            divide(sayi1,sayi2);
        });
    }

    private int divide(int a, int b){
        return a/b;
    }
}

