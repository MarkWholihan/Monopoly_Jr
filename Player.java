/*  Programmers: Mark Wholihan & Alder
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */
import java.util.*;

public class Player {
	private String name;
	private int cash;
	private int location;
	private Boolean inJail;
	public Boolean getOutOfJailCard;
	private ArrayList<Chance> cards;
	private ArrayList<Property> ownedProperties;
	public static final int spaceTotal = 24;

	// constructs an object of player
	public Player(String name) {
		this.name = name;
		cash = 16;
		location = 0;
		getOutOfJailCard = false;
		cards = new ArrayList<Chance>();
		ownedProperties = new ArrayList<Property>();
	}

	//  returns information about this player as a string
	public String toString() {
		String result = ("Name: " + name + "\nCash: " + cash + "\nLocation: " + location + "\nHas get out of jail free card? " + getOutOfJailCard + "\nProperties owned: " + ownedProperties);

		return result;
	}
	
	// returns players name
	public String getName() {
		return this.name;
	}

	// moves players location
	public int move(int spaces) {
		location = (spaces + location) % spaceTotal;
		return location;
	}

	// returns a players location
	public int getLoc() {
		return location;
	}

	// sets a players location
	public void setLoc(int location) {
		location = this.location;
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
	public void payPlayer(Player payee, int amount) {
		subtractCash(amount);
		payee.addCash(amount);
	}

	// adds a property to the player
	public void addProperty(Property property) {
		ownedProperties.add(property);
	}

	// returns players properties
	public ArrayList<Property> getProperties() {
		return ownedProperties;
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
	public void useCard(Chance goojf) {
		cards.add(goojf);
		getOutOfJailCard = true;
	}

	// player is in jail
	public Boolean playerInJail() {
		return inJail;
	}
}
