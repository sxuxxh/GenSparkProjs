package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CounterForLoop implements Assignment {
    public String solution(int count) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String msg = Integer.toString(count);
        if (count > 0) {
            for (int i=count-1; i>=0; i--) {
                    msg = msg + Integer.toString(i);
            }
            return msg;
        }
        if (count == 0) {
            msg = "0";
            return msg;
        }
        else {
            msg = "";
            return msg;
        }
    }
}
