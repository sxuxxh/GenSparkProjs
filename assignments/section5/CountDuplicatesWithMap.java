package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.*;

public class CountDuplicatesWithMap implements Assignment {
    public HashMap<Integer,Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> numList = new ArrayList<>();
        Set<Integer> numSet = new TreeSet<>();
        Map<Integer, Integer> numMap = new HashMap<>();
        int keyCount = 1;
        //Construct unique set and numList with orig nums
        try {
            for (int i = 0; i <= nums.size()-1; i++) {
                numSet.add(nums.get(i));
                numList.add(nums.get(i));
            }
            //Get counts and construct map
            for (int num : numSet
            ) {
                numMap.put(num, Collections.frequency(numList, num));
            }
            return (HashMap) numMap;
        } catch (Exception e) {
            return null;
        }
    }
}
