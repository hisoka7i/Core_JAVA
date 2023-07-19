package Association;

public class Player {

	private String pname;
	private int jerseyNumber;
	
	public Player(String pname, int jerseyNumber) {
		this.pname = pname;
		this.jerseyNumber = jerseyNumber;
	}
	public Player(){}
	//declaring getter and setters

	public String getPame() {
		return this.pname;
	}
	public int jerseyNumber() {
		return this.jerseyNumber;
	}
	

	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	public String toString() {
		String str = "";
		str = str + "Name of the player is: "+this.pname+" and his jersey number is:"+this.jerseyNumber;
		return str;
	}
	
	
}
