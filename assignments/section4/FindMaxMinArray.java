package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxMinArray implements Assignment {
    public ArrayList<Long> solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Long> retArrayList = new ArrayList<>();
        try {
            int maxNum = Arrays.stream(nums).max().getAsInt();
            int minNum = Arrays.stream(nums).min().getAsInt();
            retArrayList.add((long)maxNum);
            retArrayList.add((long)minNum);
            return retArrayList;
        } catch (Exception e) {
            retArrayList.add((long)0);
            retArrayList.add((long)0);
            return retArrayList;
        }
    }
}
