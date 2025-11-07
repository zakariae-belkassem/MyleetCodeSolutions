package Solved;

import java.util.Arrays;

public class N66 {

    public static int[] plusOne(int[] digits) {
        if (digits.length == 0) return new int[]{1};
        if (digits[digits.length - 1] < 9) {
            System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkk");
            digits[digits.length - 1]++;
            return digits;
        }
        int carry = 1;
        int i = digits.length - 1;
        do{
            System.out.println("booooooooooooooooooooooucle");
            if(digits[i]==9){
                System.out.println(digits[i]+"777777777777777 if ");
                digits[i]=0;

            }else{
                System.out.println(";;;;;;;;;;;;;;;;;;;;;;; else");
                digits[i]=(digits[i]+1);
                carry=0;
            }

            i--;
        }while(i>=0 && carry==1);

       if(carry==1){
           System.out.println("k8888888888888888888888888kkkk");
           int[] arr1 = new int[]{1};
           int[] result = new int[digits.length + arr1.length];
           System.arraycopy(arr1, 0, result, 0, arr1.length);
           System.arraycopy(digits, 0, result, arr1.length, digits.length);

           return result;

       }
        return digits;
    }
    public static void main(String[] args) {
       System.out.println(Arrays.toString(plusOne(new int[]{2,9, 9, 9})));

    }
}
