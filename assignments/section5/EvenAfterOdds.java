package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Stack;

public class EvenAfterOdds implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> oddLst = new ArrayList<>();
        ArrayList<Integer> evenLst = new ArrayList<>();

        if (nums.size()==0 || nums.size()==1 ) {
            return nums;
        } else {
            for (int item: nums
            ) {
                if (item%2==0) {
                    evenLst.add(item);
                } else {
                    oddLst.add(item);
                }
            }
            oddLst.addAll(evenLst);
        }
        return oddLst;
    }
}
