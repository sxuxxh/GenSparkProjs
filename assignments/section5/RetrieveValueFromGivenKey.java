package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashMap;

public class RetrieveValueFromGivenKey implements Assignment {
    public int solution(HashMap<Integer,Integer> map, Integer value) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        try {
            for (int key : map.keySet()
            ) {
                if (key == value) {
                    return map.get(key);
                }
            }
            return 0;
        } catch (Exception e) {
            return 0;
        }
    }
}
