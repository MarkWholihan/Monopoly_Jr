/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
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
		if (color == "") {
			owned = true;
		} else {
			owned = false;
		}
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

	
	// do things when player lands on this a BoardSpace
	public static void OnLanding(Player currentPlayer, BoardSpace currentSpace) {
		// check what kind of space
		// if special, do special OnLanding in their respective subclasses of BoardSpace
		if (currentSpace.name.equals("Go") && currentSpace.name.equals("Jail")
				&& currentSpace.name.equals("Go To Jail")
				&& currentSpace.name.equals("Chance")
				&& currentSpace.name.equals("Free Parking")) {
			currentPlayer.getCurrentLoc();
			
		// if property, do default OnLanding
		} else {
			// if property, check if owned
			// if owned by other player, pay rent
			if (currentSpace.owned == true && !currentSpace.owner.equals(currentPlayer.getName())) {
				System.out.println();
				currentPlayer.payPlayer(currentSpace.owner, currentSpace.cost);
				System.out.println(currentPlayer.getName() + " paid "
						+ currentSpace.owner.getName() + " $" + currentSpace.cost + " for rent");
			
			// if not owned by anyone, buy
			} else if (currentSpace.owned == false) {
				System.out.println();
				currentPlayer.addProperty(currentSpace);
				currentSpace.owned = true;
				currentSpace.owner = currentPlayer;
				System.out.println(currentSpace.name + " purchased for $" + currentSpace.cost
						+ " by " + currentPlayer.getName());
				System.out.println(currentSpace.name + " added to "
						+ currentPlayer.getName() + "'s properties");
			}
		}
	}
}
