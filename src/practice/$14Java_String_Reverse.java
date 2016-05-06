package practice;

import java.util.Scanner;

/*
Sample Input

madam

Sample Output

Yes

 */

public class $14Java_String_Reverse {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        StringBuilder sb = new StringBuilder();
        for(int i = A.length()-1; i >= 0; i--){
        	sb.append(A.charAt(i));
        }

        if(A.equalsIgnoreCase(sb.toString()))
        	System.out.println("Yes");
        else
        	System.out.println("No");        	
	}
	
}