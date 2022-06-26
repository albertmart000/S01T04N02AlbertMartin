package S01T04N02Ex01AlbertMartin;

import org.hamcrest.Description;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AppTest {

        FeatureMatcher featureMatcher= new FeatureMatcher() {


            @Override
            protected Object featureValueOf(Object o) {
                return null;
            }
            @Override
            protected boolean matchesSafely(Object actual, Description mismatch) {
                return super.matchesSafely(actual, mismatch);
            }

        };
   /* public static Matcher<Integer>stringLenght(String "Mordor")
        return new FeatureMatcher*/

  /*  @Test
    public void testStringLenght(){

        String currentString = "Mordor";
        int expectedStringLenght = 8;

        assertThat(currentString.length(), equalTo(8));

    }*/
}
