package DSA_Series._1_D_Arrays;

import java.util.Scanner;
public class SubSet_Of_Array {

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
    }
    int total = (int)Math.pow(2,n);
    // System.out.println(n);
    for(int i=0;i<total;i++){
        int bin = getValueInBase(i,2);
        String s = "";
        int len = n;
        while(len>0){
            int rem = bin % 10;
            if(rem==1){
                s = a[len-1] + "\t" + s;
            } else {
                s = "-\t" + s;
            }
            bin /= 10;
            len--;
        }
        System.out.println(s);
    }
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
