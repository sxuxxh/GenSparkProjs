package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingInteger implements Assignment {
    public int solution(ArrayList<Integer> numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        for (int i=1; i<=numbers.size(); i++) {
            if (i != numbers.get(i-1)) {
                return i;
            }
        }
        return 0;
    }
}
