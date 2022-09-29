import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day01Test04_BeforeAll_AfterAll {

    // @BeforeAll @AfterAll
    // 45 kisinin kapidan girip kilitleme ornegi
    // bir dosya okunan ve dosya uzerinden birden fazla test
    // yapacagimiz durumlarda kullanilir

    // @BeforeAll @AfterAll methodlari en basta calistigi icin
    // static olusturduk, ancak sart degil


    @BeforeAll
    static void beforeAll(TestInfo info){
        System.out.println(info.getDisplayName() + " open a file");
    }

    @AfterAll
    static void afterAll(TestInfo info){
        System.out.println(info.getDisplayName() + " close a file");
    }


    @Test
    void testWithArrays(){
        String str = "Unit test with JUnit";
        String[] anlikDeger = str.split(" ");
        String[] beklenenDeger = {"Unit","test","with","JUnit"};
        assertArrayEquals(beklenenDeger,anlikDeger,"Diziler esit degil");
        // iki array'i bu methodla direk calistirabiliyoruz
    }
}
