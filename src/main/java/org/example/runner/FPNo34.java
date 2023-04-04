package org.example.runner;

import java.util.List;

/**
 * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
 *
 *
 * no34(["a", "bb", "ccc"]) → ["a", "bb"]
 * no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
 * no34(["ccc", "dddd", "apple"]) → ["apple"]
 */
public class FPNo34 {

    public List<String> no34(List<String> strings) {
        strings.removeIf(str -> str.length()==3 || str.length()==4);
        return strings;
    }

}
