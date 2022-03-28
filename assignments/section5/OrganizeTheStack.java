package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Collections;
import java.util.Stack;

public class OrganizeTheStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Collections.sort(stack);
        Collections.reverse(stack);
        return stack;
    }
}
