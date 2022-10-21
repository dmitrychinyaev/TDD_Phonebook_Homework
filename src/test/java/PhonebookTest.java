import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhonebookTest {
    @BeforeEach
    public void init() {
        System.out.println("Test started");
        Object sut = null;
    }

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("Test completed");
        //sut = null;
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Tests completed");
    }

    @Test
    public void add() {
        String name1 = "Ivan";
        String number1 = "89991112233";

        int expected = 1;

        int result = sut.add(name1,number1);

        assertEquals(expected,result);
    }

    
}


