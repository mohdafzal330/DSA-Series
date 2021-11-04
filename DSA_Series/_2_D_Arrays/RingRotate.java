package DSA_Series._2_D_Arrays;

import java.util.Scanner;

public class RingRotate {
        public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        int arr[] = getOneDFromShell(a,s);
        rotate(arr,r);
        fillTwoDShellFromOneD(a,arr,s);
        display(a);
    }
    
    static int[] getOneDFromShell(int[][] a, int s){
        int rmin=s-1, cmin=s-1;
        int rmax=a.length-s, cmax=a[0].length-s;
        int oneDLength = 2 * (rmax - rmin) + 2 * (cmax-cmin);
        
        if(rmin==rmax){
            int id=0;
            int oneD[] = new int[cmax-rmax+1];
            for(int i=cmin;i<=cmax;i++){
                oneD[id++] = a[rmax][i];
            }
            return oneD;
        }
        
        
        int oneD[] = new int[oneDLength];
        int idx=0;
        for(int i=rmin;i<=rmax;i++){
            oneD[idx++] = a[i][cmin];
        }
        cmin++;
        for(int j=cmin;j<=cmax;j++){
            oneD[idx++] = a[rmax][j];
        }
        rmax--;
        for(int i=rmax;i>=rmin;i--){
            oneD[idx++] = a[i][cmax];
        }
        cmax--;
        for(int j=cmax;j>=cmin;j--){
            oneD[idx++] = a[rmin][j];
        }
        rmin++;
        return oneD;
    }
   
    static void fillTwoDShellFromOneD(int[][] a, int[] oneD, int s){

        int rmin=s-1, cmin=s-1;
        int rmax=a.length-s, cmax=a[0].length-s;
        int oneDLength = 2 * (rmax - rmin) + 2 * (cmax-cmin);
        
        int idx=0;
        if(rmin==rmax){
           
            for(int i=cmin;i<=cmax;i++){
               a[rmax][i] = oneD[idx++];
            }
            return;
        }
        for(int i=rmin;i<=rmax;i++){
            a[i][cmin] = oneD[idx++];
        }
        cmin++;
        for(int j=cmin;j<=cmax;j++){
             a[rmax][j] = oneD[idx++];
        }
        rmax--;
        for(int i=rmax;i>=rmin;i--){
            a[i][cmax] = oneD[idx++];
        }
        cmax--;
        for(int j=cmax;j>=cmin;j--){
            a[rmin][j] = oneD[idx++];
        }
        rmin++;
    }
    
    static void rotate(int[] a, int r){
        r = r % a.length;
        r = r<0 ? r + a.length : r;
        
        reverse(a,0,a.length-r-1);
        reverse(a,a.length-r,a.length-1);
        reverse(a,0,a.length-1);
    }
    
    static void reverse(int[] a, int start, int end){
        while(start<=end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++; end--;
        }
    }


    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
