import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    static boolean useFiles = true;
    static Scanner scn;
    static class Pair{
        int val; int freq;
        Pair(int val, int freq){
            this.val = val; this.freq = freq;
        }
    }
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files

       String str = scn.next();
       int max = 0;
       for(int i=0;i<str.length();i++){           
           StringBuilder sb = new StringBuilder(str.charAt(i)+"");
           int last = i;
           for(int j=i+1;j<str.length();j++){
                if(sb.indexOf(str.charAt(j)+"")==-1){
                    sb.append(str.charAt(j));
                }
                if(sb.length()==26){
                    last = j; break;
                }
           }
           if(sb.length()==26){
               max = Math.max(max, (last - i) + 1);
           }
       }
       System.out.print(max);
        
       scn.close(); // closing scanner resource
    }
    public static void printString(String str, String asf){
        if(str.length()==0){
            if(isValid(asf)){
                System.out.println(asf);
            }
            return;
        }
        if(isValid(asf)){
            System.out.println(asf);
        }
        char ch = str.charAt(0);
        printString(str.substring(1), asf+ch);
        printString(str.substring(1), asf);
    }

    private static boolean isValid(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(sb.indexOf(str.charAt(i)+"")==0){
                sb.append(str.charAt(i));
            }
        }
        return sb.length()==26 ? true : false;
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
