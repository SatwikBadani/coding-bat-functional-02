package org.example.runner;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
 *
 *
 * two2([1, 2, 3]) → [4, 6]
 * two2([2, 6, 11]) → [4]
 * two2([0]) → [0]
 */
public class FPTwo2 {

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(num -> num*2).filter(num -> num%10!=2).collect(Collectors.toList());
    }

}
