package DSA_Series.Basic_Problems;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class RotateANumber {

    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
        int n = scn.nextInt();
        int k = scn.nextInt();
        int count = 0;
        int temp = n;
        while(temp>0){
            count++; temp /=10;
        }
        k = k % count;
        k = k < 0 ? k + count : k;
        int divisor = (int)Math.pow(10,k);
        int pre = n % divisor;
        pre = pre * (int)Math.pow(10,count-k);
        int post = n / divisor;
        int result = pre + post;
        
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
