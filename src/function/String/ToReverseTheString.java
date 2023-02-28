package function.String;

public class ToReverseTheString {
    public static void main(String[] args) {
        String original = "Hello my best friend David";
        System.out.println(original);
        original = toReversTheString(original);
        System.out.println(original);
        System.out.println(toReverseTheStringForCharMethod(original));
    }
     static String toReversTheString(String str){
        String[] aaa = str.split(" ");
        for (int i = 0, j = aaa.length-1 ; i < aaa.length/2; i++) {
            String memoryStart = aaa[j];
            String memoryFinish = aaa[i];
            aaa[i] = memoryStart;
            aaa[j] = memoryFinish;
            j--;
            if (i == 0) {
                for (int k = 0; k < aaa.length; k++) {
                    char[] memory = aaa[k].toCharArray();
                    for (int l = 0, n = memory.length-1; l < memory.length/2; l++) {
                        char first = memory[l];
                        char finish = memory[n];
                        memory[l] = finish;
                        memory[n] = first;
                        n--;
                    }
                    aaa[k] = String.valueOf(memory);
                }
            }
        }
        str = new String();
         for (int i = 0; i < aaa.length; i++) {
             str = str + aaa[i] + " ";
         }
         return str;
    }
     static String toReverseTheStringForCharMethod(String Str){
        char[] memory = Str.toCharArray();
        for (int i = 0, j = memory.length-1; i < memory.length; i++) {
            char first = memory[i];
            char last = memory[j];
            memory[i] = last;
            memory[j] = first;
            j--;
        }
        Str = new String();
        for (int i = 0; i < memory.length; i++) {
            Str += memory[i];
        }
        return Str;
    }
}
