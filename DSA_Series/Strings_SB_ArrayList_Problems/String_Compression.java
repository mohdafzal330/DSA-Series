package DSA_Series.Strings_SB_ArrayList_Problems;

import java.util.Scanner;
public class String_Compression {


	public static String compresString(String str){
		String ans = str.charAt(0)+"";
        char p = str.charAt(0); int count=1;
        for(int i=1;i<str.length();i++){
            if(p==str.charAt(i)){
                count++;
            } else {
                if(count>1){
                    ans += count;    
                }
                ans += str.charAt(i);
                count=1;
            }
            p = str.charAt(i);
        }
        if(count>1){
            ans += count;
        }
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compresString(str));
	}

}
