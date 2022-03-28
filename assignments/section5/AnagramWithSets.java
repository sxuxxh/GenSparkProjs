package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Set;
import java.util.TreeSet;

public class AnagramWithSets implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        Set<String> wordSet1 = new TreeSet<>();
        Set<String> wordSet2 = new TreeSet<>();

        try {
            for (int i = 0; i <= word1.length() - 1; i++) {
                wordSet1.add(String.valueOf(word1.charAt(i)));
            }

            for (int i = 0; i <= word2.length() - 1; i++) {
                wordSet2.add(String.valueOf(word2.charAt(i)));
            }

            if (word1.equals(word2) || word1.length() != word2.length()) {
                return false;
            } else {
                return wordSet1.equals(wordSet2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
