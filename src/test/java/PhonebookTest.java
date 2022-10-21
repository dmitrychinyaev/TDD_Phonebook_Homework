import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhonebookTest {
    Phonebook sut;

    @BeforeEach
    public void init() {
        System.out.println("Test started");
        sut = new Phonebook();
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

    @Test
    public void addEqualName(){
        String name1 = "Ivan";
        String number1 = "89991112233";

        String name2 = "Ivan";
        String number2 = "89991112233";

        int expected = 1;

        sut.add(name1,number1);
        int result = sut.add(name2,number2);

        assertEquals(expected,result);
    }

    @Test
    public void findByName(){
        String name = "Kolya";
        String number = "89091234567";

        String expected = "Kolya";

        sut.add(name, number);
        String result = sut.findByName(number);

        assertEquals(expected,result);
    }


}


