package genspark.assignments.section5;

import genspark.assignments.Assignment;
import org.apache.tools.ant.types.selectors.SelectSelector;

import java.util.ArrayList;

public class MaxSubArray implements Assignment {

    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> maxSubArr = new ArrayList<>();
        ArrayList<Integer> maxSubArrTrim = new ArrayList<>();
        int arrSize = nums.size(), maxAddUp = Integer.MIN_VALUE,
                maxStop = 0, maxStartIdx = 0, maxEndIdx = 0, startCount = 0;
        if (arrSize == 1) {
            return nums;
        }
        else if (!nums.isEmpty() && arrSize > 1) {
            for (int i = 0; i < arrSize; i++)
            {
                maxStop += nums.get(i);
                if (maxAddUp < maxStop) {
                    maxAddUp = maxStop;
                    maxStartIdx = startCount;
                    maxEndIdx = i;
                }
                if (maxStop < 0) {
                    maxStop = 0;
                    startCount = i + 1;
                }
            }
            //get the elems from maxStartIdx to maxEndIdx
            for (int i = maxStartIdx; i <= maxEndIdx; i++) {
                //keep 0 val elem when it's the only one
                if (maxEndIdx==maxStartIdx && nums.get(i)==0) {
                    maxSubArr.add(nums.get(i));
                } //trim leading and trailing 0 val elems
                else if ((i==maxStartIdx && nums.get(i)==0) || (i==maxStartIdx && nums.get(i)==0)) {
                    ;
                } else {
                    maxSubArr.add(nums.get(i));
                }
            }
            //Trim leading and trailing 0 val elems

            return maxSubArr;
        } else {
            return nums;
        }
    }
}
