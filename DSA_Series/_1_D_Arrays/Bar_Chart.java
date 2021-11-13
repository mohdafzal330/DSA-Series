package DSA_Series._1_D_Arrays;

import java.util.Scanner;
public class Bar_Chart {
public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    int max = 0;
    for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
        max = Math.max(max,a[i]);
    }
    for(int i=0;i<max;i++){
        for(int j=0;j<n;j++){
            if(max-i<=a[j]){
                System.out.print("*\t");
            } else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}
