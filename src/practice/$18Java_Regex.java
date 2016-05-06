package practice;

import java.util.Scanner;

/*
Sample Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Sample Output

true
true
true
false
false
false
 */

public class $18Java_Regex {

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}

class myRegex{
	
	String pat = "([0-9]{1,2}|0"
			+ "[0-9][0-9]|1"
			+ "[0-9][0-9]|2"
			+ "[0-4][0-9]|25"
			+ "[0-5])";
	
	public String pattern = pat+"."+pat+"."+pat+"."+pat; 
}