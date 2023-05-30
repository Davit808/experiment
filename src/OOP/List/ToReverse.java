package OOP.List;

public class ToReverse {
    public static void main(String[] args) {
        String s = "Hello my best friend";
        String k = reversLettersInWord(s);
        System.out.println(k);
    }
    public static String reversLettersInWord(String word){
        String[] wordArr = word.split(" ");
        String result = "";
        for (int k = 0; k < wordArr.length; k++) {
            char[] revers = wordArr[k].toCharArray();
            for (int i = 0, j = revers.length - 1; i < revers.length / 2; i++) {
                char first = revers[i];
                char last = revers[j];
                revers[i] = last;
                revers[j] = first;
                j--;
            }
            result = result + " " + String.valueOf(revers);
        }
        return result;
    }
}
