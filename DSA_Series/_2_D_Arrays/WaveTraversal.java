package DSA_Series._2_D_Arrays;
import java.util.Scanner;
public class WaveTraversal {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();
        int A[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                A[i][j] = scn.nextInt();
            }
        }
        
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(i%2==0){
                    System.out.println(A[j][i]);
                } else {
                    System.out.println(A[row-j-i][i]);
                }                
            }            
        }
         
        scn.close();
    }

}