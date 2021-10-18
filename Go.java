/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */


public class Go extends BoardSpace {
	public Go()	{
		super("Go", 0, "", null);
	}
	
	public void OnLanding(Player currentPlayer) {
		System.out.println("You passed GO!");
		currentPlayer.addCash(2);
	}
}
