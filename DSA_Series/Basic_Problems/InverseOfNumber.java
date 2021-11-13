package DSA_Series.Basic_Problems;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class InverseOfNumber {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
        int n = scn.nextInt();
        int result = 0;
        int position = 1;
        while(n>0){
            int rem = n%10;
            int power = (int)Math.pow(10,rem-1);
            result = result + power * position;
            position++;
            n /=10;
        }
        
        System.out.println(result);



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
