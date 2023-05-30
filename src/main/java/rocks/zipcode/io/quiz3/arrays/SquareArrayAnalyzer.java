package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        List<Integer> actSquares = getActualSquares(inputArray);

        boolean flag = false;
        for (Integer actSquare: actSquares) {
            for (Integer sqrVal: squaredValues) {
                if (actSquare == sqrVal) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private static List<Integer> getActualSquares (Integer[] inputArray) {
        List<Integer> actSquares = new ArrayList<>(inputArray.length);
        for (int i = 0; i < inputArray.length; i++) {
            actSquares.add(inputArray[i] * inputArray[i]);
        }
        System.out.println(actSquares);
        return actSquares;
    }

    public static void main(String[] args) {

    }
}
