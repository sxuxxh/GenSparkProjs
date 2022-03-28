package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Martian implements Assignment, ImplementationStation {
    String retStr = "I came to probe the globe";

    @Override
    public String speak() {
        return retStr;
    }
}
