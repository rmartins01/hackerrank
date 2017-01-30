package mercadolivre;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int quantidade = s.nextInt();
		if (quantidade >= 1 && quantidade <= 100) {
			for(int i=0; i < quantidade; i++){
				int A = s.nextInt();
				int B = s.nextInt();

				if(A >=1 && A <= B && B <= Math.pow(10, 9)){
					int contador = 0;
					if(isQuadradoPerfeito(A)){
						contador++;
					}
					if(isQuadradoPerfeito(B)){
						contador++;
					}
					System.out.println(contador);
				}
			}

		}else{
			System.out.println(0);
		}
		s.close();
	}
	
	private static boolean isQuadradoPerfeito(int num) {
		int num2 = (int)Math.sqrt(num);
		
		if(num == Math.pow(num2, 2)){
			return true;
		}else{
			return false;
		}
	}
}
