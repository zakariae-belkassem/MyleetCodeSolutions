package Solved;

public class N125   {
    public static boolean isPalindrome(String s) {

       StringBuilder sb = new StringBuilder();
        for (int k = 0; k < s.length(); k++) {
            if(Character.isLetter(s.charAt(k)) || Character.isDigit(s.charAt(k))){
                sb.append(Character.toLowerCase(s.charAt(k)));
            }
        }
        System.out.println(sb);
        return sb.toString().contentEquals(sb.reverse());
    }

}
