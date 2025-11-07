package NotYet;

public class N69 {


    public static int mySqrt(int x) {
        int temp = 1 ;
        int sqrt = 0;
        while(temp<=x){
            temp = temp*2;
            sqrt++;
        }
        return sqrt-1;
    }
    public static void main(String[] args) {
       String s = "A";
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < s.length(); i++) {
           sb.append((int)s.charAt(i));
       }
        

        int j = sb.toString().length()-1;
        for(int i = 0; i<(int)(s.length()/2); i++){
            if(sb.charAt(i)!= sb.charAt(j)) {System.out.println("Not a palindrome");return;}
            j--;
        }
        System.out.println(sb.length());
    }
}
