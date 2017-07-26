package com.codewars;

import java.util.Arrays;

/**
 * Created by minal on 5/31/17.
 */
public class HighestandLowest {
    public static String HighAndLow(String s) {

        long max = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        long min = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        return max+" "+min;
    }
}
