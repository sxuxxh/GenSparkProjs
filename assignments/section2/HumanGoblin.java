package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class HumanGoblin implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        switch (str) {
            case "goblin":
                return "Attack the Goblin!";
            case "human":
                return "You aRe one of us!";
        }
        return null;
    }
}
