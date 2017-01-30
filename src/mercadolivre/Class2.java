package mercadolivre;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int _n;
        _n = Integer.parseInt(in.nextLine().trim());
        
        StairCase(_n);
        
    }

	  static void StairCase(int n) {
	        if(n >=1 && n <=100){
	            for(int i =1; i<= n;i++){
	                System.out.println(espaco(n,sustenido(i)));
	            }
	        }
	    }
	static String espaco(int n, String sustenidos){
	    String ret = "";
	    for(int i =(n-sustenidos.length()); i >= 1; i--){
	        ret = ret+" ";
	    }
	    return ret+sustenidos;
	}

	static String sustenido(int n){
	    String ret = "";
	    for(int i =0; i < n; i++){
	        ret = ret+"#";
	    }
	    return ret;
	}
}

