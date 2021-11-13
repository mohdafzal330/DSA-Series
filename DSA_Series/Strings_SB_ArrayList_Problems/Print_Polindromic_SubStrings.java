package DSA_Series.Strings_SB_ArrayList_Problems;
import java.util.Scanner;
public class Print_Polindromic_SubStrings {

	public static void solution(String str){
		for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPolindromicString(str.substring(i,j))){
                    System.out.println(str.substring(i,j));
                }
            }
        }
		
	}
    static boolean isPolindromicString(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
