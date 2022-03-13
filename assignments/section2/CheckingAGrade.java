package genspark.assignments.section2;

import genspark.assignments.Assignment;
import org.apache.commons.lang3.Range;

public class CheckingAGrade implements Assignment {
    public String solution(int grade) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (grade >= 90 && grade <= 100) {
            return "A";
        }
        if (grade >= 80 && grade <= 89) {
            return "B";
        }
        if (grade >= 70 && grade <= 79) {
            return "C";
        }
        else {
            return "FAILURE";
        }
    }
}
