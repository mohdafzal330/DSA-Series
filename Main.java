import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Pattern - 15
        int space=n/2,star=1;
        for(int i=1;i<=n;i++){
            int val = i<=n/2 ? i : n-i+1;
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print(val+"\t");
                if(j<=star/2){
                    val++;
                } else {
                    val--;
                }                
            }

            if(i<=n/2){
                space--; star+=2;
            } else {
                space++; star-=2;
            }

            System.out.println();
        }   
    }

}