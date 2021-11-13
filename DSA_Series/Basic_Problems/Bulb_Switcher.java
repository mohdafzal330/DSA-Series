package DSA_Series.Basic_Problems;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Bulb_Switcher {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
        int n = scn.nextInt();        
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
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
