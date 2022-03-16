package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindSublistFromRange implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> elms, int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        try {
            ArrayList<Integer> retArrayList = new ArrayList<>();
            for (int i = from; i <= to - 1; i++) {
                retArrayList.add(elms.get(i));
            }
            return retArrayList;
        } catch (Exception e) {
            return null;
        }
    }
}
