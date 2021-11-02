package DSA_Series._2_D_Arrays;
import java.util.Scanner;

public class MatrixAddition {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int rowSizeA = scn.nextInt();
    int coldSizeA = scn.nextInt();

    int a[][] = new int[rowSizeA][coldSizeA];
    for(int i=0;i<rowSizeA;i++){
      for(int j=0;j<coldSizeA;j++){
        a[i][j] = scn.nextInt();
      }
      
    }
    int rowSizeB = scn.nextInt();
    int colSizeB = scn.nextInt();
    int b[][] = new int[rowSizeB][colSizeB];

    for(int i=0;i<rowSizeB;i++){
      for(int j=0;j<colSizeB;j++){
        b[i][j] = scn.nextInt();
      }
    }

    int c[][] = new int[rowSizeA][coldSizeA];
    for(int i=0;i<rowSizeA;i++){
      for(int j=0;j<coldSizeA;j++){
        c[i][j] =  a[i][j] + b[i][j];
      }
    }

    for(int i=0;i<rowSizeA;i++){
      for(int j=0;j<coldSizeA;j++){
        System.out.print(c[i][j]+" ");
      }
      System.out.println();
    }

    scn.close();
  }  
}




