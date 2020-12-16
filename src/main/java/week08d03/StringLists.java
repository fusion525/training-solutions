package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public static void copy(List<String> source, List<String> target) {
        for (String content : source) {
            target.add(content);
        }
    }

    public static boolean isContain(List<String> list, String item) {
        for (String content : list) {
            if (content.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> stringListUnion(List<String> first, List<String> second) {
        List<String> union = new ArrayList<>();

        copy(first,union);

        for (int i = 0; i < second.size(); i++) {
            if (!(isContain(second,first.get(i)))) {
                union.add(second.get(i));
            }
        }
        return union;
    }

}
