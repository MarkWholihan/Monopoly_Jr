/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

import java.util.*;

public class MonopolyJr {
	public static void main(String [] args) {
		
		Player playerOne = new Player("Toy Boat");
		Player playerTwo = new Player("Toy Car");
		Player playerThree = new Player("Little Hazel");
		Player playerFour = new Player("Little Scottie");
		
		

		// ArrayList of Player objects
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(playerOne);
		players.add(playerTwo);
		players.add(playerThree);
		players.add(playerFour);

		// test move player
		playerOne.move(roll());
		System.out.println(playerOne + "\n");

		playerTwo.move(roll());
		System.out.println(playerTwo + "\n");

		playerThree.move(roll());
		System.out.println(playerThree + "\n");

		playerFour.move(roll());
		System.out.println(playerFour + "\n");
		
		playerOne.move(roll());
		System.out.println(playerOne + "\n");


	}

	public static int roll() {
		return (int)(Math.random() * 6) + 1;
	}

	/** System.out.println("This is the starting players information\n");

		System.out.println(playerOne + " \n\n" + playerTwo + " \n\n" + playerThree + " \n\n" + playerFour);
		System.out.println(); */
}