package template;
import java.util.Scanner;

public class IfLimitandoPotencia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        Integer A = new Double(sc.next().trim()).intValue();
        Integer B = new Double(sc.next().trim()).intValue();
        
		if(A >= 1 && A<=B && B<=Math.pow(A, 9)){
			System.out.println("Está dentro");
		}else{
			System.out.println("Está fora");
		}
		
		sc.close();
	}

}
