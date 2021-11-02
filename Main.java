
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
        setInputOutput();

       int N = scn.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        scn.close(); 
        
    }



    public static void setInputOutput() throws Exception{
        if(useFiles){
            scn = new Scanner(new File("input.txt"));
            System.setOut(new PrintStream(new File("output.txt")));
        } else {
            scn = new Scanner(System.in);
        }

    }
}
