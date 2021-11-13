package DSA_Series.Strings_SB_ArrayList_Problems;

import java.util.Scanner;
public class ToggleCaseInStrings {


	public static String toggleCase(String str){
		StringBuilder ans = new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(str.charAt(i))){
                ch = Character.toLowerCase(ch);
            } else {
                ch = Character.toUpperCase(ch);
            }
            ans.setCharAt(i,ch);
        }

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}


}
