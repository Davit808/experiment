package OOP.OnlineShop;

import OOP.Expands.BankCard;
import OOP.Expands.BusinessCard;
import OOP.MyListArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyListArray<String> array = new MyListArray<>();
        array.add("test0");
        array.add("test1");
        array.add("test2");
        array.add("test3");
        array.add("test0");
        array.add("test1");
        array.add("test2");
        array.add("test3");
        System.out.println(array.length());
        System.out.println(array);
        array.remove(10);
        array.remove(2);
        System.out.println(array);
    }
}
