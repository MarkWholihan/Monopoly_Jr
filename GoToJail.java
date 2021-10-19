/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */

public class GoToJail extends BoardSpace {
	public GoToJail(String string, int i, String string2, boolean b) {
		super("GoToJail", 0, "", false);
	}
	
	public void OnLanding(Player currentPlayer) {
		System.out.println("Uh oh! You're going to jail!");		
		currentPlayer.inJail = true;
		currentPlayer.move(-12,currentPlayer);
	}
}
