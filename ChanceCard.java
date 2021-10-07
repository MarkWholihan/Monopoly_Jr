import java.util.ArrayList;
import java.util.Random;

public class ChanceCard {
	
// CARD TEMPLATE ---------------------------------------------------
	private String cardType;
	private String cardDesc;
	
	Random random = new Random();
	
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
	private String propColor;
	
	public void PropColorPicker() {
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
		propColor = color[i];
	}
	
	
	//randomly pick player for player-specific cards
	private String playerName;
	
	public void PlayerPicker() {
		// list of players to randomly chose from
		String[] player = new String[3];
		player[0] = "Toy Boat";
		player[1] = "Toy Car";
		player[2] = "Little Scottie";
		player[3] = "Little Hazel";
		
		int i = (int)(Math.random()*3);
		playerName = player[i];
	}
	
	
	
	
// CHANCE CARD DECK ARRAY ---------------------------------------
	public void ChanceArray() {
		
		// advance to color cards
		ChanceCard advanceColor = new ChanceCard("FreeProp", "Advance to a "
				+propColor+ " space. If one is unowned, get it for "
				+ "FREE! If none is unowned, advance to the closest "
				+propColor+ " space and PAY rent to the owner.");
		
		// advance to boardwalk
		ChanceCard advanceBoardwalk = new ChanceCard("Advance", "Advance to"
				+ "Boardwalk");
		
		// advance 5 spaces
		ChanceCard advanceFive = new ChanceCard("Advance", "Move five "
				+ "spaces ahead.");
		
		// advance OR take another chance
		ChanceCard advanceOrChance = new ChanceCard("AdvanceOrChance",
				"Move forward 1 space OR take another Chance card.");
		
		// advance to GO
		ChanceCard advanceGo = new ChanceCard("Advance",
				"Advance to GO. Collect $2.");
		
		// advance to Frog Island Park
		ChanceCard advancePark = new ChanceCard("Advance", "Advance "
				+ "to the Skate Park. If no one owns it, get it for "
				+ "FREE! Otherwise, PAY rent to the owner.");
		
		// get out of jail free card
		ChanceCard gtfoJail = new ChanceCard("GetOutOfJailFree",
				"Get out of jail free. Keep this card until you need it.");
		
		// gain $2
		ChanceCard gainHomework = new ChanceCard("Gain", "You did all your homework! "
				+ "Collect $2 from the Bank.");
		ChanceCard gainBirthday = new ChanceCard("Gain", "It’s your birthday! "
				+ "Collect $2 from the Bank. Happy Birthday!");
		
		// lose $2
		ChanceCard lose = new ChanceCard("Lose", "You ate too many sweets! "
				+ "Pay $2 to the Bank.");
		
		// player-specific cards
		ChanceCard playerSpec = new ChanceCard("PlayerSpec", playerName+
				": On your next turn, sail forward to any unowned property,"
				+ "and buy it. If all are owned, buy the closest property"
				+ "not owned by " +playerName+ " from the owner! Owner MUST "
				+ "sell.");
		
		ArrayList<ChanceCard> deck = new ArrayList<ChanceCard>();
		
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
		deck.add(gtfoJail);
		deck.add(gainHomework);
		deck.add(gainBirthday);
		deck.add(lose);
		
		deck.add(playerSpec);
		deck.add(playerSpec);
		deck.add(playerSpec);
		deck.add(playerSpec);
	}
}
