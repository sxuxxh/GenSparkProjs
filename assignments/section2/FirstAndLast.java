package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class FirstAndLast implements Assignment {
    public boolean solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int wordLength = word.length();
        int lastIndex = wordLength - 1;
        char firstChar = '\0';
        char lastChar = '\0';
        boolean ans = false;

        if (wordLength == 1 || word == "")
            ans = true;
        else if (wordLength > 1) {
            firstChar = word.charAt(0);
            lastChar = word.charAt(lastIndex);
            if (firstChar == lastChar) {
                ans = true;
            }
        }
        else {
            ans = false;
        }
        return ans;
    }
}
