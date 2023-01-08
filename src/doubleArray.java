public class doubleArray {
    public static void main(String[] args) {
       double[] a = {-1, 2, 3, -4, 5};
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

