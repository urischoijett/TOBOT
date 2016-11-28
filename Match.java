
public class Match {
	int num_rounds;
	int p1;				//player 1 id
	int p2;				//player 2 id
	
	int p1_wins	= 0;
	int p2_wins = 0;
	int ties	= 0;
	
	public Match(int n, int a, int b){
		num_rounds 	= n;
		p1 			= a;
		p2 			= b;
	}
	
	public void report(int a, int b, int c){
		p1_wins = a;
		p2_wins = b;
		ties 	= c;
	}
	
	//returns id of winner or 0 on tie.
	public int getWinner(){
		if 	(p1_wins == p2_wins){
			return 0;
		} else if (p1_wins >=p2_wins) {
			return p1;
		} else {
			return p2;
		}
	}
}

