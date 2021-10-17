/*  Programmers: Mark Wholihan & ________
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

public class Jail extends BoardSpace {
	
	public Jail() {
		super("Jail");
	}	
	
	public void OnLanding(Player currentPlayer) {
		// if jailed, check for GTFO jail card
		if (currentPlayer.inJail = true) {
			if (currentPlayer.getOutOfJailCard = true) {
				currentPlayer.useCard("getOutOfJailCard");
			}
		}
		
		
	}
}
