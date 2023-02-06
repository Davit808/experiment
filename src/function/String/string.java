package function.String;

public class string {
    public static void main(String[] args) {
        String strText = "Learn to code with our beginner-friendly tutorials and examples. Read interactive tutorials, and write and test your code to learn programming. string.";
        String strWorld = "and";
        System.out.println(theNumberOfWorldsRepeatedInText(strText, strWorld));
        System.out.println(theNumberOfWorldsRepeatedInText(strText));
    }
    static int theNumberOfWorldsRepeatedInText(String a, String b){
        if(a.length() == 0 || b.length() == 0){
            return -2;
        }
        int sum = 0;
        String[] newStr = a.split(" ");
        for (String x: newStr){
            if(x.length() < b.length()){
                continue;
            } else if (x.length() > b.length()) {
                x = x.substring(0, b.length());
            }
            if(x.compareToIgnoreCase(b) == 0){
                sum++;
            }
        }
        if (sum > 0){
            return sum;
        }
        return -1;
    }
    static int theNumberOfWorldsRepeatedInText(String a){
        if(a.length() == 0){
            return -2;
        }
        int sum = 0;
        String[] newStr = a.split(" ");
        for (String s : newStr) {
            if (s.length() < 6) {
                continue;
            } else if (s.length() > 6) {
                s = s.substring(0, 6);
            }
            if("string".equals(s) == true){
                sum++;
            }
        }
        if (sum > 0){
            return sum;
        }
        return -1;
    }
}
