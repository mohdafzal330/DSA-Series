package DSA_Series._1_D_Arrays;

import java.util.Scanner;
public class Ceil_And_Floor {

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
    }
    int d = scn.nextInt();
    int ceil = 0, floor=0;
    int i=0,j=n-1;
    while(i<=j){
        int mid = (i + j) / 2;
        if(a[mid]==d){
            ceil = mid; floor = mid;
            break;
        } else if(a[mid]<d){
            floor = mid;
            i = mid + 1;
        }else {
            ceil = mid;
            j = mid - 1;
        }
    }
    System.out.println(a[ceil]);
    System.out.println(a[floor]);
 }

}
