package com.codewars;

import java.util.stream.Stream;

/**
 * Created by minal on 5/31/17.
 */
public class Money {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        if(principal==desired) return 0;
        int count =0;
        while(principal<desired) {
            principal += principal*interest*(1.0-tax);
            count++;
        }
        return count;
    }
}
