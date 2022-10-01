import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test03_RepeatTestMultipleTimes {

    // testi tekrarlatmak istersem ? -> @RepeatedTest

    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("test calisti");
    }

    // 2. örnek:
    @Disabled
    // herhangi bir testi disable etmek istersek @Disabled annotationını ilgili
    // methodun üzerinde yazmanız yeterli (class'ı çalıştırdığımızda bu test çalışmayacak)
    @RepeatedTest(3)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
        System.out.println("calisti");
    }

    // 3. örnek:
    Random rnd = new Random();
    @RepeatedTest(5)
    void testMathExact(){
        int sayi1 = rnd.nextInt(10); // 1-10 arasında random değer
        int sayi2 = rnd.nextInt(10);

        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 = " +sayi1 + " sayi2 = " + sayi2);
    }
}
