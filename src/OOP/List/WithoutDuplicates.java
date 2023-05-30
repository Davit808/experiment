package OOP.List;

import java.util.*;

public class WithoutDuplicates{
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("a");
        a.add("c");
        a.add("c");
        System.out.println(a);

        for (int i = 0; i < a.size(); i++) {
            removeDuplicatesFirstMethod(a, i);
        }

        ArrayList b = removeDuplicatesSecondMethod(a);

        System.out.println(b);
        System.out.println(a);

    }

    public static <T> ArrayList<T> removeDuplicatesFirstMethod(ArrayList<T> list, int index) {
        for (int i = 0; i < list.size(); i++) {
            if (i == index) {
                continue;
            }
            if (list.get(i).equals(list.get(index))) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static <T> ArrayList<T> removeDuplicatesSecondMethod(ArrayList<T> list) {
        HashSet set = new HashSet<>(list);
        ArrayList<T> revers = new ArrayList<>(set);
        return revers;
    }
}
