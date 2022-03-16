package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class AnagramComputation implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<String> arrList1 = new ArrayList<>();
        ArrayList<String> arrList2 = new ArrayList<>();

        //construct arrList1 with word1 and sort it
        for (int i=0; i<=word1.length()-1; i++) {
            arrList1.add(String.valueOf(word1.charAt(i)));
        }
        Collections.sort(arrList1);

        //construct arrList2 with word2 and sort it
        for (int i=0; i<=word2.length()-1; i++) {
            arrList2.add(String.valueOf(word2.charAt(i)));
        }
        Collections.sort(arrList2);

        if (word1.equals(word2) || word1.equals(null) || word2.equals(null)) {
            return false;
        } else if (arrList1.equals(arrList2)) {
            return true;
        } else {
            return false;
        }
    }
}
