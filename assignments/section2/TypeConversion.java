package genspark.assignments.section2;

import genspark.assignments.Assignment;
import org.mapdb.Atomic;

public class TypeConversion implements Assignment {
    public Object solution(Object object) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (object instanceof String) {
            return Integer.parseInt((String) object);
        }
        if (object instanceof Integer) {
            return Integer.toString((Integer) object);
        }
        if (object instanceof Character) {
            return Character.toString((Character) object);
        }
        return null;
    }
}
