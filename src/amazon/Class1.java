package amazon;

import java.util.Arrays;
import java.util.Comparator;

/*
2
2
cruller vegan
eclair chocolate
2
2
jose vegan
john chocolate

john eclair
jose cruller


 * 
 * 
 * 
 */
public class Class1 {

    static String[][] matchDonuts(
    		String[][] donutConstraintPairs, 
    		String[][] candidateConstraintPairs) {
    	
//    	ArrayList<String[]> pairs = new ArrayList<String[]>();
//    	ArrayList<String[]> candidates = new ArrayList<String[]>();
    	String[][] retorno = new String[candidateConstraintPairs.length][2];

//    	jose vegan
//    	john chocolate
    	
//    	john eclair
//    	jose cruller
		
    	int indexCandidate = 0;
    	for(int z = 0; z < candidateConstraintPairs.length; ++z){
    			
    			retorno[indexCandidate][0]= candidateConstraintPairs[z][0];
    	    	stopPairs : for(int i = 0; i < donutConstraintPairs.length; ++i){
    	    		
    	    			
    	    			if(candidateConstraintPairs[z][1].equalsIgnoreCase(donutConstraintPairs[i][1]) ||
    	    					candidateConstraintPairs[z][1].equalsIgnoreCase("*")){
    	    				retorno[indexCandidate][1]= donutConstraintPairs[i][0];
    	    				
    	    				indexCandidate++;
    	    				break stopPairs;
    	    			}
    	    	}
    	}
    	
        Arrays.sort(retorno, new Comparator<String[]>() {

        	public int compare(final String[] entry1, final String[] entry2) {
                final String obj1 = entry1[0];
                final String obj2 = entry2[0];
                return obj1.compareTo(obj2);
            }
        });
    	
    	return retorno;
    	
//    	return new String[][]{ 
//    		{"john", "eclair"}, 
//    		{"jose", "cruller"}
//		};
    }
    
	public static void main(String[] args) {
		
		matchDonuts(new String[][]{ 
    		{"cruller", "vegan"}, 
    		{"eclair", "chocolate"}
		
		},new String[][]{ 
    		{"jose", "vegan"}, 
    		{"john", "chocolate"},
    		{"mary", "*"}
		
		}
				
		);
	}
}
