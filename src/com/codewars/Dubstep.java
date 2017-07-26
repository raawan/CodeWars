package com.codewars;

public class Dubstep {

    public static void main(String[] args) {
	// write your code here
    }

    public static String SongDecoder (String song)
    {
        return song.replaceAll("WUB"," ").trim().replaceAll("\\s+"," ");
    }
}
