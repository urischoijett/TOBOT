import java.util.Arrays;
import java.util.Comparator;

public class Tournament {

	String[] 	formats 	 = {"Swiss", "elimination"};	//possible tournament types
	int 		format 		 = 0;							//selected tournament type
	Player[] 	players;									//list of all players
	int 		numPlayers 	 = 0;							//total number of players
	int			currentRound = 1;
	Match[]		currentMatches;
			
	public Tournament(int f){
		format = f;
		players = new Player[64];
		
	}
	
	public void addPlayer (Player n){
		players[numPlayers] = n;
		numPlayers++;
	}
	
	public void createMatches(){
		if (numPlayers%2 == 1){
			addPlayer(new Player("Bye"));
		}
		currentMatches = new Match[numPlayers/2];
	}
	
	public void sortPlayers(){
//		Arrays.sort(sensorList, new Comparator<Sensor>(){  
//			public int compare(Sensor s1, Sensor s2){  
//		         if (s1.getPos() < s2.getPos()) return -1;
//		         if (s1.getPos() > s2.getPos()) return 1;
//		         return 0;
//		    }  
//		});
	}
	
	
	
	
	
	
	
	
};
