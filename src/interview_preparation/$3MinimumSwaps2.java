package interview_preparation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class $3MinimumSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

    	int maior;
    	int menor = Integer.MAX_VALUE;
    	int numeroMovimentos = 0;
    	ArrayList<Integer> listaNumAnalizado = new ArrayList<Integer>();
    	
    	for(int i=0; true; i++) {
    		
    		if(i>0 && arr[i] < menor) {
    			
    			menor = arr[i];
    			
    			numeroMovimentos++;
    		
    			break;
    		}
    	}
    	
    	
    	return numeroMovimentos;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\desenv\\tmp\\test1.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
