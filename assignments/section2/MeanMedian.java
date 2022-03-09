package genspark.assignments.section2;

import genspark.assignments.Assignment;

import java.util.Arrays;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        float mean;
        mean = ((float)a+b+c)/3;
        String meanStr = "";
        meanStr = Float.toString(mean);
        String medianStr = "";

        int count = 3;
        int arr[] = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        medianStr = Integer.toString(arr[(count+1)/2-1]);
        String all = "";
        all = meanStr + " " + medianStr;
        return all;
    }
}
