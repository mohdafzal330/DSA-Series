package DSA_Series.Basic_Problems;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class PythagoresTriplet {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        boolean aSqrs = a*a == b*b + c*c;
        boolean bSqrs = b*b == a*a + c*c;
        boolean cSqrs = c*c == b*b + a*a;

        if(aSqrs || bSqrs || cSqrs){
            System.out.println("Verified");
        } else {
            System.out.println("Un Verified");
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
