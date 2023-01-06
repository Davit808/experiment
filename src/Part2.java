import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter the number of month");
        int i = number.nextInt();
        if (0 < i && i < 13){
        switch (i) {
            case 1:
                System.out.println(i + " is January - 31 day");
            case 2:
                System.out.println(i + " is February - 28 day");
            case 3:
                System.out.println(i + " is March - 31 day");
            case 4:
                System.out.println(i + " is April - 30 day");
            case 5:
                System.out.println(i + " is May - 31 day");
            case 6:
                System.out.println(i + " is June - 30 day");
            case 7:
                System.out.println(i + " is July - 31 day");
            case 8:
                System.out.println(i + " is August - 31 day");
            case 9:
                System.out.println(i + " is September - 30 day");
            case 10:
                System.out.println(i + " is October - 31 day");
            case 11:
                System.out.println(i + " is November - 30 day");
            case 12:
                System.out.println(i + " is December - 31 day");
        }
        } else {
            System.out.println("Year is not have a Month in " + i);
        }

    }
}
