package javaStart;

public class charArray {
    public static void main(String[] args) {
        char[] text = {'h', 'e', 'l', 'l', 'o', ' ', 'b', 'r', 'o'};
        char letter = 'o';
        int i = 0;
        while (i< text.length){
            if (text[i] == letter) {
                break;
            }
            i++;
        }
        if(i == text.length && text[i-1] != letter){
            System.out.println("latter " + letter + " is not found");
        }else {
            System.out.println("index " + letter + " is " + i);
        }
    }
}
