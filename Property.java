/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

public class Property extends BoardSpace {

	// set up property template
	private String name;
	private int cost;
	private String color;
	private Property colorProp = GameBoard.Chicfila;

	public Property(String pName, int pCost, String pColor) {
		super("Property");
		name = pName;
		cost = pCost;
		color = pColor;
	}



	// mark owned/unowned status and who is the owner
	private boolean owned = false;
	private Player owner;

	public boolean Status() {
		return owned;
	}

	public Player Owner(Player ownerName) {
		owner = ownerName;
		return owner;
	}



	// do things when player lands on this space
	public void OnLanding(Player currentPlayer, Property currentProperty) {
		//update the player’s cash balance,

		//update the player’s position on the board, and


		//if class is a property, update the state of the property (owned/unowned, and owner).
		if (currentProperty == GameBoard.Chicfila) {	

			if (owned == true) {
				currentPlayer.payPlayer(owner, cost);
			} else {
				currentPlayer.addProperty(currentProperty);
			}
		}
	}
}
