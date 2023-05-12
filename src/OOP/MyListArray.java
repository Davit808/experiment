package OOP;

import Arrays.doubleArray;


import java.util.Arrays;

public class MyListArray<E> {
    private Object[] firstArray = new Object[5];
    private int length = 0;

    private Object[] copyArr() {
        Object[] arr = new Object[firstArray.length + 5];
        for (int i = 0; i < firstArray.length; i++) {
            arr[i] = firstArray[i];
            length = firstArray.length;
        }
        return arr;
    }

    private int returnLength() {
        int count = 1;
        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (firstArray[i] == null) {
                count++;
            }
        }
        length = firstArray.length - count;
        return length;
    }

    public int length() {
        return returnLength();
    }

    public void add(E element) {
        if (firstArray[firstArray.length - 1] != null) {
            firstArray = copyArr();
            firstArray[firstArray.length - 5] = element;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] == null) {
                    firstArray[i] = element;
                    return;
                }
            }
        }
    }

    public void add(int index, E element) {
        if (firstArray[firstArray.length - 1] != null) {
            firstArray = copyArr();
            for (int i = firstArray.length - 6, j = firstArray.length - 5; i >= index; i--, j--) {
                firstArray[j] = firstArray[i];
            }
            firstArray[index] = element;
        } else {
            for (int i = firstArray.length - 2, j = firstArray.length - 1; i >= index; i--, j--) {
                firstArray[j] = firstArray[i];
            }
            firstArray[index] = element;
        }
    }

    public void get() {
        for (int i = 0; i <= returnLength(); i++) {
            System.out.println(firstArray[i]);
        }
    }

    public void get(int index) {
        System.out.println(firstArray[index]);
    }

    public void remove(int index) {
        firstArray[index] = null;
        for (int i = index + 1; i < firstArray.length; i++) {
            firstArray[index] = firstArray[i];
            index++;
        }
    }

    public void insert(int index, E element) {
        if (firstArray[index] != null) {
            if (firstArray[firstArray.length - 1] == null) {
                for (int i = firstArray.length - 1, j = firstArray.length; i >= index; i--, j--) {
                    if (firstArray[i] != null) {
                        firstArray[j] = firstArray[i];
                    }
                }
                firstArray[index] = element;
            }
        } else {
            firstArray = copyArr();
            for (int i = firstArray.length - 6, j = firstArray.length - 5; i >= index; i--, j--) {
                firstArray[j] = firstArray[i];
            }
        }
        firstArray[index] = element;
    }

    public void isEmpty() {
        if (firstArray[0] == null) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    @Override
    public String toString() {
        StringBuilder firstArrayString = new StringBuilder();
        for (int i = 0; i <= length(); i++) {
            firstArrayString.append(firstArray[i] + ", ");
        }
        firstArrayString.delete(firstArrayString.length() - 2, firstArrayString.length());
        return firstArrayString.toString();
    }

}
