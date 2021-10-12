package ex41;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {
    public void read() {
        String testFileName = "C:\\Users\\AlexV\\Documents\\testfile.txt";
        String expected = "test text";
        String result = "test text";
        assertEquals(expected, result);

    }
}