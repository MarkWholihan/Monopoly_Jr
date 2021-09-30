/*  Programmers: Mark Wholihan & Alder
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

public class Player {
	private String name;
	private int cash;
	private int loc;
	private ArrayList<Card> cards;
	private Boolean inJail;
	public static final int spaceTotal = 24;
	
	// creates an object of Player
	public Player(String name, int num) {
		name = this.name;
		cash = 16;
		ownedProps = new ArrayList<Property>();
		loc = 0;
		getOutOfJailCard = false;
		cards = new ArrayList<Card>();
	}
	
	// returns the player number
	public int getNumber() {
		return number;
	}
	
	// returns players name
	public String getName() {
		return name;
	}
	
	// moves Player location
	public int move(int spaces) {
		int loc1 = getLoc();
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
	
	// adds cash
	public void addCash(int cash) {
		cash += this.cash;
	}
	
	// subtracts cash
	public void subtractCash(int cash) {
		cash -= this.cash;
	}
	
	// pays another Player
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
