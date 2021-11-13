package DSA_Series.Number_System_Problems;

import java.util.Scanner;
public class AnyBase_To_Decimal {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int result = 0, power = 1;
       while(n>0){
           int rem = n % 10;
            result = power * rem + result;
            power *= b;
            n /=10;
       }
       return result;
   }
}
