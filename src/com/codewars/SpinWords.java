package com.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {


    public String spinWords(String sentence) {

        StringBuilder stringBuilder = new StringBuilder("");
        String strArr[] = sentence.split(" ");
        if(strArr.length == 1) {
            return reverseIfLengthGreaterThan4(strArr[0]);
        }
        for (String str : strArr) {
            stringBuilder.append(reverseIfLengthGreaterThan4(str)+" ");
        }

        return stringBuilder.toString().trim();
    }

    private String reverseIfLengthGreaterThan4(String str) {
        if(str.length()>4)
            return new StringBuilder(str).reverse().toString();
        else
            return str;
    }

    public String spinWordsStream(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}
