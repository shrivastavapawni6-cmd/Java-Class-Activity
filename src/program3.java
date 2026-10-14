public class program3 {
    public static void main(String[] args){
        String a = "Hello";
        a = a.toUpperCase();
        for(int i = 0; i < a.length();i++)
          System.out.print((int) a.charAt(i) - 64);
    }
}
