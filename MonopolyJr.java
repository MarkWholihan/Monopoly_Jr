/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

import java.util.*;

public class MonopolyJr {
	public static void main(String [] args) {
		
		intro();
		rules();
		
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
	
	public static void intro() {
		System.out.println("Welcome to Monopoly Jr.! ");
	}
	
	public static void rules() {
		System.out.println("SET IT UP!\n"
				+ "1. Open the gameboard and put it in the center of the players.\n"
				+ "2. Pick up the Chance cards and remove the 4 token character cards.\n"
				+ "These are not used in the game, just read them and choose!\n"
				+ "\n"
				+ "3. Place your token on GO!\n"
				+ "4. Find the 12 sold signs that match your token and keep them in front of you.\n"
				+ "5. Shuffle the 20 Chance cards and place them facedown on the\n"
				+ "Chance space on the board.\n"
				+ "6. Pick one player to be Banker. The Banker looks after the money.\n"
				+ "It’s time to deal out the cash:\n"
				+ "2-player game: give each player A20\n"
				+ "3-player game: give each player A18\n"
				+ "4-player game: give each player A16\n"
				+ "The first time you play\n"
				+ "Press out all 48 sold signs from the die cut sheet. Please dispose of the excess responsibly.\n"
				+ "PLAY!\n"
				+ "How to win\n"
				+ "Have the most money when any other player goes bankrupt (hasn’t got the cash to pay\n"
				+ "rent, buy a property they land on, or pay a Chance card fee).\n"
				+ "How to play\n"
				+ "1. The youngest player starts! Play continues to the left.\n"
				+ "2. Roll the die and move your token that number of spaces\n"
				+ "clockwise from GO.\n"
				+ "	 •	 Always move forward, never backward\n"
				+ "	 •	 Every time you pass or land on the GO space, collect A2!\n"
				+ "3. Where did you land?\n"
				+ "Read about all the different spaces before you start.\n"
				+ "If you land on:\n"
				+ "AN UNOWNED SPACE\n"
				+ "If no one owns it, you must buy it!\n"
				+ "•	 Pay the Bank the amount written on the space.\n"
				+ "•	 Put one of your sold signs on the colored band at the top\n"
				+ "of the space so everyone knows you own it!\n"
				+ "AN OWNED SPACE\n"
				+ "If another player owns it, pay them rent.\n"
				+ "Rent is the amount written on the board space.\n"
				+ "If you own it, do nothing.\n"
				+ "A PAIR = DOUBLE RENT!\n"
				+ "If a player owns both properties of the same color, rent is\n"
				+ "double the amount shown on the space.\n"
				+ "x12 x12 x12 x12\n"
				+ "4. Turn over for info on the other board spaces and how to win!\n"
				+ "A69840000 13 I MN JR.indd 2-3 9/5/13 10:16 AM\n"
				+ "The 4 token character cards:\n"
				+ "Who will you be?\n"
				+ "SET IT UP!\n"
				+ "1. Open the gameboard and put it in the center of the players.\n"
				+ "2. Pick up the Chance cards and remove the 4 token character cards.\n"
				+ "These are not used in the game, just read them and choose!\n"
				+ "\n"
				+ "3. Place your token on GO!\n"
				+ "4. Find the 12 sold signs that match your token and keep them in front of you.\n"
				+ "5. Shuffle the 20 Chance cards and place them facedown on the\n"
				+ "Chance space on the board.\n"
				+ "6. Pick one player to be Banker. The Banker looks after the money.\n"
				+ "It’s time to deal out the cash:\n"
				+ "2-player game: give each player A20\n"
				+ "3-player game: give each player A18\n"
				+ "4-player game: give each player A16\n"
				+ "The first time you play\n"
				+ "Press out all 48 sold signs from the die cut sheet. Please dispose of the excess responsibly.\n"
				+ "PLAY!\n"
				+ "How to win\n"
				+ "Have the most money when any other player goes bankrupt (hasn’t got the cash to pay\n"
				+ "rent, buy a property they land on, or pay a Chance card fee).\n"
				+ "How to play\n"
				+ "1. The youngest player starts! Play continues to the left.\n"
				+ "2. Roll the die and move your token that number of spaces\n"
				+ "clockwise from GO.\n"
				+ "	 •	 Always move forward, never backward\n"
				+ "	 •	 Every time you pass or land on the GO space, collect A2!\n"
				+ "3. Where did you land?\n"
				+ "Read about all the different spaces before you start.\n"
				+ "If you land on:\n"
				+ "AN UNOWNED SPACE\n"
				+ "If no one owns it, you must buy it!\n"
				+ "•	 Pay the Bank the amount written on the space.\n"
				+ "•	 Put one of your sold signs on the colored band at the top\n"
				+ "of the space so everyone knows you own it!\n"
				+ "AN OWNED SPACE\n"
				+ "If another player owns it, pay them rent.\n"
				+ "Rent is the amount written on the board space.\n"
				+ "If you own it, do nothing.\n"
				+ "A PAIR = DOUBLE RENT!\n"
				+ "If a player owns both properties of the same color, rent is\n"
				+ "double the amount shown on the space.\n"
				+ "x12 x12 x12 x12\n"
				+ "4. Turn over for info on the other board spaces and how to win!\n"
				+ "A69840000 13 I MN JR.indd 2-3 9/5/13 10:16 AM\n"
				+ "c Fast-Dealing Property Trading Game c\n"
				+ "® BRAND\n"
				+ "My First\n"
				+ "Monopoly GAME\n"
				+ "CONTENTS\n"
				+ "1 Gameboard\n"
				+ "4 Tokens\n"
				+ "20 Chance Cards\n"
				+ "48 Sold Signs\n"
				+ "90 x A1 Banknotes\n"
				+ "4 Who’s Your Token?\n"
				+ "Character Cards\n"
				+ "1 Die\n"
				+ "The HASBRO GAMING and MONOPOLY names and logos, the distinctive design of the gameboard, the four corner squares, the\n"
				+ "MR. MONOPOLY name and character, as well as each of the distinctive elements of the board and playing pieces are trademarks\n"
				+ "of Hasbro for its property trading game and game equipment. All Rights Reserved. TM & ® denote U.S. Trademarks.\n"
				+ "© 1935, 2013 Hasbro, Pawtucket, RI 02861-1059 USA.\n"
				+ "Consumer contact:\n"
				+ "Hasbro Games, Consumer Affairs Dept., P.O. Box 200, Pawtucket, RI 02861-1059 USA. Tel: 888-836-7025.\n"
				+ "HASBRO CANADA, LONGUEUIL, QC, CANADA J4G 1G2.\n"
				+ "Colors and parts may vary from those pictured. Please retain this information for future reference.\n"
				+ "Les couleurs et les pièces peuvent différer de celles illustrées. Conservez cette information pour référence ultérieure.\n"
				+ "MADE IN USA WITH TOKENS AND DIE MADE IN CHINA.\n"
				+ "FABRIQUÉ AUX É-U. PIONS ET DÉ FABRIQUÉS EN CHINE.\n"
				+ "www.hasbro.com 101A698400\n"
				+ "AIM OF THE GAME!\n"
				+ "•	 Zoom around the board,\n"
				+ "buy every property you\n"
				+ "land on, collect money and\n"
				+ "pick up Chance cards.\n"
				+ "•	 When one player runs out\n"
				+ "of money, the others count\n"
				+ "their cash.\n"
				+ "•	 The player with the most\n"
				+ "money wins!\n"
				+ "THE BOARD SPACES\n"
				+ "GO\n"
				+ "Every time you pass or land on GO, collect A2 from the Bank.\n"
				+ "CHANCE\n"
				+ "•	Take the top Chance card, read it out loud and follow the instructions.\n"
				+ "•	Return used cards to the bottom of the pile.\n"
				+ "GO TO JAIL\n"
				+ "Go straight to jail! Do not pass GO. Do not collect A2. At the start of your next turn,\n"
				+ "pay A1 or use the Get Out of Jail Free card if you have it. Then roll and move as\n"
				+ "normal. You can collect rent while In Jail.\n"
				+ "JUST VISITING\n"
				+ "You are Just Visiting if you land here on your roll!\n"
				+ "FREE PARKING\n"
				+ "Do nothing, just take a break.\n"
				+ "5. That’s it! Now it’s the next player’s turn.\n"
				+ "WIN!\n"
				+ "1. If you don’t have enough money to pay rent, buy a property you land on, or pay\n"
				+ "a Chance card fee, you’re bankrupt! And that’s the end of the game.\n"
				+ "2. The other players all count their money, and the player with the most money WINS!\n"
				+ "3. Tie? Count how much your properties are worth and add it on to your wealth!");
	}

	/** System.out.println("This is the starting players information\n");

		System.out.println(playerOne + " \n\n" + playerTwo + " \n\n" + playerThree + " \n\n" + playerFour);
		System.out.println(); */
}