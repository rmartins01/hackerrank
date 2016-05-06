package $30_days;

import java.util.Scanner;

/* 
 *  
Sample Input  

12,00
20
8

Sample Output

The total meal cost is 15 dollars.
 * 
 * 
 */
public class Day2_Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double numberToRoundHere = mealCost + (mealCost*tipPercent/100) +(mealCost*taxPercent/100);
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(numberToRoundHere);
        System.out.println("The total meal cost is "+totalCost+" dollars.");
        // Print your result
    }

}
