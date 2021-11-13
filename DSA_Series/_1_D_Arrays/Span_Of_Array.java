package DSA_Series._1_D_Arrays;

import java.util.Scanner;
public class Span_Of_Array {

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
    }
    int min = Integer.MAX_VALUE, max = 0;
    for(int i=0;i<n;i++){
        min = Math.min(min,a[i]);
        max = Math.max(max,a[i]);
    }
    System.out.println(max-min);
 }  

}
