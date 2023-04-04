package org.example.runner;

import java.util.List;

/**
 * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
 *
 *
 * noLong(["this", "not", "too", "long"]) → ["not", "too"]
 * noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
 * noLong(["cccc", "cccc", "cccc"]) → []
 */
public class FPNoLong {

    public List<String> noLong(List<String> strings) {
        strings.removeIf(str -> str.length()>=4);
        return strings;
    }

}
