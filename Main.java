import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = "";
        for(int i=0;i<n/2;i++){
            str +="a";
        }
        str+="b";
        for(int i=n/2;i<n;i++){
            str +="a";
        }
        System.out.println(str);

        scn.close(); 
    }
}
