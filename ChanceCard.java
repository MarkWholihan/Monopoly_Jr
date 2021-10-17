import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ChanceCard {
	
// CARD TEMPLATE ---------------------------------------------------
	private String cardType;
	private String cardDesc;
	static ArrayList<ChanceCard> deck = new ArrayList<ChanceCard>();
	
	Random random = new Random();
	Scanner kb = new Scanner(System.in);
	
	public ChanceCard(String cType, String cDesc) {
		cardType = cType;
		cardDesc = cDesc;
		
		// if free property card, pick random color/ color set
		if (cType.equalsIgnoreCase("FreeProp")) {
			PropColorPicker();
		}
		
		// if player-specific card, randomly choose player
		if (cType.equalsIgnoreCase("PlayerSpec")) {
			PlayerPicker();
		}
	}


	// randomly pick property color(s) for free property cards	
	public String PropColorPicker() {
		// list of property colors to randomly chose from
		String[] color = new String[6];
		color[0] = "cyan or red";
		color[1] = "orange or green";
		color[2] = "pink or blue";
		color[3] = "red";
		color[4] = "cyan";
		color[5] = "orange";
		color[6] = "brown or yellow or blue";
		
		int i = (int)(Math.random()*6);
		return color[i];
	}
	
	
	//randomly pick player for player-specific cards	
	public String PlayerPicker() {
		// list of players to randomly chose from
		String[] player = new String[3];
		player[0] = "Toy Boat";
		player[1] = "Toy Car";
		player[2] = "Little Scottie";
		player[3] = "Little Hazel";
		
		int i = (int)(Math.random()*3);
		
		return player[i];
	}
	
	
	
	
// CHANCE CARD DECK ARRAY ---------------------------------------
	
	public static ChanceCard getChance() {
		int i = (int)(Math.random()*19);
		return deck.get(i);
	}
	
	public void ChanceArray(Player currentPlayer, Property currentProperty) {
		
		// advance to color cards
		ChanceCard advanceColor = new ChanceCard("FreeProp", "Advance to a "
				+PropColorPicker()+ " space. If one is unowned, get it for "
				+ "FREE! If none is unowned, advance to the closest "
				+PropColorPicker()+ " space and PAY rent to the owner.");
		
		// advance to boardwalk
		ChanceCard advanceBoardwalk = new ChanceCard("Advance", "Advance to"
				+ "Boardwalk");
		
		// advance 5 spaces
		ChanceCard advanceFive = new ChanceCard("Advance", "Move five "
				+ "spaces ahead.");
		
		// advance OR take another chance
		ChanceCard advanceOrChance = new ChanceCard("AdvanceOrChance",
				"Move forward 1 space OR take another Chance card.");
		////////// started coding but  realized it's not properly attached to the ChanceCard object
		/////// String answer = kb.next();
		/////// if answer
		
		// advance to GO
		ChanceCard advanceGo = new ChanceCard("Advance",
				"Advance to GO. Collect $2.");
		
		// advance to Frog Island Park
		ChanceCard advancePark = new ChanceCard("Advance", "Advance "
				+ "to the Skate Park. If no one owns it, get it for "
				+ "FREE! Otherwise, PAY rent to the owner.");
		
		// get out of jail free card
		ChanceCard getOutOfJailCard = new ChanceCard("GetOutOfJailFree",
				"Get out of jail free. Keep this card until you need it.");
		
		// NEED TO CONNECT TO CARD SO IT ACTUALLY AFFECTS YOU WHEN TAKEN???
		currentPlayer.cards.add("getOutOfJailCard");
		
		// gain $2
		ChanceCard gainHomework = new ChanceCard("Gain", "You did all your homework! "
				+ "Collect $2 from the Bank.");
		ChanceCard gainBirthday = new ChanceCard("Gain", "It’s your birthday! "
				+ "Collect $2 from the Bank. Happy Birthday!");
		
		// lose $2
		ChanceCard lose = new ChanceCard("Lose", "You ate too many sweets! "
				+ "Pay $2 to the Bank.");
		
		// player-specific cards
		ChanceCard playerSpec = new ChanceCard("PlayerSpec", PlayerPicker()+
				": On your next turn, sail forward to any unowned property,"
				+ "and buy it. If all are owned, buy the closest property"
				+ "not owned by you from the owner! Owner MUST "
				+ "sell.");
				
		deck.add(advanceColor);
		deck.add(advanceColor);
		deck.add(advanceColor);
		deck.add(advanceColor);
		deck.add(advanceColor);
		deck.add(advanceColor);
		deck.add(advanceColor);
		
		deck.add(advanceBoardwalk);
		deck.add(advanceFive);
		deck.add(advanceOrChance);
		deck.add(advanceGo);
		deck.add(advancePark);
		deck.add(getOutOfJailCard);
		deck.add(gainHomework);
		deck.add(gainBirthday);
		deck.add(lose);
		
		deck.add(playerSpec);
		deck.add(playerSpec);
		deck.add(playerSpec);
		deck.add(playerSpec);
	}
}
