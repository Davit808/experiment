package javaStart;

import java.util.Scanner;

public class theWatch {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Enter the number in minutes [1-12]");
        int t = w.nextInt();
        if(t > 0 && t <=12){
           switch (t) {
               case 12:
                   System.out.println("it's N O'clock 00 minutes");
                    break;
               case 3:
                   System.out.println("it's quarter " + "("+(t * 5)+")" + " past N");
                   break;
               case 6:
                   System.out.println("it's half " + "("+(t * 5)+")" + " past N");
                   break;
               case 9:
                   System.out.println("it's quarter " + "("+(t * 5)+")" + " to N+1");
                   break;
               case 1, 2, 4, 5:
                   System.out.println("it's " + (t * 5) + " past N");
                   break;
               case 7, 8, 10, 11:
                   System.out.println("it's " + (t * 5) + " to N+1");
                   break;
           }
        } else {
           System.out.println("Restart the program and enter the number 1-12");
        }
    }
}
