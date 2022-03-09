package genspark.assignments.section2;

import genspark.assignments.Assignment;
import org.apache.commons.lang3.Range;

public class CheckingAGrade implements Assignment {
    public String solution(int grade) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Range<Integer> A = Range.between(90, 100);
        Range<Integer> B = Range.between(80, 89);
        Range<Integer> C = Range.between(70, 79);
        if (A.contains(grade)) {
            return "A";
        }
        if (B.contains(grade)) {
            return "B";
        }
        if (C.contains(grade)) {
            return "C";
        }
        else {
            return "FAILURE";
        }
    }
}
