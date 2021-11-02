import java.util.Scanner;

public class RotateBy90{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int rows = scn.nextInt();
    int cols = scn.nextInt();
    int arr[][] = new int[rows][cols];

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j] = scn.nextInt();
        }
    }
    // Transpose
    for(int i=0;i<rows;i++){
        for(int j=i;j<cols;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }  
    // Reverse all the rows
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols/2;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[i][cols-j-1];
            arr[i][cols-j-1] = temp;
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    } 
    scn.close();
 }

}