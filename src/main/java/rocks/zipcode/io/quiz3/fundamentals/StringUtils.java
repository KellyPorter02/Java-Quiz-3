package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder(str);
        String capLet = String.valueOf(str.charAt(indexToCapitalize)).toUpperCase();
        sb.replace(indexToCapitalize, indexToCapitalize+1, capLet);
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        char checkedChar = baseString.charAt(indexOfString);
        return checkedChar == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
