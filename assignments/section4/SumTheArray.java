package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class SumTheArray implements Assignment {
    public int solution(int[] numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int mySum = 0;
        try {
            for (int element : numbers) {
                mySum = mySum + element;
            }
            return mySum;
        } catch (Exception e) {
            return 0;
        }
    }
}
