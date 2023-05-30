package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        // split with space delimter
        // foreach word
        // if startswith vowel, translate startsweith vowl
        // add to new stringoutput
        StringBuilder sb = new StringBuilder();
        String[] wordsArr = str.split(" ");

        for (int i = 0; i < wordsArr.length; i++) {
            if (VowelUtils.startsWithVowel(wordsArr[i])) {
                wordsArr[i] = translateStartsWithVowel(wordsArr[i]);
            } else {
                wordsArr[i] = translateStartsWithConsonant(wordsArr[i]);
            }
        }

        for (int j = 0; j < wordsArr.length; j++) {
            if (j == wordsArr.length - 1) {
                sb.append(wordsArr[j]);
            } else {
                sb.append(wordsArr[j]);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "The quick brown fox";
        PigLatinGenerator test = new PigLatinGenerator();
        System.out.println(test.translate(input));
    }

    private String translateStartsWithVowel(String str) {
        String suffix = "way";
        str += suffix;
        return str;
    }

    private String translateStartsWithConsonant(String str) {
        StringBuilder sb = new StringBuilder(str.substring(1));
        String firstLetter = String.valueOf(str.charAt(0));
        sb.append(firstLetter);
        sb.append("ay");
        return sb.toString();
    }
}
