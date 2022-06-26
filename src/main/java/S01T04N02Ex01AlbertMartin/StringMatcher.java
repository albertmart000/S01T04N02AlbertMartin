package S01T04N02Ex01AlbertMartin;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.equalTo;

public class StringMatcher {

    //Definim el nostre Matcher per a avaluar la longitud d'un String
    public static Matcher<String> checkLenght(final String wordToCheck) {
        return new FeatureMatcher<>(equalTo(wordToCheck.length()),
                "The lenght of this word - ", "lenght -") {
            @Override
            protected Integer featureValueOf(String s) {
                return wordToCheck.length();
            }
        };
    }
}
