package DSA_Series._2_D_Arrays;
import java.util.Scanner;

public class SpiralDisplay{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    
    int rows = scn.nextInt();
    int cols = scn.nextInt();
    int a[][] = new int[rows][cols];

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            a[i][j] = scn.nextInt();
        }
    }
    
    int total = rows * cols;
    int count=1;
    int minR = 0,minC = 0;
    int maxR = rows-1, maxC = cols-1;
    while(count<=total){
        for(int i=minR;i<=maxR && count<=total;i++){
            System.out.println(a[i][minC]);
            count++;
        }
        minC++;
        for(int j=minC;j<=maxC && count<=total;j++){
            System.out.println(a[maxR][j]);
            count++;
        }
        maxR--;
        for(int i=maxR;i>=minR && count<=total;i--){
            System.out.println(a[i][maxC]);
            count++;
        }
        maxC--;
        for(int j=maxC;j>=minC && count<=total;j--){
            System.out.println(a[minR][j]);
            count++;
        }
        minR++;

    }
    scn.close();
 }

}