package DSA_Series.Number_System_Problems;

import java.util.Scanner;
public class Decimal_To_Decimal_Addition {
  
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(10, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int result=0,power=1,carry=0;
       while(n1>0 || n2>0 || carry>0){
           int sum = n1 % 10 + n2%10 + carry;
           carry = sum / b;
           result = power * (sum%b) + result;
           power *= 10;
           n1 /= 10; n2 /= 10;
       }
       return result;
   }
}
