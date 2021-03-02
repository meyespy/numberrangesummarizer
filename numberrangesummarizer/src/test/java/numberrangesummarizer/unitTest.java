package numberrangesummarizer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class unitTest {

    @Test
    public void junitWorking() {
        assertTrue(true);
    }

    @Test // TEST1 - provided test
    public void one() {

        Implementation implmnt = new Implementation();

        final String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        final String expected = "1, 3, 6:8, 12:15, 21:24, 31";
        final String actual = implmnt.summarizeCollection(implmnt.collect(input));

        assertEquals(expected, actual);
    }

    @Test // TEST2 - negative numbers and blank is handled
    public void two() {

        Implementation implmnt = new Implementation();

        final String input = "1,10,12,8,20,-4,,2,3,9";
        final String expected = "-4, 1:3, 8:10, 12, 20";
        final String actual = implmnt.summarizeCollection(implmnt.collect(input));

        assertEquals(expected, actual);
    }

    @Test // TEST3 - duplicates, multiple blanks and negative ranfes are handled
    public void three() {

        Implementation implmnt = new Implementation();

        final String input = "-1,,1,,-2,,2,,-3,,3,,-1,,1,,-2,,2,,-3,,3";
        final String expected = "-3:-1, 1:3";
        final String actual = implmnt.summarizeCollection(implmnt.collect(input));

        assertEquals(expected, actual);
    }

    @Test // TEST4 - doubles are ignored
    public void four() {

        Implementation implmnt = new Implementation();

        final String input = "1.1,1.2,2.1,2.2";
        final String expected = "";
        final String actual = implmnt.summarizeCollection(implmnt.collect(input));

        assertEquals(expected, actual);
    }

    // FAILURE CASE - non-numbers throw an exception
    @Test // TEST5
    public void five() {

        Implementation implmnt = new Implementation();

        boolean thrown = false;
        final String input = "a";

        try {
            implmnt.summarizeCollection(implmnt.collect(input));
        } catch (NumberFormatException e) {
            thrown = true;
        }

        assertTrue(thrown);

    }
}
