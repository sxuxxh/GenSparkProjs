package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class IterateThroughArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<String> myList) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int strLen = 0;
        int lstSize = myList.size();
        ArrayList<Integer> strLenArrayList = new ArrayList<>();
        for (int i=0; i<=lstSize-1; i++) {
            strLenArrayList.add(myList.get(i).length());
        }
        return strLenArrayList;
    }
}
