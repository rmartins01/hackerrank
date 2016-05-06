package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Sample Input

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50

 */

public class $11Java_Comparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player player[] = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}
class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		
		if(p1.score >= 0 && p1.score <= 1000 && 
				p2.score >= 0 && p2.score <= 1000){
			
			if(p1.score != p2.score){
				
				return new Integer(p2.score).compareTo(p1.score);
			}
			
			return p1.name.toLowerCase().compareTo(p2.name.toLowerCase());
		}
		
		return 0;
	}
	
}