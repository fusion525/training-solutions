package week05d02;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    ChangeLetter changeletter = new ChangeLetter();

    @Test
    public void testChangeVowels(){
        assertEquals("Th* q**ck br*wn f*x j*mp*d *v*r th* l*zy d*g.", changeletter.changeVowels("The quick brown fox jumped over the lazy dog."));
    }


}
