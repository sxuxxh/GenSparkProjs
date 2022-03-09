package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAnInteger implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String revStr = "";
        String numStr = Integer.toString(number);

        for (int i = numStr.length() - 1; i >= 0; i--) {
            revStr = revStr + numStr.charAt(i);
        }
        return revStr;
    }
}
