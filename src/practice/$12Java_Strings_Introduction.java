package practice;

import java.util.Scanner;

/*
Sample Input

 hello
 java
 
Sample Output

9
No
Hello Java

 */

public class $12Java_Strings_Introduction {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) >0){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
        String a = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
        String b = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());
        System.out.println(a +" "+ b);        	
	}
	
}