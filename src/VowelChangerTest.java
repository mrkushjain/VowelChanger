import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 30/07/13
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class VowelChangerTest {


    VowelChanger vowelChanger = new VowelChanger();
    @Test
    public void test1_CheckaeiouAreVowels()
    {
        assertTrue(vowelChanger.isVowel('a'));
        assertTrue(vowelChanger.isVowel('e'));
        assertTrue(vowelChanger.isVowel('i'));
        assertTrue(vowelChanger.isVowel('o'));
        assertTrue(vowelChanger.isVowel('u'));
    }

    @Test
    public void test2_qIsNotAVowel() throws Exception {
        assertFalse(vowelChanger.isVowel('q'));

    }

    @Test
    public void test_CheckAEIOUInCaptialAreVowels() throws Exception {
        assertTrue(vowelChanger.isVowel('A'));
        assertTrue(vowelChanger.isVowel('E'));
        assertTrue(vowelChanger.isVowel('I'));
        assertTrue(vowelChanger.isVowel('O'));
        assertTrue(vowelChanger.isVowel('U'));
    }

    @Test
    public void testInbcdPercentageOfVowelsIsZero() throws Exception{
        assertEquals(0,(int)(100*vowelChanger.percentageOfVowels("bcd")));
    }

    @Test
    public void testInabcdPercentageOfVowelsIsTwentyFive() throws Exception{
        assertEquals(25,(int)(100*vowelChanger.percentageOfVowels("abcd")));
    }

    @Test
    public void test_abcdeiRequireAChangeInString() throws Exception {
        assertTrue(vowelChanger.changeInStringIsRequired("abcdei"));
    }

    @Test
    public void test_abcdghDoesNotRequireAChangeInString() throws Exception {
        assertFalse(vowelChanger.changeInStringIsRequired("abcdgh"));
    }
    @Test
    public void test_bcdDoesNotRequireAChangeInString() throws Exception {
        assertFalse(vowelChanger.changeInStringIsRequired("bcd"));
    }

    @Test
    public void test_aBecomesmommy() throws Exception {
        assertEquals("mommy",vowelChanger.changeString("a"));

    }

    @Test
    public void test_eBecomesmommy() throws Exception {
        assertEquals("mommy",vowelChanger.changeString("e"));

    }

    @Test
    public void test_hBecomesh() throws Exception {
        assertEquals("h",vowelChanger.changeString("h"));

    }

    @Test
    public void test_heBecomeshmommys() throws Exception {
        assertEquals("hmommy",vowelChanger.changeString("he"));

    }


    @Test
    public void test_hisBecomeshmommys() throws Exception {
        assertEquals("hmommys",vowelChanger.changeString("his"));

    }

    @Test
    public void test_hearsBecomeshmommyr() throws Exception {
        assertEquals("hmommyr",vowelChanger.changeString("hear"));

    }

    @Test
    public void test_heArSBecomeshmommyr() throws Exception {
        assertEquals("hmommyrS",vowelChanger.changeString("heArS"));

    }
}
