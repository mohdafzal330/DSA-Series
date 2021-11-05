package DSA_Series._2_D_Arrays;

import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = scn.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            int min = a[i][0],minIndex=0;;
            for(int j=1;j<n;j++){
                if(min>a[i][j]){
                    min = a[i][j];
                    minIndex = j;
                }
            }
            int max = 0;
            for(int j=0;j<n;j++){
                if(j!=minIndex){
                    max = Math.max(max,a[j][minIndex]);
                }
            }
            if(max==a[i][minIndex]){
                System.out.println(a[i][minIndex]); return;
            }
        }
        System.out.println("Invalid input");
        scn.close();
    }
}
