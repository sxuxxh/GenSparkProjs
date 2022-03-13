package genspark.assignments.section2;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String medianStr = "";
        int arr[] = {a,b,c};
        int count = arr.length;
        Arrays.sort(arr);
        medianStr = Integer.toString(arr[(count+1)/2-1]);
        return Float.toString(((float)a+b+c)/3) + " " + medianStr;
    }
}
