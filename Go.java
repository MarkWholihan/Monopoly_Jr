/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */


public class Go extends BoardSpace {
	public Go(String string, int i, String string2, boolean b)	{
		super("Go", 0, "", false);
	}
	
	public void OnLanding(Player currentPlayer) {
		System.out.println("You passed GO!");
		currentPlayer.addCash(2);
	}
}
