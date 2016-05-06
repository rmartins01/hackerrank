package practice;

import java.util.Scanner;

/*
 * 
Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */
public class $6_Java_Loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		if(t >= 0 && t <= 500){
			
			for(int i = 0; i < t; i++){
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				int n = sc.nextInt();
				
				StringBuilder sb = new StringBuilder();
				if(a >=0 && a<= 50 && b >=0 && b<= 50){
					
					if(n >= 1 && n <= 15){
						
				        int temp = 0;
				        temp = (a+b);
				        sb.append(temp+" ");
				        for(int j=1;j<n;j++){
				            int power = (int) Math.pow(2, j);
				            temp = temp + (b*power);
				            sb.append(temp+" ");
				        }
					}
				}
				
				System.out.println(sb.toString());//imprimir cada caso de teste
			}
		}
	}

}
