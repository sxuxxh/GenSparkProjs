package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int retNum = 1;
        for (int i=n; i>0; i--) {
            retNum = retNum * i;
        }
        return retNum;
        
        // ==> Functional Programming
        public static int factorialComputation(int n) {
          if(n == 0) {
            return 1;
          }
          return (n * factorialComputation(n-1));
        }

        public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
          return factorialComputation(n);
        }
    }
}
