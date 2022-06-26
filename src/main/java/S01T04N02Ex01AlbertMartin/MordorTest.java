package S01T04N02Ex01AlbertMartin;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class MordorTest {

    String wordToCheck = "Mordor";
    int expectedStringLenght = 8;

    //Per a veure si el nostre test funciona correctament, fem que falli assignant una longitud errònia al
    //string "Mordor". Utilitzem un Matcher.
    @Test
    public void mordorStringLenghtWithMatcher (){

        assertThat(String.valueOf(wordToCheck.length()), is(expectedStringLenght));

    //Per poder comparar, fem el mateix test, però amb JUnit
    }
    @Test
    public void mordorStringLenghtWithAssert(){

        assertEquals("La longitud esperada del string Mordor és: " +
                expectedStringLenght +  " i la longitud del string Mordor és: " +
                wordToCheck.length(), wordToCheck.length(), expectedStringLenght);

    }

}