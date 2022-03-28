package genspark.assignments.section5;

import genspark.assignments.Assignment;
import genspark.assignments.section4.FactorialComputation;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class NthRowPascal implements Assignment {
    public ArrayList<Integer> solution(int nth) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        FactorialComputation factorialComputation = new FactorialComputation();
        ArrayList<Integer> pascalTriLst = new ArrayList<>();
        int numer = 1;
        int denom = 1;
        int ithElem = 1;
        for (int i=1; i<=nth+1; i++) {
            numer = factorialComputation.solution(nth);
            denom = (factorialComputation.solution(nth-(i-1))*factorialComputation.solution(i-1));
            ithElem = numer/denom;
            pascalTriLst.add(ithElem);
        }
        return pascalTriLst;
    }
}
