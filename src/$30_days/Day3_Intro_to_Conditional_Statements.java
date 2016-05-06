package $30_days;

import java.util.Scanner;

/* 
 *  
Sample Input 0

3

Sample Output 0

Weird

Sample Input 1

24

Sample Output 1

Not Weird
 * 
 * 
 */
public class Day3_Intro_to_Conditional_Statements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";
		
		if(n >= 1 && n <=100){
			
			// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
			if (n % 2 == 1) {
				ans = "Weird";
			} else {
				// Complete the code
				
				if(n >= 2 && n <=5)
					ans = "Not Weird";
				else if(n >= 6 && n <=20)
					ans = "Weird";
				else if(n > 20)
					ans = "Not Weird";
				
			}
			System.out.println(ans);
		}
	}

}
