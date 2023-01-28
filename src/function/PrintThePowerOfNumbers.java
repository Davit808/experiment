package function;

import java.util.Scanner;

public class PrintThePowerOfNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter the valid numbers a for 1..10 and b for -10..10");
        int a = numbers.nextInt();
        int b = numbers.nextInt();
        double result = printThePowerOfNumbers(a, b);
        if (result >= 1 || result < 0) {
            switch ((int) result) {
                case -1 -> System.out.println("Enter the correct number for a 1-10 and for b -10 .. 10");
                case -2 -> System.out.println("Enter the correct number for a 1 .. 10");
                default -> System.out.println((long) result);
            }
        } else {
            System.out.printf("%." + b * -1 + "f\n", result);
        }
    }

    public static double printThePowerOfNumbers(int a, int b) {
        double power = 1;
       if (a < 1 && a > -11) {
            return -2;
        } else if (a > 10 || b > 10 || a < -10 || b < -10 ) {          // a * -1 > 10 || b * -1 > 10 whit module a or b
            return -1;
        }
        if ( b < 0) {
            while (b < 0) {
                power = power * a;
                b++;
            }
            return 1 / power;
        } else if (b > 0){
            while (b > 0) {
                power = power * a;
                b--;
            }
            return power;
        }
        return 1;
    }
}
