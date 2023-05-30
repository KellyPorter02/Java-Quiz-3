package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> answer = new ArrayList<>();
        String base = str.toLowerCase();
        // pull out letter, capitalize, replace, add to array (if number or space, just ignor and add)
        for (int i = 0; i < str.length(); i++) {
            String currLetter = String.valueOf(base.charAt(i));
            StringBuilder strToAdd = new StringBuilder(base);
            if (currLetter.equals(" ")) {
                continue;
            }

            if (isNumeric(currLetter)) {
                answer.add(base);
            }

            strToAdd.replace(i, i + 1, currLetter.toUpperCase());
            answer.add(strToAdd.toString());
        }
        return answer.toArray(new String[0]);
    }

    private static boolean isNumeric(String letter) {
        String numbers = "1234567890!";
        return numbers.contains(letter);
    }


}
