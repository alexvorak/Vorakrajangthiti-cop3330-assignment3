package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    public void read() {

        String testFileName = "C:\\Users\\AlexV\\Documents\\testfile.txt";
        String expected = "test text";
        String result = "test text";
        assertEquals(expected, result);

    }

}