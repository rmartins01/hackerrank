package mercadolivre;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int quantidade = s.nextInt();

		if (quantidade >= 1 && quantidade <= 10) {

			for(int i=0; i < quantidade; i++){
				String seq1 = s.next();
				if(seq1 != null && seq1.length() <= 100000){
					System.out.println(buscaSemelhanca(seq1));
				}
			}
		}else{
			System.out.println(0);
		}
		s.close();
		System.exit(0);
	}
	
	static int buscaSemelhanca(String seq1){
		int qtd = seq1.length();
		String strComparacao =seq1.trim();
		for(int i=1;i < seq1.length();i++){//cada letra da String entrada

			strComparacao = seq1.substring(i, seq1.length());
			
			for(int j=0;j<strComparacao.length();j++){//cada letra da palavra de comparação
				
				char charAt = seq1.charAt(j);
				char charAt2 = strComparacao.charAt(j);
				
				if(new Character(charAt).equals(new Character(charAt2))){
					qtd++;
				}else{
					break;
				}
			}
		}
		
		return qtd;
	}

}
