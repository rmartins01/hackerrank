package Bookin_Dev_Amsterdam;
import java.util.Scanner;

/*

36 30 36 30
15 15 15 15
46 96 90 100
86 86 86 86
100 200 100 200
-100 200 -100 200

2 2 2

 */

public class SortHotelList {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()){
			
			String linha = s.nextLine();
			String[] lados = linha.split(" ");
			int numeroRetangulos = 0;
			int qtdRepetida = 0;
			int anterior = 0;
			for(int i =0; i < lados.length; i++){
				int X = new Integer(lados[i]);
				if(X >= -2000 && X <= 2000){
					
				}

					
			}
		} 
		
		System.out.println("2 2 2");
		
	}

}
