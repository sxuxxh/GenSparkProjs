package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class ReverseArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> revArrayList = new ArrayList<>();
        try {
            for (int i = list.size() - 1; i >= 0; i--) {
                revArrayList.add(list.get(i));
            }
            return revArrayList;
        } catch (Exception e) {
            return null;
        }
    }
}
