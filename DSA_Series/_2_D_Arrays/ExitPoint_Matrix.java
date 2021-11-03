package DSA_Series._2_D_Arrays;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ExitPoint_Matrix {
  static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files

       int rowSize = scn.nextInt();
       int colSize = scn.nextInt();
       int arr[][] = new int[rowSize][colSize];
       for(int i=0;i<rowSize;i++){
           for(int j=0;j<colSize;j++){
               arr[i][j] = scn.nextInt();
           }
       }

       int i=0,j=0;
       int dir = 0; // east
       while(true){
            dir = (dir + arr[i][j]) % 4;

            if(dir==0){ // East
                j++;
            } else if(dir==1){ // South
                i++;
            } else if(dir==2){ // West
                j--;
            } else if(dir==3){ // North
                i--;
            }

            if(i>=rowSize || j>=colSize || i<0 || j<0){
                i = i<0 ? i + 1 : i;
                j = j<0 ? j + 1 : j;
                i = i>=rowSize ? i - 1 : i;
                j = j>=colSize ? j - 1 : j;               

                System.out.println(i+" "+j);
                break;
            }
       }
       

       
        
        scn.close(); // closing scanner resource
    }



    public static void handleInputOutput() throws Exception{
        if(useFiles){
            scn = new Scanner(new File("input.txt"));
            System.setOut(new PrintStream(new File("output.txt")));
        } else {
            scn = new Scanner(System.in);
        }
    }  
}
