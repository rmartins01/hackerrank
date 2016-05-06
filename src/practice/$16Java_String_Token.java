package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
Sample Input

He is a very very good boy, isn't he?

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

 */

public class $16Java_String_Token {

    public static void main(String[] args) 
    {
  
      Scanner scan = new Scanner(System.in);
      String s=scan.nextLine();
      if (s.trim().length()==0 || s.trim().length()>400000)
      {
    	  System.out.println(0);
    	  return;
      }
      
//  	String[] split = ("           YES      leading spaces        are valid,    problemsetters are         evillllll").
  	String[] split = s.
			trim().split("[\\s,?'!_.@]+");
//	String[] split = s.split("[ .,?!']+");
        
    	System.out.println(split.length);
    	for(String s1 : split){
    		System.out.println(s1);
    	}
    }

}