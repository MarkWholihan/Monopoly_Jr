/*  Programmers: Mark Wholihan & Alder
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

public class Player {
	private String name;
	private int cash;
	private int loc;
	private Boolean inJail;
	private ArrayList<Card> cards;
	public static final int spaceTotal = 24;
	
	// creates an object of a player
	public Player(String name) {
		name = this.name;
		cash = 16;
		loc = 0;
		getOutOfJailCard = false;
		cards = new ArrayList<Card>();
		ownedProps = new ArrayList<Property>();
	}
	
	// returns players name
	public String getName() {
		return name;
	}
	
	// moves players location
	public int move(int spaces) {
		loc = (spaces + loc) % spaceTotal;
		return loc;
	}
	
	// returns a players location
	public int getLoc() {
		return loc;
	}
	
	// sets a players location
	public void setLoc(int location) {
		loc = location;
	}
	
	// returns players cash amount
	public int getCash() {
		return cash;
	}
	
	// adds cash to the player
	public void addCash(int cash) {
		cash += this.cash;
	}
	
	// subtracts cash from the player
	public void subtractCash(int cash) {
		cash -= this.cash;
	}
	
	// pays another player
	public void payPlayer(Player pay, int amount) {
		payPlayer(amount);
		pay.addCash(amount);
	}
	
	// adds a property to the player
	public void addProperty(Property property) {
		ownedProps.add(property);
	}
	
	// returns players properties
	public ArrayList<Property> getProperties() {
		return ownedProps;
	}
	
	// returns true if player has get out of jail free card
	public Boolean getOutOfJailFreeCard() {
		if(cards.size() > 0) {
			getOutOfJailCard = true;
			cards.remove(cards.size()-1);
			return true;
		}
		else {
			getOutOfJailCard = false;
			return false;
		}
	}
	
	// uses getOutOfJailCard
	public void useCard(Card goojf) {
		cards.add(goojf);
		getOutOfJailCard = true;
	}
	
	// player is in jail
	public void playerInJail() {
		return inJail;
	}
}
