package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CounterForLoop implements Assignment {
    public String solution(int count) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String ret = "";
        for (int i=count; i >= 0; i--) {
            ret = ret + Integer.toString(i);
        }
        return ret;
    }
}
