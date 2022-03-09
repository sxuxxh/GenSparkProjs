package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String output = "";
        int diff = 0;
        if (from == to) {
            output = Integer.toString(from);
        }
        if (from < to) {
            diff = to - from;
            do {
                output = output + Integer.toString(to-diff);
                diff=diff-1;
            } while (diff >= 0);

        }
        return output;
    }
}
