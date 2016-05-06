package Bookin_Dev_Amsterdam;
import java.util.Scanner;

/*

25626 25757 24367 24267 16 100 2 7277

25626 -128 131 -128 -1390 -100 -128 -24251 84 -98 -128 7275

 */

public class DeltaEncolding {

	static String delta_encode(int[] buffer)
	{
		int length = buffer.length;
		String outPut = "";
	    int last = 0;
	    boolean first = true;
	    for (int i = 0; i < length; i++)
	    {
	        int current = buffer[i];

	        if(first){
	        	outPut = new Integer(current).toString()+" ";
	        	first = false;
	        	continue;
	        }

	        int calc = current - last;
	        if(calc <= -127 || calc >=127){
	        	calc = -128;
	        	outPut += new Integer(calc).toString()+" ";
	        	first = true;
	        }else{
	        	
	        	outPut += new Integer(calc).toString()+" ";
	        }
	        
        	buffer[i] = calc;
	        last = current;
	    }
	    return outPut;	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		String[] split = s.nextLine().split(" ");
		int[] buffer = new int[split.length];
		for(int i =0; i < split.length; i++){
			buffer[i] = new Integer(split[i]); 
		}
		System.out.println(delta_encode(buffer));
//		System.out.println("25626 -128 131 -128 -1390 -100 -128 -24251 84 -98 -128 7275");
		
	}

}
