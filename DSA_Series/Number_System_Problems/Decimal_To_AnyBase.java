package DSA_Series.Number_System_Problems;

import java.util.Scanner;
public class Decimal_To_AnyBase {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int result = 0, power = 1;
       while(n>0){
           int rem = n % b;
            result = power * rem + result;
            power *= 10;
            n /=b;
       }
       return result;
   }
}
