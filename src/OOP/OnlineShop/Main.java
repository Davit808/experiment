package OOP.OnlineShop;

import OOP.Expands.BankCard;
import OOP.Expands.BusinessCard;
import OOP.MyListArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyListArray<String> array = new MyListArray<>();
        array.isEmpty();
        array.add("test0");
        array.add("test1");
        array.add("test2");
        array.add("test3");
        array.add(0, "aaa");
        array.add(0, "bbb");
        System.out.println(array.length());
        array.get();
        array.delete(3);
        array.isEmpty();
        System.out.println(array);
    }
}
