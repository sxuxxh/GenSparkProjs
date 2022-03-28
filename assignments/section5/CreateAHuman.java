package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashMap;
import java.util.Map;

public class CreateAHuman implements Assignment {
    public HashMap<String, Object> solution(String name, Long age) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Map<String,Object> humanMap = new HashMap<>();
        humanMap.put("name",name);
        humanMap.put("age",(Object)age);
        return (HashMap)humanMap;
    }
}
