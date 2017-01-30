package pagseguro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		int res;
		int _n;
		_n = Integer.parseInt(in.nextLine().trim());

		int _p_size = 0;
		_p_size = Integer.parseInt(in.nextLine().trim());
		int[] _p = new int[_p_size];
		int _p_item;
		for (int _p_i = 0; _p_i < _p_size; _p_i++) {
			_p_item = Integer.parseInt(in.nextLine().trim());
			_p[_p_i] = _p_item;
		}

		res = getUmbrellas(_n, _p);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}

 static void reverse(int[] data) {
	    for (int left = 0, right = data.length - 1; left < right; left++, right--) {
	        int temp = data[left];
	        data[left]  = data[right];
	        data[right] = temp;
	    }
	}
	
	static int getUmbrellas(int n, int[] p) {
		reverse(p);
		
		if(n < 1 || n > 1000) return -1;
		
		int qtd = 0;
		for(int i= 0; i < p.length; i++){
			
			if(p[i] < 1 || p[i] > 1000) continue;
			
			qtd++;
			
			if(p[i] == n) break;
			
		}
		
		if(qtd > 0)return qtd;
		
		return -1;
	}

}
