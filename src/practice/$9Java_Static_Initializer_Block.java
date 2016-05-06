package practice;

import java.util.Scanner;

/*
Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
 */

public class $9Java_Static_Initializer_Block {

	static Scanner sc = new Scanner(System.in);
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	static boolean flag = false;
	static{
		
		if(B<=0 || H<=0){
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			System.exit(0);
		}
		
		flag = true;
	}
	
	public static void main(String[] args) {
		
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
