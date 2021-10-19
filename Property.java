/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */

import java.util.*;

public class Property extends BoardSpace {

	// set up property template
	private String name;
	private int cost;
	private String color;
	private boolean owned;
	private Player owner;

	public Property(String pName, int pCost, String pColor, Boolean pOwned) {
		super("Property", pCost, pColor, pOwned);
		name = pName;
		cost = pCost;
		color = pColor;
		owned = pOwned;
		owner = Player.banker;
	}

	// returns information about this player as a string
	public String toString() {
		String result = ("Name: " + name + "\nCost: $" + cost + "\nColor: "
				+ color + "\nOwned?: "
				+ owned + "\nOwner: "
				+ owner.getName());
		return result;
	}
	
	// returns a locations name
		public String getLocName() {
			return name;
		}

	public boolean Status() {
		return owned;
	}

	public Player Owner(Player ownerName) {
		owner = ownerName;
		return owner;
	}

	// do things when player lands on this space
	public static void OnLanding(Player currentPlayer, Property currentProperty) {
		//update the player’s cash balance,
		//update the player’s position on the board, and
		//if class is a property, update the state of the property (owned/unowned, and owner).
		if (currentProperty.owned == true) {
			System.out.println();
			currentPlayer.payPlayer(currentProperty.owner, currentProperty.cost);
			System.out.println(currentPlayer.getName() + " paid " + currentProperty.owner.getName() + " $" + currentProperty.cost + " for rent");
		} else {
			System.out.println();
			currentPlayer.addProperty(currentProperty);
			currentProperty.owned = true;
			currentProperty.owner = currentPlayer;
			System.out.println(currentProperty.name + " purchased for $" + currentProperty.cost + " by " + currentPlayer.getName());
			System.out.println(currentProperty.name + " added to " + currentPlayer.getName() + "'s properties");
		}
	}
}
