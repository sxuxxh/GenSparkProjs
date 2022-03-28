package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Stack;

public class ReverseStringStack implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String retStr = "";
        if (word.isEmpty()) {
            return word;
        } else {
            try {
                Stack<String> myStack = new Stack<>();
                //first in last out 
                for (int i = word.length() - 1; i >= 0; i--) {
                    myStack.push(String.valueOf(word.charAt(i)));
                }
                //get myStack into retStr
                for (int i=0; i<=myStack.size()-1; i++) {
                    retStr = retStr + myStack.get(i);
                }
                return retStr;
            } catch (Exception e) {
                return word;
            }
        }
    }
}
