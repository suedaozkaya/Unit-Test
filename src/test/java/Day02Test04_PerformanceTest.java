import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformanceTest {

    @Test
    void testPrintPerformans(){
        assertTimeout(Duration.ofSeconds(3),
                () -> IntStream.rangeClosed(1,100000).forEach(System.out::println));
    }

    // 2. örnek:
    @Test
    void testPrintPerformans2(){
        assertTimeout(Duration.ofSeconds(2),
                () -> IntStream.rangeClosed(1,5000).reduce((x,y)-> Math.addExact(x,y)));
        // assertTimeout() methoduna 3. parametre olarak String bir message da ekleyebiliyoruz
    }

    // Bunu nerede kullanabiliriz?
    // Mesela task olarak verdiğiniz sorunun çözümü için
    // yazılan kodun maksimum 2 ssaniye içinde ekrana sonucunu vermesini
    // istiyorsak performans testlerini uygularım

}
