import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("Add length ab, bc, ac");
        int ab = triangle.nextInt();
        int bc = triangle.nextInt();
        int ac = triangle.nextInt();
        if(ab + bc > ac && bc + ac > ab && ac + ab > bc){
            System.out.println("You can the construct a triangle the " + ab + " " + bc + " " + ac + " length");
        } else {
            System.out.println("You can't the construct a triangle the " + ab + " " + bc + " " + ac + " length");
        }

    }
}
