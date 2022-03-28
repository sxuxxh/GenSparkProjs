package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.HashMap;

public class MapReturnKeys implements Assignment {
    public ArrayList<String> solution(HashMap<String,Integer> map){
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<String> keyLst = new ArrayList<>();
        for (String key: map.keySet()
             ) {
            keyLst.add(key);
        }
        return keyLst;
    }
}
