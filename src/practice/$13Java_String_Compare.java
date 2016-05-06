package practice;

import java.util.Scanner;

/*
Sample Input

welcometojava 
3

Sample Output

ava
wel

 */

public class $13Java_String_Compare {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int k = sc.nextInt();

        String smallest = "";
        String largest = "";
        for(int i = 0; i < input.length()-k+1;i++){
        	String third = input.substring(i, k+i);
        	
        	if(i==0){
        		smallest = third; 
        		largest = third;
        		continue;
        	}
        	
        	if(third.compareTo(largest)<=0){
        		largest = third;
        	}else if(third.compareTo(smallest)>0){
        		smallest = third;
        	}
        }
        
        System.out.println(largest);        	
        System.out.println(smallest);        	
	}
	
}