package DSA_Series._2_D_Arrays;

import java.util.Scanner;

public class Searching_Sorted_2_D_Array {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = scn.nextInt();
            }
        }
        int d = scn.nextInt();
        
        int i=0,j=n-1;
        while(i<n && j>0){
            if(a[i][j]>d){
                j--;
            } else if(a[i][j]<d){
                i++;
            } else {
                System.out.println(i);
                System.out.println(j); return;
            }
        }
        System.out.println("Not Found");
        scn.close();
    }

}
