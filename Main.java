import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files

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
