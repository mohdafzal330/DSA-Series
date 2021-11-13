package DSA_Series.Basic_Problems;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Print_Primes_In_Range {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
        int left = scn.nextInt();
        int right = scn.nextInt();

        for(int n=left;n<=right;n++){
            if(n<=1){
                continue;
            }
            boolean isPrime = true;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    isPrime = false; break;
                }
            }
        
            if(isPrime==true){
                System.out.println(n);
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
