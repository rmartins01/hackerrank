package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
Sample Input 1

anagram
margana

Sample Output 1:

Anagrams

Sample Input 2

anagramm
marganaa

Sample Output 2:

Not Anagrams

 */

public class $15Java_Anagrams {

	static boolean isAnagram(String A, String B) {
		// Complete the function
		
		if(B.length() != A.length())
			return false;
			
		B = B.toLowerCase();
		A = A.toLowerCase();
		
		int length = A.length();
		for(int i = 0; i < length; i++){
			
			if(B.length() == 0 && i-1 == length)
				return false;

			String letter = new Character(A.charAt(i)).toString().toLowerCase();
			
			if(!B.contains(letter)){
				return false;
			}
			
			B = B.replaceFirst(letter, "");
		}
		
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}

}