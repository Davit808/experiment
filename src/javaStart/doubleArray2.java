package javaStart;

import java.util.Scanner;

public class doubleArray2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a 5 int numbers");
        double[] a = new double[5];
        double a0 = x.nextInt();
        double a1 = x.nextInt();
        double a2 = x.nextInt();
        double a3 = x.nextInt();
        double a4 = x.nextInt();
        a[0] = a0;
        a[1] = a1;
        a[2] = a2;
        a[3] = a3;
        a[4] = a4;
        double[] b = new double[5];
        // Default index double[i] => 0․0;
        // Result index (int)double[i] => 0;
        if(a[0] > 0){
            b[0] = a[0];
        }
        if(a[1] > 0 && a[0] > 0){
            b[1] = a[1];
        } else if (a[1] > 0) {
            b[0] = a[1];
        }
        if(a[2] > 0 && b[0] == 0){
            b[0] = a[2];
        } else if (a[2] > 0 && b[1] == 0) {
            b[1] = a[2];
        } else if(a[2] > 0){
            b[2] = a[2];
        }
        if(a[3] > 0 && b[0] == 0){
            b[0] = a[3];
        } else if (a[3] > 0 && b[1] == 0) {
            b[1] = a[3];
        } else if (a[3] > 0 && b[2] == 0) {
            b[2] = a[3];
        } else if(a[3] > 0){
            b[3] = a[3];
        }
        if(a[4] > 0 && b[0] == 0){
            b[0] = a[4];
        } else if (a[4] > 0 && b[1] == 0) {
            b[1] = a[4];
        } else if (a[4] > 0 && b[2] == 0) {
            b[2] = a[4];
        } else if (a[4] > 0 && b[3] == 0) {
            b[3] = a[4];
        }else if (a[4] > 0) {
            b[4] = a[4];
        }
        System.out.println("input " + "{" + (int)a[0] + ", " + (int)a[1] + ", " + (int)a[2] + ", " + (int)a[3] + ", " + (int)a[4] + "}");
        System.out.println("output " + "{" + (int)b[0] + ", " + (int)b[1] + ", " + (int)b[2] + ", " + (int)b[3] + ", " + (int)b[4] + "}");
    }
}
