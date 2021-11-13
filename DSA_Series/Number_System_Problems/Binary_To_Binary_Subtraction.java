package DSA_Series.Number_System_Problems;

import java.util.Scanner;
public class Binary_To_Binary_Subtraction {
  
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(2, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       int result=0,power=1,borrow=0;
       while(n1>0 || n2>0 || borrow>0){
           int diff = (n2 % 10) - (n1 % 10) - borrow;
           if(diff<0){
               borrow = 1;
               diff += b;
           } else {
               borrow = 0;
           }
           result = power * diff + result;
           power *= 10;
           n1 /= 10; n2 /= 10;
       }
       return result;
   }
}
