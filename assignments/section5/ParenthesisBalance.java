package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ParenthesisBalance implements Assignment {
    public String solution(String s) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        //get s into arrLst
        if (s.isEmpty() || s == null) {
            return "unbalanced";
        } else {
            ArrayList<String> strLst = new ArrayList<>();
            for (int i=0; i<=s.length()-1; i++) {
                strLst.add(String.valueOf(s.charAt(i)));
            }
            while (strLst.contains("()")) {
                strLst.remove("()");
            }
            return strLst.isEmpty() ? "balanced" : "unbalanced";
        }
    }
}
