/*  Programmers: Mark Wholihan & ________
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

import java.util.*;
public class MonopolyJr {
	public static void main(String [] args) {
		System.out.println("This is the starting players information\n");
		
		Player playerOne = new Player("Toy Boat");
		Player playerTwo = new Player("Toy Car");
		Player playerThree = new Player("Little Hazel");
		Player playerFour = new Player("Little Scottie");
		
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(playerOne);
		players.add(playerTwo);
		players.add(playerThree);
		players.add(playerFour);
		
		
		System.out.println(playerOne + " \n\n" + playerTwo + " \n\n" + playerThree + " \n\n" + playerFour);
		System.out.println();
	}
}
