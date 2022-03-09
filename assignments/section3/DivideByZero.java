package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class DivideByZero implements Assignment {
    public Object solution(int one, int two) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Object ret = null;
        try {
            return ret = one / two;
        } catch (ArithmeticException e) {
            return "Caught Exception: Divide by zero";
        }
    }
}
