/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

import java.util.*;

public class Player {
	private String name;
	private int cash;
	private int location;
	private Property currentLocation;
	private Boolean inJail;
	public Boolean getOutOfJailCard;
	private ArrayList<Chance> cards;
	private ArrayList<Property> ownedProperties;
	public static final int SPACE_TOTAL = 23;
	public static Player playerOne = new Player("Toy Boat");
	public static Player playerTwo = new Player("Toy Car");
	public static Player playerThree = new Player("Little Hazel");
	public static Player playerFour = new Player("Little Scottie");

	// constructs an object of player
	public Player(String name) {
		this.name = name;
		cash = 16;
		location = 0;
		currentLocation = getCurrentLoc();
		getOutOfJailCard = false;
		cards = new ArrayList<Chance>();
		ownedProperties = new ArrayList<Property>();
	}

	// ArrayList of Player objects
	public void playerArray() {	
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(playerOne);
		players.add(playerTwo);
		players.add(playerThree);
		players.add(playerFour);
	}

	// returns information about this player as a string
	public String toString() {
		String result = ("Name: " + name + "\nCash: " + cash + "\nLocation: " + location +  "\nLocation "
				+ currentLocation + "\nHas get out of jail free card? "
				+ getOutOfJailCard + "\nProperties owned: "
				+ ownedProperties);
		return result;
	}

	// returns players name
	public String getName() {
		return name;
	}


	// LOCATION CONTROL ----------------------------------

	// moves players location
	public int move(int spaces, Player currentPlayer) {

		location = (spaces + location) % SPACE_TOTAL;
		getCurrentLoc();
		//Property.OnLanding();
		System.out.println("");
		return location;
	}


	// returns a players currentLocation
	public Property getCurrentLoc() {
		switch (location) {
		case 0: currentLocation = GameBoard.go; break;
		case 1: currentLocation = GameBoard.Chicfila; break;
		case 2: currentLocation = GameBoard.LittleCaesars; break;
		case 3: currentLocation = GameBoard.chance; break;
		case 4: currentLocation = GameBoard.DairyQueen; break;
		case 5: currentLocation = GameBoard.ChocoFactory; break;
		case 6: currentLocation = GameBoard.jail; break;
		case 7: currentLocation = GameBoard.HalleLibrary; break;
		case 8: currentLocation = GameBoard.YpsiMuseum; break;
		case 9: currentLocation = GameBoard.chance; break;
		case 10: currentLocation = GameBoard.FrogIslandPark; break;
		case 11: currentLocation = GameBoard.FordLake; break;
		case 12: currentLocation = GameBoard.freeParking; break;
		case 13: currentLocation = GameBoard.PinballPetes; break;
		case 14: currentLocation = GameBoard.MJR; break;
		case 15: currentLocation = GameBoard.chance; break;
		case 16: currentLocation = GameBoard.Petco; break;
		case 17: currentLocation = GameBoard.ToysRUs; break;
		case 18: currentLocation = GameBoard.goToJail; break;
		case 19: currentLocation = GameBoard.Bowlero; break;
		case 20: currentLocation = GameBoard.DetroitZoo; break;
		case 21: currentLocation = GameBoard.chance; break;
		case 22: currentLocation = GameBoard.Starbucks; break;
		case 23: currentLocation = GameBoard.AppleStore; break;
		default: currentLocation = GameBoard.jail; break;
		}
		setCurrentLoc(currentLocation);
		return currentLocation;
	}

	// sets a players currentLocation
	public void setCurrentLoc(Property currentLocation) {
		currentLocation = this.currentLocation;
	}

	// sets a players location
	public void setLoc(int location) {
		this.location = location;
	}

	// returns a players location
	public int getLoc() {
		return location;
	}


	// MONEY CONTROL -------------------------------------
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


	// PROPERTY CONTROL ----------------------------------
	// adds a property to the player
	public void addProperty(Property property) {
		ownedProperties.add(property);
	}

	// returns players properties
	public ArrayList<Property> getProperties() {
		return ownedProperties;
	}


	// JAIL CONTROL --------------------------------------
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