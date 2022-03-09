package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class HumanGoblin implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String msg = null;
        if (str.equals("goblin")) {
            msg = "Attack the Goblin!";
        }
        else if (str.equals("human")) {
            msg = "You aRe one of us!";
        }
        return msg;
    }
}
