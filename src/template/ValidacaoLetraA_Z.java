package template;
import java.util.Scanner;

public class ValidacaoLetraA_Z {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println(containsOnlyLettersBetweenA_Z(sc.next().toLowerCase()));
		
		sc.close();
	}
	
	public static boolean containsOnlyLettersBetweenA_Z(String word){
		
		if (word.length() >= 1 && word.length() <= 100000) {
			
			for (int x = 0; x < word.length(); x++) {
				char letter = word.charAt(x);
				
				boolean valido = false;
				for (char ch = 'a'; ch <= 'z'; ch++) {
					if (new Character(letter).equals(ch)) {
						valido = true;
						break;
					}
				}
				
				if (!valido) {
					return false;
				}
			}
		}		
		
		return true;
	}

}
