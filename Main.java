import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files

       int T = scn.nextInt();
       while(T-->0){
           int n = scn.nextInt();
           if(n<=26){
                for(int i=0;i<n;i++){
                    System.out.print((char)('a'+i));
                }
           } else { 
            //    11 = 5a + 12b + 4a
            //    10 = 5a + 1b + 4a 
                StringBuilder sb = new StringBuilder();
                int mid = n/2;
                for(int i=0;i<mid;i++){
                    sb.append('a');
                }
                sb.append('b');
                if(n%2==1){
                    sb.append('c');
                }
                for(int i=0;i<mid-1;i++){
                    sb.append('a');
                }
                System.out.print(new String(sb));
           }
           System.out.println();
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
