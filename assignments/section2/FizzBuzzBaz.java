package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class FizzBuzzBaz implements Assignment {
    public String solution(int fuzzy) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (fuzzy % 3 == 0 && !(fuzzy % 5 == 0) && fuzzy != 0) {
            return "fizz";
        }
        else if (!(fuzzy % 3 == 0) && fuzzy % 5 == 0 && fuzzy != 0) {
            return "buzz";
        }
        else if ((fuzzy % 3 == 0 && fuzzy % 5 == 0)) {
            return "fizz buzz baz";
        }
        else {
            return "Fizzled";
        }
    }
}
