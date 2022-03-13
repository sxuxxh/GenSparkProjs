package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String revStr = "";
        int strLen = str.length();
        while (strLen > 0) {
            revStr = revStr + str.charAt(strLen-1);
            strLen--;
        }
        return revStr;
    }
}
