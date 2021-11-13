package DSA_Series._1_D_Arrays;

import java.util.Scanner;
public class Sum_Of_Two_Arrays {

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a[] = new int[n1];
    for(int i=0;i<n1;i++){
        a[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int b[] = new int[n2];
    for(int i=0;i<n2;i++){
        b[i] = scn.nextInt();
    }
    int k = Math.max(n1,n2)+1;
    int res[] = new int[k];
    int result=0,power=1,carry=0;
    while(n1>0 || n2>0 || carry>0){
        int d1 = n1>0 ? a[n1-1] : 0;
        int d2 = n2>0 ? b[n2-1] : 0;

        int sum = d1 + d2 + carry;
        carry = sum / 10;
        res[k-1] = sum%10;
        power *= 10;
        n1--; n2--; k--;

    }
    for(int i=k;i<res.length;i++){
        System.out.println(res[i]);
    }
 }

}
