package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public static List<Integer> getIndexesOfChar(String word, char character) {
        List<Integer> indexes = new ArrayList<>();

        char[] chars = word.toCharArray();

        for (int i = 0; i<chars.length; i++) {
            if(chars[i] == character) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {

        System.out.println(getIndexesOfChar("almafa",'a'));
    }

}
