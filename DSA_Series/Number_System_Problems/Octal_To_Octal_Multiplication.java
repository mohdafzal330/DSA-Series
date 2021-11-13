package DSA_Series.Number_System_Problems;

import java.util.Scanner;
public class Octal_To_Octal_Multiplication {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(8, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int num){
     int result = 0, multiplier = 1;
     while(n1>0){
         int d1 = n1 % 10, carry = 0,power=1, res=0;
         int n2 = num;
         while(n2>0 || carry>0){
             int d2 = n2 % 10;
             int mul = (d1 * d2) + carry;
             carry = mul / b;
             mul = mul % b;
             res = power * mul + res;
             power *= 10;
             n2 /= 10;
         }
         n1 /= 10;
         result = getSum(b, result,res * multiplier);
         multiplier *= 10;
     }
     return result;
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
