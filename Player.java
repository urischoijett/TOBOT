
public class Player {
	private static int all_ids = 100;
	private String 	p_name;
	private int 	p_id;
	
	public Player(String n){
		p_name 	= n;
		p_id = ++all_ids;
	}
	
	public int getId(){
		return p_id;
	}
	public String getName(){
		return p_name;
	}
}
