public class program5 {
    public static void main(String[] args) {
        String a = "Hello";
        a = a.toUpperCase();
        String res = "";
        for (int i = 0; i < a.length() / 2; i++) {
            char ch1 = a.charAt(i);
            char ch2 = a.charAt(a.length() - 1 - i);
            res = res + ch1 + ch2;
        }
        if (a.length() %2 != 0){
            char ch3 = a.charAt(a.length() / 2);
            res = res + ch3;
        }
    }
}
