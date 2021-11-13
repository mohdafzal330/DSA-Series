package DSA_Series.Number_System_Problems;

import java.util.Scanner;
public class AnyBase_To_Anybase {
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int res = getAnyBaseToAnyBase(n,sourceBase,destBase);
     System.out.println(res);
   } 
   static int getAnyBaseToAnyBase(int n,int s, int d){
       int dec = getValueIndecimal(n,s);
       return getValueInAnyBase(dec,d);
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

    public static int getValueInAnyBase(int n, int b){
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
