package DSA_Series.Strings_SB_ArrayList_Problems;

import java.util.Scanner;
public class Print_Permutation_Iterative {

	public static void solution(String str){
		int lim = fact(str.length());
        for(int i=0;i<lim;i++){
            int len = str.length();
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            while(len>0){
                int rem = temp % len;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp /=len;
                len--;
            }
            System.out.println();
        }
		
	}

    private static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
