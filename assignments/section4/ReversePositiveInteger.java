package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReversePositiveInteger implements Assignment {
    public int solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String numStr = Integer.toString(number);
        try {
            ArrayList<String> numArrayList = new ArrayList<>();
            for (int i = numStr.length() - 1; i >= 0; i--) {
                numArrayList.add(Character.toString(numStr.charAt(i)));
            }
            return Integer.parseInt(numArrayList.stream().collect(Collectors.joining()));
        } catch (Exception e) {
            return 0;
        }
    }
}
