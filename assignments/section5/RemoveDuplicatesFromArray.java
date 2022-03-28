package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<Integer> numSet = new HashSet<>();
        for (int i=0; i<=nums.length-1; i++) {
            numSet.add(nums[i]);
        }
        int[] intArr = new int[numSet.size()];
        int i=0;
        for (Integer item : numSet) intArr[i++] = item;
        return intArr;
    }
}
