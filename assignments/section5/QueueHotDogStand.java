package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Collections;

public class QueueHotDogStand implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        final int qIdx = 2;
        if (list.size()==1 || list.size()==3) {
            return list;
        } else if (list.size()==2) {
            Collections.reverse(list);
            return list;
        } else {
            try {
                ArrayList<Integer> qLst = new ArrayList<>();
                ArrayList<Integer> postQLst = new ArrayList<>();
                //fill qLst
                for (int i = 0; i <= qIdx; i++) {
                    qLst.add(list.get(i));
                }
                //fill postQLst
                for (int i = 3; i <= list.size()-1; i++) {
                    postQLst.add(list.get(i));
                }
                //add qLst to postQlst
                postQLst.addAll(qLst);
                return postQLst;
            } catch (Exception e) {
                return list;
            }
        }
    }
}
