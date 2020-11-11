package controlselection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingsTest {

    @Test
    public void testSayGreeting(){

        Greetings greetings = new Greetings();

        assertEquals("Jó éjszakát", greetings.sayGreeting(3, 30));
        assertEquals("Jó éjszakát", greetings.sayGreeting(4, 59));
        assertEquals("Jó éjszakát", greetings.sayGreeting(0, 1));
        assertEquals("Jó éjszakát", greetings.sayGreeting(20, 1));
        assertEquals("Jó reggelt", greetings.sayGreeting(5, 1));
        assertEquals("Jó reggelt", greetings.sayGreeting(8, 59));
        assertEquals("Jó délutánt", greetings.sayGreeting(17, 50));
        assertEquals("Jó délutánt", greetings.sayGreeting(9, 0));
        assertEquals("Jó estét", greetings.sayGreeting(19, 2));

    }

}
