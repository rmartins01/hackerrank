package mercadolivre;

public class Class3 {

	public static void main(String[] args) {
		System.out.println(summation(new int[]{5, 1,2,3,4,5}));
	}

	/*
	 * Complete the function below.
	 */

	    static int summation(int[] numbers) {
	        int count = 0;
	        for(int i =0 ;i< numbers.length; i++){
	            if(numbers[i] >= 1 && numbers[i]<=Math.pow(numbers[i], 4)){
	            	count += numbers[i];
	            }
	        }

	        return count;
	    }


	    
}
