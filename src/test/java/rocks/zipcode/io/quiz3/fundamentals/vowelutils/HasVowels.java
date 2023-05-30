package rocks.zipcode.io.quiz3.fundamentals.vowelutils;

import static org.junit.Assert.*;
import org.junit.Test;
import rocks.zipcode.io.quiz3.fundamentals.VowelUtils;

/**
 * @author leon on 09/12/2018.
 */
public class HasVowels {
    @Test
    public void test() {
        test1();
        test2();
        test3();
    }
    public void test1() {
        String input = "qwrtypsdfghjklzxcvbnm";
        assertFalse(VowelUtils.hasVowels(input));
    }

    public void test2() {
        String input = "qwrtypsdfghjklzxcvbnma";
        assertTrue(VowelUtils.hasVowels(input));
    }

    public void test3() {
        String input = "qwrtypsdfghjklzxcvbnm_";
        assertFalse(VowelUtils.hasVowels(input));
    }

    @Test
    public void test4() {
        String input = "appl";
        assertTrue(VowelUtils.hasVowels(input));
    }
}
