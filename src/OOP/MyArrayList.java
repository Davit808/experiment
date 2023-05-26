package OOP;

import java.util.ArrayList;
import java.lang.Number;
import java.util.LinkedList;

public class MyArrayList {
    public static void main(String[] args) {
        // Question 1
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(20);
        Object o = new Object();
        System.out.println(arr.equals(arr2)); //arr and arr2 have a instance specified type
        System.out.println(arr2.equals(arr));//arr2 and arr have a instance specified type
        System.out.println(arr.equals(o)); // o and arr haven't a instance specified tape and result is false. if one element is null them result instanceof is false
        arr.add("test");
        System.out.println(arr.equals(arr2));
        LinkedList<String> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();
        System.out.println(a.equals(b));
        a.add("test");
        b.add(2);
        System.out.println(a.equals(b));
        // Question 2
        for (int i = 0; i < 10; i++) {
            arr2.add(i);
        }
        for (int i = 5; i >= 0; i--) {
            arr2.add(i);
        }
        arr2.add(4, 0);
        System.out.println(arr2);
        for (int j = 1; j < arr2.size(); j++) {
            if (arr2.get(0).equals(arr2.get(j))) {
                arr2.remove(j);
            }
        }
        System.out.println(arr2);
    }
//      Question 3
//    public static <E> ArrayList<E> returnElements(ArrayList<E> arrayList) {
//        ArrayList<E> sublist = new ArrayList<>();
//        ArrayList<Number> sublist2 = new ArrayList<>();
//        if (!(arrayList instanceof ArrayList<Number> numbers)) {
//            sublist = arrayList;
//            return sublist;
//        } else {
//            for (int i = 0; (int) arrayList.get(i) >= 0; i++) {
//                sublist2.add((Number) arrayList.get(i));
//            }
//            return sublist2;
//        }
//        return sublist;
//    }
}
