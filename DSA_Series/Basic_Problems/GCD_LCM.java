package DSA_Series.Basic_Problems;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class GCD_LCM {
static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int div = n2, divdnt = n1;
        while(divdnt % div!=0){
            int rem = divdnt % div;
            divdnt = div;
            div = rem;
        }
        int gcd = div;
        int lcm = (n1 * n2) / gcd;
        System.out.println(lcm);
        System.out.println(gcd);

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
