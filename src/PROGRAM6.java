public class PROGRAM6 {
    public static void main(String[] args) {
        String a = "World Wide Web";
         a = a.toUpperCase();
         String res = "";
         for(int i = 0; i < a.length(); i++){
             if(a.charAt(i) == ' '){
                 res = res + a.charAt(i);
             }else{
                 res = res + (char)(a.charAt(i) -64);
             }
         }
         System.out.println(res);
    }
}