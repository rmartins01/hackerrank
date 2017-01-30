package mercadolivre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int quantidade = s.nextInt();
		List<char[]> todosOsArrays = new ArrayList<char[]>();
		if (quantidade >= 1 && quantidade <= 100) {
			for(int i=0; i < quantidade; i++){
				char[] charArray = s.next().toCharArray();
				if(charArray != null && charArray.length >=1 && charArray.length <= 100){
					todosOsArrays.add(charArray);
				}
			}

			System.out.println(buscaQuantidadeElementosPreciosos(todosOsArrays));
		}else{
			System.out.println(0);
		}
		s.close();
	}
	
	static int buscaQuantidadeElementosPreciosos(List<char[]> todosOsArrays){
		
		int qtd = 0;
		int qtdTotal = 0;
		HashSet<Character> listaLetrasPreciosas = new HashSet<Character>();
		
		for(int i=0;i < todosOsArrays.size();i++){

			char[] composicaoPedra = todosOsArrays.get(i);
					
			for(int j=0;j<composicaoPedra.length;j++){
				
				char letra = composicaoPedra[j];
				
				for(int x=0;x < todosOsArrays.size();x++){
					
					if(i == x) continue;//não compara com a própria lista
					
					char[] composicaoPedraComparacao = todosOsArrays.get(x);
					
					for(int x2=0;x2<composicaoPedraComparacao.length;x2++){
						
						char letraComparacao = composicaoPedraComparacao[x2];
						
						if(new Character(letra).equals(new Character(letraComparacao))){
							qtd++;
							break;
						}
					}
				}
				if(!listaLetrasPreciosas.contains(letra) && qtd == (todosOsArrays.size()-1)){
					listaLetrasPreciosas.add(new Character(letra));
					qtdTotal++;
				}
				qtd=0;
				
			}
		}
		
		return qtdTotal;
	}
}
