package week06d01;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ListSelector {

    public String listSelect(List<String> list) {

        StringJoiner stringJoiner = new StringJoiner(", ");

        if (list.size() == 0) {
            return "";
        }
        if ("null".equals(list)) {
            throw new NullPointerException("Provided list is null");
        }
        else {
            for (int i = 0; i < list.size(); i = i + 2) {
               stringJoiner.add(list.get(i));
            }
        }
        return "[" + stringJoiner.toString() + "]";
    }

    public static void main(String[] args) {


        ListSelector listSelector = new ListSelector();

        List<String> list = new ArrayList<>();

        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
        list.add("test6");
        list.add("test7");
        list.add("test8");
        list.add("test9");

        System.out.println(listSelector.listSelect(list));

        List<String> list2 = new ArrayList<>();
        listSelector.listSelect(list2);
    }
}
