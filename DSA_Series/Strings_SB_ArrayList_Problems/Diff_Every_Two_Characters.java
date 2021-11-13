package DSA_Series.Strings_SB_ArrayList_Problems;

import java.util.Scanner;
public class Diff_Every_Two_Characters {

	public static String solution(String str){
		String ans = str.charAt(0)+"";
        for(int i=1;i<str.length();i++){
            int a = (str.charAt(i)-'0') - (str.charAt(i-1)-'0');
            ans += a+""+str.charAt(i);
        }
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
