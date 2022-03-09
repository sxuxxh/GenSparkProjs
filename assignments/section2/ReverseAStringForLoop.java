package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringForLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String revstr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i);
        }
        return revstr;
    }
}
