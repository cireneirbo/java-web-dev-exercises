package exercises.technology;

import org.junit.Before;
import org.junit.Test;
import exercises.technology.Computer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

//Try to add three JUnit tests per class!

public class Program {

    Computer test_computer;

    @Before
    public void createComputerObject() {
        test_computer = new Computer("Lenovo", 500, true);
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,0.001);
    }

    @Test
    public void theTest() {

    }
}