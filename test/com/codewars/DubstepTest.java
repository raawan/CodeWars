package com.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DubstepTest {

    @Test
    public void test1() {
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }

    @Test
    public void Test1() {
        assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("", new Dubstep().SongDecoder("WUBWUBWUB"));
    }

    @Test
    public void Test3() {
        assertEquals("M U F", new Dubstep().SongDecoder("M U F"));
    }
}
