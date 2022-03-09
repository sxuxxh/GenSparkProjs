package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class SwitchItUp implements Assignment {
    public String solution(int x) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String num = "";
        switch (x) {
            case 1: num = "one";
                return num;
            case 2: num = "two";
                return num;
            case 3: num = "three";
                return num;
            case 4: num = "four";
                return num;
            case 5: num = "five";
                return num;
            default: num = "none";
                return num;
        }
    }
}
