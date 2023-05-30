package rocks.zipcode.io.quiz3.generics;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        // for each item in the map, if count is % 2 == 1, return the item
        Map<SomeType, Integer> countMap = populateCountMap();
        for (SomeType object: countMap.keySet()) {
            if (countMap.get(object) % 2 == 1) {
                return object;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        // for each item in the map, if count is % 2 == 0, return the item
        Map<SomeType, Integer> countMap = populateCountMap();
        for (SomeType object: countMap.keySet()) {
            if (countMap.get(object) % 2 == 0) {
                return object;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Map<SomeType, Integer> countMap = populateCountMap();
        return countMap.get(valueToEvaluate);
    }

    private Map<SomeType, Integer> populateCountMap() {
        Map<SomeType, Integer> countMap = new HashMap<>();
        for (SomeType object: array) {
            if (countMap.get(object) == null) {
                countMap.put(object, 1);
            } else {
                int count = countMap.get(object);
                count++;
                countMap.put(object, count);
            }
        }
        return countMap;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> filteredList = new ArrayList<>();
        for (SomeType object: array) {
            if (!predicate.apply(object)) {
                filteredList.add(object);
            }
        }
        return null;
    }
}
