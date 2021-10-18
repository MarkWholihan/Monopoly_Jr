/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

public class BoardSpace {

	// set up property template
	private String name;
	private int cost;
	private String color;
	public boolean owned;
	public Player owner;

	public BoardSpace(String pName, int pCost, String pColor, Boolean pOwned) {
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
	public static void OnLanding(Player currentPlayer, BoardSpace currentSpace) {
		//update the player’s cash balance,
		//update the player’s position on the board, and
		//if class is a property, update the state of the property (owned/unowned, and owner).
		if (currentSpace.owned == true) {
			System.out.println();
			currentPlayer.payPlayer(currentSpace.owner, currentSpace.cost);
			System.out.println(currentPlayer.getName() + " paid " + currentSpace.owner.getName() + " $" + currentSpace.cost + " for rent");
		} else if (currentSpace.owned == false) {
			System.out.println();
			currentPlayer.addProperty(currentSpace);
			currentSpace.owned = true;
			currentSpace.owner = currentPlayer;
			System.out.println(currentSpace.name + " purchased for $" + currentSpace.cost + " by " + currentPlayer.getName());
			System.out.println(currentSpace.name + " added to " + currentPlayer.getName() + "'s properties");
		}
	}
}
