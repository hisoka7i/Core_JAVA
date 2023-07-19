package Association;
import java.util.Scanner;


public class Team {
	private String tname;
	private static int tid=0;
	private Player player_info[]; 
	private Player captain;
	private int size;
	
	Scanner scan = new Scanner(System.in);
	public Team(int size) {
		this.size=size;
		//System.out.println(player_info.length);
	}
	
	
	public Team(String tname) {
		this.player_info = new Player[size];
		this.tname = tname;
		tid++;
		this.tid = tid;
		
		System.out.println("Enter Information of captain:");
		System.out.println("Enter name of captain:");
		String cap_name = scan.next(); 
		this.captain = new Player();
		this.captain.setPname(cap_name);
		System.out.println("Enter the jersey number of the captain");
		int j = scan.nextInt();
		this.captain.setJerseyNumber(j);
		System.out.println(player_info.length);
		int i=0;
		while(i<player_info.length) {
		System.out.println("Enter the information of the players:");
		System.out.println("Enter the name of player");
		String play_name = scan.next();
		System.out.println("Enter the jersey Number");
		int jer_num = scan.nextInt();
		this.player_info[i] = new Player(play_name,jer_num);
		i++;
		}
	}
	
	public void add_team() {
		
	}
	
	//Declaring setter and getters
 
	public String getTname() {
		return this.tname;
	}
	public int getTid() {
		return tid;
	}
	public void setTname(String tname) {
		//this(tname);
		this.tname = tname;
	}
	
	public String toString() {
		int i=0;
		
		System.out.println(this.captain.getPame());
		String str="";
		while(i<this.player_info.length) {
			str = str + this.player_info[i].toString()+"/n";
			i++;
		}       
		System.out.println(str);
		return "Name of the team is: "+tname+" and team id is: "+tid;		
	}
	
}
