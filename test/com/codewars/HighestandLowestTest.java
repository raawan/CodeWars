package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by minal on 5/31/17.
 */
public class HighestandLowestTest {

    @Test
    public void Test1() {
        assertEquals("42 -9", HighestandLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }


}
