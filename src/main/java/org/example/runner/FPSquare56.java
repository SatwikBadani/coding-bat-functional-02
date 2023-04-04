package org.example.runner;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
 *
 *
 * square56([3, 1, 4]) → [19, 11]
 * square56([1]) → [11]
 * square56([2]) → [14]
 */
public class FPSquare56 {

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(num -> num*num + 10).filter(num -> num%10!=5 && num%10!=6).collect(Collectors.toList());
    }

}
