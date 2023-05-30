package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    private static String[] vowels = {"a","e","i","o","u"};

    public static Boolean hasVowels(String word) {

        for (String vowel: vowels) {
            if (word.contains(vowel)) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        char firstChar = word.charAt(0);
        return isVowel(firstChar);
    }

    public static Boolean isVowel(Character character) {
        String charAsStr = String.valueOf(character);
        for (String vowel: vowels) {
            if (charAsStr.equalsIgnoreCase(vowel)) {
                return true;
            }
        }
        return false;
    }
}
