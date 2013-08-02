/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 30/07/13
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class VowelChanger {
    private final String replacer = "mommy";
    private final char[] vowels = {'a','e','i','o','u'};
    private final float vowelThresholdPercentageRequiredForChange = 0.3f;

    private boolean justChanged;
    public String changeString(String givenString) {
        if(!changeInStringIsRequired(givenString))
            return givenString;
        StringBuffer changedString = new StringBuffer("");
        justChanged = false;
        for (int i = 0; i < givenString.length(); i++) {
            changedString.append(getReplacedStringForCharacter(givenString.charAt(i)));
        }
        return changedString.toString();
    }

    public boolean changeInStringIsRequired(String givenString) {
        if(percentageOfVowels(givenString) <= vowelThresholdPercentageRequiredForChange)
            return false;
        return true;
    }

    public float percentageOfVowels(String givenString) {
        float vowelPercentage = 0;
        int noOfVowels=0;
        for(int i=0;i< givenString.length();i++)
            if(isVowel(givenString.charAt(i)))
                noOfVowels++;
        vowelPercentage = (float)noOfVowels/givenString.length();
        return vowelPercentage;
    }

    public String getReplacedStringForCharacter(char currentCharacter) {
        String newString = String.valueOf(currentCharacter);
        if (isVowel(currentCharacter)) {
            if(justChanged==false)   {
                newString = replacer;
                justChanged = true;
            }
            else
                newString = "";
        }
        else
            justChanged=false;
        return newString;
     }

    public boolean isVowel(char givenCharacter) {
        String caseInsensitiveGivenCharacter = String.valueOf(givenCharacter).toLowerCase();
        return new String(vowels).contains(caseInsensitiveGivenCharacter);
    }
}
