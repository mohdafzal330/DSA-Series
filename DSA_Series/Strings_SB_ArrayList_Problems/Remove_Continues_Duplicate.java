package DSA_Series.Strings_SB_ArrayList_Problems;
import java.util.Scanner;
public abstract class Remove_Continues_Duplicate {

	public static String duplicateRemover(String str){
		String ans = str.charAt(0)+"";
        char p = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(p!=str.charAt(i)){
                ans += str.charAt(i);
            }
            p = str.charAt(i);
        }

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(duplicateRemover(str));
	}

}
