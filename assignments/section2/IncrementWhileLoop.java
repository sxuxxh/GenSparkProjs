package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int count = from;
        String str = "";
        while (count <= to) {
            str = str + Integer.toString(count);
            count++;
        }
        return str;
    }
}
