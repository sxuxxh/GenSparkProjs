package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int retNum = 1;
        for (int i=n; i>0; i--) {
            retNum = retNum * i;
        }
        return retNum;
    }
}
