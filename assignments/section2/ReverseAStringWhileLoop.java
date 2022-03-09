package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String revstr = "";
        int length = str.length();
        int i = 0;
        while (i < length) {
            revstr = revstr + str.charAt(length-1);
            length--;
        }
        return revstr;
    }
}
