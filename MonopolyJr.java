
/*  Programmers: Mark Wholihan & ________
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

public class MonopolyJr {
	public static void main(String [] args) {
		System.out.println("This is the starting players information\n");
		
		Player playerOne = new Player("Toy Boat");
		Player playerTwo = new Player("Toy Car");
		Player playerThree = new Player("Little Hazel");
		Player playerFour = new Player("Little Scottie");
		
		System.out.println(playerOne + " \n\n" + playerTwo + " \n\n" + playerThree + " \n\n" + playerFour);
		System.out.println();
	}
}