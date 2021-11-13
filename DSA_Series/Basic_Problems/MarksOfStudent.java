package DSA_Series.Basic_Problems;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class MarksOfStudent {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files
        int marks = scn.nextInt();
        if(marks>90){
            System.out.println("excellent");  
        } else if(marks>80 && marks<=90){
            System.out.println("good");  
        } else if(marks>70 && marks<=80){
            System.out.println("fair");  
        } else if(marks>60 && marks<=70){
            System.out.println("meets expectations");  
        } else{
          System.out.println("Not a good performer");  
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
