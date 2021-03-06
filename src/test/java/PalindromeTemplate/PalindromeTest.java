/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PalindromeTemplate;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void TestOddCase(){
        String[] oddWords = {"wow", "solos", "racecar"};
        int[] actual = new int[oddWords.length];
        for(int i = 0; i<oddWords.length; i++){
            actual[i]= Palindrome.findPalindromes(oddWords[i]).size();
        }
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
        assertEquals(3, actual[2]);
    }

    @Test
    public void TestEvenCase(){
        String[] words = {"abba", "noon", "Redder"};
        int[] actual = new int[words.length];
        for(int i = 0; i<words.length; i++){
            actual[i]= Palindrome.findPalindromes(words[i]).size();
        }
        assertEquals(2, actual[0]);
        assertEquals(2, actual[1]);
        assertEquals(3, actual[2]);
    }

    @Test
    public void TestEvenOddCase(){
        String[] words = {"wow", "abba", "noon", "kayak", "Redder"};
        int[] actual = new int[words.length];
        for(int i = 0; i<words.length; i++){
            actual[i]= Palindrome.findPalindromes(words[i]).size();
        }
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
        assertEquals(2, actual[2]);
        assertEquals(2, actual[3]);
        assertEquals(3, actual[4]);
    }

    @Test
    public void TestNoPalindromes(){
        List<String> actual = Palindrome.findPalindromes("astrophysics");
        assertEquals(0, actual.size());
    }

    @Test
    public void TestDuplicate(){
        List<String> actual = Palindrome.findPalindromes("BBB");
        assertEquals(3, actual.size());
    }

    @Test
    public void TestNullInput(){
        Exception emptyE = assertThrows(Exception.class, () -> Palindrome.findPalindromes(""));
        assertEquals("Parameter 'word' is missing", emptyE.getMessage());
        Exception nullE = assertThrows(Exception.class, () -> Palindrome.findPalindromes(null));
        assertEquals("Parameter 'word' is missing", nullE.getMessage());
    }

    @Test
    public void TestLengthOneInput(){
        Exception exception = assertThrows(Exception.class, () -> Palindrome.findPalindromes("i"));
        assertEquals("Parameter 'word' is missing", exception.getMessage());
    }


}
