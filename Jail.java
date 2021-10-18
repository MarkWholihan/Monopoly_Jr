/*  Programmers: Mark Wholihan & ________
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

public class Jail extends BoardSpace {
	
	public Jail() {
		super("Jail", 0, "", null);
	}	
	
	public void OnLanding(Player currentPlayer) {
		// if jailed, check for GTFO jail card
		if (currentPlayer.inJail = true) {
			if (currentPlayer.getOutOfJailCard = true) {
				currentPlayer.useCard("getOutOfJailCard");
			
			// pay bail if no GTFO card
			} else {
				currentPlayer.payPlayer(Player.banker,1);
				currentPlayer.inJail = false;
			}
		}
	}
	
}
