package DSA_Series.Basic_Problems;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintNumberInCorrectOrder {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
        int n = scn.nextInt();

        int count=0; int temp = n;
        while(temp>0){
            temp/=10;
            count++;
        }
        int divisor = (int)Math.pow(10,count-1);
        while(n>0){
            int q = n / divisor;
            System.out.println(q);
            n = n % divisor;
            divisor /=10;
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
