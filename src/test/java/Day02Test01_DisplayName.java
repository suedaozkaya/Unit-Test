import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day02Test01_DisplayName {

    @Test
    @DisplayName("Test parseInt() to check if it is throwing for non-digit value")
    // @DisplayName'de testin yanında açıklama geliyor. Uzuun method ismi yerine kullanılabilir.
    // TestInfo'da testin ismi geliyor (info.getName)
    void testException(){ // test_parseInt_if_it_is_throwing_for_non_digit_value
        String str = "Merhaba"; // "örn 23 olsa exception fırlatmayacak"
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt(str);
        });
    }
}
