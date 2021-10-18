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
		if (cType.equals("FreeProp")) {
			PropColorPicker();
		}
		
		// if player-specific card, randomly choose player
		if (cType.equals("PlayerSpec")) {
			PlayerPicker();
		}
	}


	// randomly pick property color(s) for free property cards
	String propColor;
	
	public String PropColorPicker() {
		// list of property colors to randomly chose from
		String[] color = new String[7];
		color[0] = "brown";
		color[1] = "cyan";
		color[2] = "pink";
		color[3] = "orange";
		color[4] = "red";
		color[5] = "yellow";
		color[6] = "green";
		color[7] = "blue";
		
		int i = (int)(Math.random()*8);
		propColor = color[i-1];
		return propColor;
	}
	
	public String getPropColor() {
		return propColor;
	}
	
	
	//randomly pick player for player-specific cards
	String playerSpec;
	
	public String PlayerPicker() {
		// list of players to randomly chose from
		String[] player = new String[3];
		player[0] = "Toy Boat";
		player[1] = "Toy Car";
		player[2] = "Little Scottie";
		player[3] = "Little Hazel";
		
		int i = (int)(Math.random()*4);
		playerSpec = player[i-1];
		return playerSpec;
	}
	
	public String getPlayer() {
		return playerSpec;
	}
	
	
	
	
// CHANCE CARD DECK ARRAY ---------------------------------------
	
	public static ChanceCard getChance() {
		int i = (int)(Math.random()*21);
		return deck.get(i-1);
	}
	
	public void ChanceArray(Player currentPlayer, Property currentProperty) {
		
		// advance to color cards
		ChanceCard advanceColor = new ChanceCard("FreeProp", "Advance to"
				+ "a " +PropColorPicker()+ " space. If one is unowned, get it for "
				+ "FREE! If none is unowned, advance to the closest " +getPropColor()
				+ "space and PAY rent to the owner.");
		
		// advance to apple
		ChanceCard advanceApple = new ChanceCard("Advance", "Advance to"
				+ "Apple Store.");
		/* int distance;
		distance = 23-currentPlayer.getLoc();
		Player.move(distance,currentPlayer)); */
		
		// advance 5 spaces
		ChanceCard advanceFive = new ChanceCard("Advance", "Move five "
				+ "spaces ahead.");
		// Player.move(5,currentPlayer);
		
		// advance OR take another chance
		ChanceCard advanceOrChance = new ChanceCard("AdvanceOrChance",
				"Move forward 1 space (A) OR take another Chance card (B).");
		/* String answer = "deeznuts";
	    	while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")) {
		    	answer = kb.next();
				
				if (answer.equalsIgnoreCase("A")) {
					Player.move(1,currentPlayer);
				} else if (answer.equalsIgnoreCase("B") {
					ChanceCard.getChance();
				}
			} */
		
		// advance to GO
		ChanceCard advanceGo = new ChanceCard("Advance",
				"Advance to GO. Collect $2.");
		/* int distance;
		distance = 24-currentPlayer.getLoc(); */
		
		// advance to Frog Island Park
		ChanceCard advancePark = new ChanceCard("Advance", "Advance "
				+ "to Frog Island Park. If no one owns it, get it for "
				+ "FREE! Otherwise, PAY rent to the owner.");
		/* int distance;
		 * if (currentPlayer.getLoc()<10) {
				distance = 10-currentPlayer.getLoc();
			} else {
				distance = (23-currentPlayer.getLoc())+10;
			}
		 * Player.move(distance,currentPlayer);
		 */
		
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
		// currentPlayer.addCash(2);
		
		// lose $2
		ChanceCard lose = new ChanceCard("Lose", "You ate too many sweets! "
				+ "Pay $2 to the Bank.");
		// currentPlayer.subtractCash(2);
		
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
		deck.add(advanceColor);
		deck.add(advanceColor);
		
		deck.add(advanceApple);
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
