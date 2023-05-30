package OOP.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Common");
        list.add("Hello");
        list.add("Argument");
        Collections.sort(list);
        System.out.println(list);
        list.clear();
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(6);
        list2.add(3);
        Collections.sort(list2);
        System.out.println(list2);
        list2.add(9);
        Collections.sort(list2);
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);
    }
}
