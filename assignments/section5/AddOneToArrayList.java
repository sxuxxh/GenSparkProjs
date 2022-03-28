package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class AddOneToArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> intArrayList = new ArrayList<>();
        String numStr = "";
        try {
            for (int i = 0; i <= list.size() - 1; i++) {
                numStr = numStr + String.valueOf(list.get(i));
            }
            String numPostInc = String.valueOf(Integer.parseInt(numStr) + 1);
            for (int i = 0; i <= numPostInc.length() - 1; i++) {
                intArrayList.add(Integer.parseInt(String.valueOf(numPostInc.charAt(i))));
            }
            return intArrayList;
        } catch (Exception e) {
            return null;
        }
    }
}
