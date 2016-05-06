package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Sample Input

5
Goodbye bye bye world world world
Swapnil went went to to to his business
Rana is is the the best player in eye eye game
in inthe
Hello hello Ab aB

Sample Output

Goodbye bye world
Swapnil went to his business
Rana is the best player in eye game
in inthe
Hello Ab

 */

public class $19Java_Regex2_Duplicate_Words {

    public static void main(String[] args){

    	String pattern = "\\b(?<word>\\w+)(\\s+\\k<word>\\b)+";
    	Pattern r = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
    	 
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
//        if(testCases <= 1 || testCases <=100){
//        	System.exit(0);
//        }
        
        while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                input = input.replaceAll(m.group(),m.group("word"));
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}

