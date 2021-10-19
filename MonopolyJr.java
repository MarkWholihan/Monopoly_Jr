/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */

import java.util.*;

public class MonopolyJr {
	public static void main(String [] args) {

		GameBoard boardArray = new GameBoard();

		intro();

		System.out.println("\nToy Boat starts because they are the youngest.");
		for (int i = 0; i < 50; i++) {
			oneRound();	
		}
	}

	public static void oneRound() {
		Scanner kb = new Scanner(System.in);
		String entry = "";
		System.out.println("\nIt is now Toy Boat's turn.");
		System.out.print("Would you like to roll the die? \nEnter Y for Yes or N for No: ");
		entry = kb.nextLine();

		if (entry.trim().toUpperCase().contains("Y")) {
			Player.movePlayer(Player.playerOne);
		} else {
			System.out.println("Thank you for playing");
		}

		System.out.println("\nIt is now Toy Car's turn.");
		System.out.print("Would you like to roll the die? \nEnter Y for Yes or N for No: ");
		entry = kb.next();

		if (entry.trim().toUpperCase().contains("Y")) {
			Player.movePlayer(Player.playerTwo);
		} else {
			System.out.println("Thank you for playing");
		}

		System.out.println("\nIt is now Little Hazel's turn.");
		System.out.print("Would you like to roll the die? \nEnter Y for Yes or N for No: ");
		entry = kb.next();

		if (entry.trim().toUpperCase().contains("Y")) {
			Player.movePlayer(Player.playerThree);
		} else {
			System.out.println("Thank you for playing");
		}

		System.out.println("\nIt is now Littles Scottie's turn.");
		System.out.print("Would you like to roll the die? \nEnter Y for Yes or N for No: ");
		entry = kb.next();

		if (entry.trim().toUpperCase().contains("Y")) {
			Player.movePlayer(Player.playerFour);
		} else {
			System.out.println("Thank you for playing");
		}
	}

	public static void intro() {
		Scanner kb = new Scanner(System.in);
		String entry = "";
		System.out.println("Welcome to Monopoly Junior! ");
		System.out.print("\nWould you like to read the rules? \nEnter Y for Yes or N for No: ");
		entry = kb.next();

		if (entry.trim().toUpperCase().contains("Y")) {
			rules();
		}
		
		/*System.out.print("\nWould you like to see the starting players information? \nEnter Y for Yes or N for No: ");
		entry = kb.next();

		if (entry.trim().toUpperCase().contains("Y")) {
		System.out.println("This is the starting players information\n");

		System.out.println(Player.playerOne + " \n\n" + Player.playerTwo + " \n\n" + Player.playerThree + " \n\n" + Player.playerFour);
		System.out.println();
		}*/
	}

	public static void rules() {
		System.out.println("\nSET IT UP!\n"
				+ "1. Open the gameboard and put it in the center of the players.\n"
				+ "2. Pick up the Chance cards and remove the 4 token character cards.\n"
				+ "These are not used in the game, just read them and choose!\n"
				+ "3. Place your token on GO!\n"
				+ "4. Find the 12 sold signs that match your token and keep them in front of you.\n"
				+ "5. Shuffle the 20 Chance cards and place them facedown on the\n"
				+ "Chance space on the board.\n"
				+ "6. Pick one player to be Banker. The Banker looks after the money.\n"
				+ "\nIt’s time to deal out the cash:\n"
				+ "2-player game: give each player $20\n"
				+ "3-player game: give each player $18\n"
				+ "4-player game: give each player $16\n"
				+ "\nThe first time you play\n"
				+ "Press out all 48 sold signs from the die cut sheet. Please dispose of the excess responsibly.\n"
				+ "\nPLAY!\n"
				+ "\nHow to win\n"
				+ "Have the most money when any other player goes bankrupt (hasn’t got the cash to pay\n"
				+ "rent, buy a property they land on, or pay a Chance card fee).\n"
				+ "\nHow to play\n"
				+ "1. The youngest player starts! Play continues to the left.\n"
				+ "2. Roll the die and move your token that number of spaces\n"
				+ "clockwise from GO.\n"
				+ "• Always move forward, never backward\n"
				+ "• Every time you pass or land on the GO space, collect $2!\n"
				+ "3. Where did you land?\n"
				+ "Read about all the different spaces before you start.\n"
				+ "If you land on:\n"
				+ "AN UNOWNED SPACE\n"
				+ "If no one owns it, you must buy it!\n"
				+ "• Pay the Bank the amount written on the space.\n"
				+ "• Put one of your sold signs on the colored band at the top\n"
				+ "of the space so everyone knows you own it!\n"
				+ "AN OWNED SPACE\n"
				+ "If another player owns it, pay them rent.\n"
				+ "Rent is the amount written on the board space.\n"
				+ "If you own it, do nothing.\n"
				+ "A PAIR = DOUBLE RENT!\n"
				+ "If a player owns both properties of the same color, rent is\n"
				+ "double the amount shown on the space.\n"
				+ "4. Turn over for info on the other board spaces and how to win!\n"
				+ "\nThe 4 token character cards:\n"
				+ "Who will you be?\n"
				+ "Fast-Dealing Property Trading Game c® BRAND\n"
				+ "My First Monopoly GAME\n"
				+ "\nCONTENTS\n"
				+ "1 Gameboard\n"
				+ "4 Tokens\n"
				+ "20 Chance Cards\n"
				+ "48 Sold Signs\n"
				+ "90 x A1 Banknotes\n"
				+ "4 Who’s Your Token?\n"
				+ "Character Cards\n"
				+ "1 Die\n"
				+ "\nThe HASBRO GAMING and MONOPOLY names and logos, the distinctive design of the gameboard, the four corner squares, the\n"
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
				+ "\nAIM OF THE GAME!\n"
				+ "• Zoom around the board, buy every property you land on, collect money and pick up Chance cards.\n"
				+ "• When one player runs out of money, the others count their cash.\n"
				+ "• The player with the most money wins!\n"
				+ "\nTHE BOARD SPACES\n"
				+ "\nGO\n"
				+ "Every time you pass or land on GO, collect A2 from the Bank.\n"
				+ "\nCHANCE\n"
				+ "• Take the top Chance card, read it out loud and follow the instructions.\n"
				+ "• Return used cards to the bottom of the pile.\n"
				+ "\nGO TO JAIL\n"
				+ "Go straight to jail! Do not pass GO. Do not collect $2. At the start of your next turn,\n"
				+ "pay $1 or use the Get Out of Jail Free card if you have it. Then roll and move as\n"
				+ "normal. You can collect rent while In Jail.\n"
				+ "\nJUST VISITING\n"
				+ "You are Just Visiting if you land here on your roll!\n"
				+ "\nFREE PARKING\n"
				+ "Do nothing, just take a break.\n"
				+ "That’s it! Now it’s the next player’s turn.\n"
				+ "\nWIN!\n"
				+ "1. If you don’t have enough money to pay rent, buy a property you land on, or pay\n"
				+ "a Chance card fee, you’re bankrupt! And that’s the end of the game.\n"
				+ "2. The other players all count their money, and the player with the most money WINS!\n"
				+ "3. Tie? Count how much your properties are worth and add it on to your wealth!");
	}
}