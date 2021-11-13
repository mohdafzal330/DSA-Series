package DSA_Series._1_D_Arrays;
import java.util.Scanner;

public class Linear_Search{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
    }
    int d = scn.nextInt();
    for(int i=0;i<n;i++){
        if(a[i]==d){
            System.out.println(i); return;
        }
    }
    System.out.println(-1);
 }

}