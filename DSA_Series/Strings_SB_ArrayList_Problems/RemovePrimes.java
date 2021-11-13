package DSA_Series.Strings_SB_ArrayList_Problems;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
       int n = scn.nextInt();
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<n;i++){
            list.add(scn.nextInt());
       }

       for(int i=list.size()-1;i>=0;i--){
           if(isPrime(list.get(i))){
               list.remove(i);
           }
       }
       System.out.print(list);
       

       scn.close(); // closing scanner resource
    }

    private static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
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
