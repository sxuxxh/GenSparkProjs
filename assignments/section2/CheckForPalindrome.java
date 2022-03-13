package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String revstr = "";
        revstr = new StringBuilder(pally).reverse().toString();
        return (revstr.equals(pally)) ? true : false;
    }
}
