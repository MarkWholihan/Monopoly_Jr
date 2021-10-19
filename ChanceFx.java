/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */

import java.util.Scanner;

public class ChanceFx {
	static Scanner kb = new Scanner(System.in);
	ChanceFx operation;
	static int distance;
	
	
	// advance to specific color ---------------------------------------------------------------
	public static ChanceFx advanceColor() {	
		return advanceColor();
	}
	
	
	// advance to apple ---------------------------------------------------------------
	public static ChanceFx advanceApple(Player currentPlayer) {
		distance = 23-currentPlayer.getLoc();
		currentPlayer.move(distance,currentPlayer);
		return advanceApple(currentPlayer);
	}
	
	
	// advance 5 spaces ---------------------------------------------------------------
	public static ChanceFx advanceFive(Player currentPlayer) {
		currentPlayer.move(5,currentPlayer);
		return advanceFive(currentPlayer);
	}

	
	// advance or chance ---------------------------------------------------------------
	public static ChanceFx advanceOrChance(Player currentPlayer) {
		String answer = "deeznuts";
		
		// loop til answer is valid
		while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")) {
	    	answer = kb.next();
			
			if (answer.equalsIgnoreCase("A")) {
				currentPlayer.move(1,currentPlayer);
				
			} else if (answer.equalsIgnoreCase("B")) {
				ChanceCard.getChance();
			}
		}
		return advanceOrChance(currentPlayer);
	}
	
	
	// advance to GO ---------------------------------------------------------------
	public static ChanceFx advanceGo(Player currentPlayer) {
		distance = 23-currentPlayer.getLoc();
		currentPlayer.move(distance,currentPlayer);
		return advanceGo(currentPlayer);
	}
	
	
	// advance to Frog Island Park ---------------------------------------------------------------
	public static ChanceFx advancePark(Player currentPlayer) {
		int distance;
		if (currentPlayer.getLoc()<10) {
			distance = 10-currentPlayer.getLoc();
		} else {
			distance = (23-currentPlayer.getLoc())+10;
		}
		currentPlayer.move(distance,currentPlayer);
		return advancePark(currentPlayer);
	}
	
	
	// get out of jail free card ---------------------------------------------------------------
	public static ChanceFx getOutOfJailFree(Player currentPlayer) {
		currentPlayer.cards.add("getOutOfJailCard");
		return getOutOfJailFree(currentPlayer);
	}
	
	
	// gain $2 ---------------------------------------------------------------
	public static ChanceFx gain(Player currentPlayer) {
		currentPlayer.addCash(2);
		return gain(currentPlayer);
	}
	
	
	
	// lose $2 ---------------------------------------------------------------
	public static ChanceFx lose(Player currentPlayer) {
		currentPlayer.subtractCash(2);
		return lose(currentPlayer);
	}
	
	
	// player-specific free property cards ---------------------------------------------------------------
	public static ChanceFx playerSpec(Player currentPlayer) {
		int numOwned=0;
		int checkLoc;
		for (int i=0; i<=23; i++) {
			// scroll thru board from current location onward, restart count if over 23
			checkLoc = (currentPlayer.getLoc()+i);
			if (checkLoc > 23) {
				checkLoc -= 23;
			}
			
		
			// count num of owned spaces, break loop if all spaces owned
			if (numOwned < 16) {
				if (GameBoard.board.get(checkLoc).owned == false) {
					if (currentPlayer.getLoc() < checkLoc) {
						distance = checkLoc-currentPlayer.getLoc();
					} else {
						distance = 23-currentPlayer.getLoc();
					}
				} else {
					numOwned++;
				}
			} else {
				break;
			}
		}

		
		// all spaces owned, go to nearest not-yours property
		// scroll thru board from current location onward
		for (int i=0; i<=23;i++) {
			checkLoc = ((currentPlayer.getLoc()+i));
			// restart count if over 23
			if (checkLoc > 23) {
				checkLoc -= 23;
			}
		
			// go to nearest property owned by other player
			if (GameBoard.board.get(checkLoc).owner != currentPlayer && GameBoard.board.get(checkLoc).owner != Player.banker) {
				if (currentPlayer.getLoc() < checkLoc) {
						distance = checkLoc-currentPlayer.getLoc();
					} else {
						distance = 23-currentPlayer.getLoc();
					}
			}
		}
		
		return playerSpec(currentPlayer);
	}
}
