package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.Stack;

public class DeleteMiddleOfStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int midIdx = 0;
        try {
            midIdx = stack.size() % 2 == 0 ? stack.size() / 2 - 1 : (stack.size() + 1) / 2 - 1;
            stack.remove(midIdx);
            return stack;
        } catch (Exception e) {
            return stack;
        }
    }
}
