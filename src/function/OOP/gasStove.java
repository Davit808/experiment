package function.OOP;

public class gasStove {
    public static void main(String[] args) {
        gasStoveConstructor gs1 = new gasStoveConstructor(true, true); // N1 is electric eye, N2 is gas eye
        System.out.println(gs1.totalEnergy);
        System.out.println(gs1.gasEye1 + " " + gs1.gasEye2 + " " + gs1.gasEye3);
        System.out.println(gs1.elEye1 + " " + gs1.elEye2);
    }
}
