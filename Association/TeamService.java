package Association;
import java.util.Scanner;


public class TeamService {
	public static void main(String[] args) {
		//Enter how many teams that you want to create
		//Enter the num,ber of player  in each team
		
		//search player by team name and jersey number
		//search for caption in each team
		//display all 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of teams that you want to create!!");
		int number_of_teams = scan.nextInt();
		
		System.out.println("Enter the number of players that you wish to enter in each team");
		int number_of_players = scan.nextInt();
		Team t1 = new Team(number_of_players);
		
		
		Team t[] = new Team[number_of_teams];
		
		int i=0;
		while(i<number_of_teams) {
			System.out.println("Enter name of team "+(i+1));						
			String tname = scan.next();
			t[i] = new Team(tname);
			//System.out.println(t[i]);
			i++;
		}
		
		System.out.println(t[0]);
		scan.close();
		
		
		
	}
}
