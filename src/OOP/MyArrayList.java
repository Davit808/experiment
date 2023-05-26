package OOP;
import java.util.ArrayList;
import java.lang.Number;

public class MyArrayList {
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
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>(20);
        Object o = new Object();
        System.out.println(arr.equals(arr2)); //arr and arr2 have a instance specified type
        System.out.println(arr2.equals(arr));//arr2 and arr have a instance specified type
        System.out.println(arr.equals(o)); // o and arr haven't a instance specified tape and result is false. if one element is null them result instanceof is false
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
        arr2.remove(0);
        System.out.println(arr2);
//        ArrayList<String> arr3 = new ArrayList<>();
//        arr3.add("test");
//        arr3.add("test1");
//        System.out.println(arr3);
//        arr2.add(6, -5);
//        System.out.println(returnElements(arr2));
    }
}
