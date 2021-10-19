/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */

import java.util.*;

public class Player {
	private String name;
	public int cash;
	private int location;
	private BoardSpace currentLocation;
	public Boolean inJail;
	public Boolean getOutOfJailCard;
	public Boolean getAnyProp;
	public ArrayList<String> cards;
	public ArrayList<BoardSpace> ownedProperties;
	
	public static final int SPACE_TOTAL = 23;
	public static Player playerOne = new Player("Toy Boat");
	public static Player playerTwo = new Player("Toy Car");
	public static Player playerThree = new Player("Little Hazel");
	public static Player playerFour = new Player("Little Scottie");
	public static Player banker = new Player("Banker");

	// constructs an object of player
	public Player(String name) {
		this.name = name;
		cash = 16;
		location = 0;
		currentLocation = getCurrentLoc();
		inJail = false;
		getOutOfJailCard = false;
		cards = new ArrayList<String>();
		ownedProperties = new ArrayList<BoardSpace>();
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
		String result = ("Name: " + name + "\nCash: " + cash + "\nLocation: " + location +  "\nLocation name: "
				+ currentLocation.getLocName() + "\nHas get out of jail free card? "
				+ getOutOfJailCard + "\nProperties owned: "
				+ ownedProperties);
		return result;
	}

	// returns players name
	public String getName() {
		return this.name;
	}


	
	// LOCATION CONTROL ----------------------------------

	// moves players location
	public int move(int spaces, Player currentPlayer) {
		location = (spaces + location) % SPACE_TOTAL;
		getCurrentLoc();
		//Property.OnLanding(currentPlayer, currentLocation);
		System.out.println("");
		return location;
	}

	public static void movePlayer(Player currentPlayer) {
		int roll = roll();
		currentPlayer.move(roll, currentPlayer);
		System.out.println(currentPlayer.getName() + " rolled a " + roll + " and has moved to\n" + currentPlayer.getCurrentLoc());
		BoardSpace.OnLanding(currentPlayer, currentPlayer.getCurrentLoc());
		}
	
	public static int roll() {
		return (int)(Math.random() * 6) + 1;
	}

	// returns a players currentLocation
	public BoardSpace getCurrentLoc() {
		switch (location) {
		case 0: currentLocation = GameBoard.Go; break;
		case 1: currentLocation = GameBoard.Chicfila; break;
		case 2: currentLocation = GameBoard.LittleCaesars; break;
		case 3: currentLocation = GameBoard.Chance; break;
		case 4: currentLocation = GameBoard.DairyQueen; break;
		case 5: currentLocation = GameBoard.ChocoFactory; break;
		case 6: currentLocation = GameBoard.Jail; break;
		case 7: currentLocation = GameBoard.HalleLibrary; break;
		case 8: currentLocation = GameBoard.YpsiMuseum; break;
		case 9: currentLocation = GameBoard.Chance; break;
		case 10: currentLocation = GameBoard.FrogIslandPark; break;
		case 11: currentLocation = GameBoard.FordLake; break;
		case 12: currentLocation = GameBoard.FreeParking; break;
		case 13: currentLocation = GameBoard.PinballPetes; break;
		case 14: currentLocation = GameBoard.MJR; break;
		case 15: currentLocation = GameBoard.Chance; break;
		case 16: currentLocation = GameBoard.Petco; break;
		case 17: currentLocation = GameBoard.ToysRUs; break;
		case 18: currentLocation = GameBoard.GoToJail; break;
		case 19: currentLocation = GameBoard.Bowlero; break;
		case 20: currentLocation = GameBoard.DetroitZoo; break;
		case 21: currentLocation = GameBoard.Chance; break;
		case 22: currentLocation = GameBoard.Starbucks; break;
		case 23: currentLocation = GameBoard.AppleStore; break;
		default: currentLocation = GameBoard.Jail; break;
		}
		return currentLocation;
	}

	// sets a players currentLocation
	public void setCurrentLoc(BoardSpace currentLocation) {
		this.currentLocation = currentLocation;
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
		this.cash += cash;
	}

	// subtracts cash from the player
	public int subtractCash(int lessCash, Player currentPlayer) {
		cash = (cash - lessCash);
		getCash();
		if (playerOne.cash <= 0 || playerTwo.cash <= 0 || playerThree.cash <= 0 || playerFour.cash <= 0) {
			System.out.println("Not enough cash, the game will now end. The player with most cash wins!\n");
			endGame();
		}
		return cash;
	}
	
	// pays another player
	public void payPlayer(Player payer, Player payee, int amount) {
		payer.subtractCash(amount, payer);
		payee.addCash(amount);
	}

	// ends the game
	public void endGame() {
		Player mostCash = max(playerOne.getCash(), playerTwo.getCash(), playerThree.getCash(), playerFour.getCash());
		System.out.println(mostCash.name + " is the Winner because they had the most cash when the game ended\n" +
		playerOne.name + " had $" + playerOne.getCash() + "\n" + playerTwo.name + " had $" + playerTwo.getCash() +
		"\n" + playerThree.name + " had $" + playerThree.getCash() + "\n" + playerFour.name + " had $" + playerFour.getCash());
	}
	
	// returns winner with most cash
	public Player max(int one, int two, int three, int four) {
		Player winner = banker;
		
		if (one > two && one > three && one >four) {
			winner = playerOne;
			return winner;
		} else if (two > three && two > one && two > four) {
			winner = playerTwo;
			return winner;
		} else if (three > one && three > two && three > four) {
			winner = playerThree;
			return winner;
		} else if (four > one && four > two && four > three) {
			winner = playerFour;
			return winner;
		} else {
			System.out.println("Tie Game!");
			
		}
		
		return winner;
		
	}
	
	// tie game
	public static void tieGame() {
		String tied = "";
		
	}
	
	// PROPERTY CONTROL ----------------------------------
	// adds a property to the player
	public void addProperty(BoardSpace property) {
		ownedProperties.add(property);
	}

	// returns players properties
	public ArrayList<BoardSpace> getProperties() {
		return ownedProperties;
	}
	
	


	// JAIL CONTROL --------------------------------------
	// returns true if player has get out of jail free card
	public Boolean getOutOfJailCard() {
		if(cards.size() > 0) {
			getOutOfJailCard = true;
			return true;
		} else {
			getOutOfJailCard = false;
			return false;
		}
	}

	// uses getOutOfJailCard
	public void useCard(String getOutOfJailCard) {
		cards.remove(getOutOfJailCard);
		inJail = false;
	}
	
	// player is in jail
	public Boolean playerInJail() {
		return inJail;
	}
}