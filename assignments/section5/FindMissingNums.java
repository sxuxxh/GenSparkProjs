package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingNums implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> misNumList = new ArrayList<>();
        //get full list
        for (int i=1; i<=100; i++) {
            misNumList.add(i);
        }
        //remove items in nums from full list
        for (int i=0; i<= nums.size()-1; i++) {
            misNumList.remove(nums.get(i));
        }
        return misNumList;
    }
}
