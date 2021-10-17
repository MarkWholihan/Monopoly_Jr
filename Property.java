import java.util.*;

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
	private boolean owned = false;
	private Player owner = Player.banker;

	public Property(String pName, int pCost, String pColor) {
		super("Property");
		name = pName;
		cost = pCost;
		color = pColor;
		owned = false;
		owner = Player.banker;
	}

	// returns information about this player as a string
	public String toString() {
		String result = ("\nName: " + name + "\nCost: " + cost + "\nColor: "
				+ color + "\nIs owned? "
				+ owned + "\nOwner: "
				+ owner.getName());
		return result;
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

		// ArrayList of Property objects
		ArrayList<Property> unownedProperties = new ArrayList<>();
		unownedProperties.add(GameBoard.Chicfila);
		unownedProperties.add(GameBoard.LittleCaesars);
		unownedProperties.add(GameBoard.DairyQueen);
		unownedProperties.add(GameBoard.ChocoFactory);
		unownedProperties.add(GameBoard.HalleLibrary);
		unownedProperties.add(GameBoard.YpsiMuseum);
		unownedProperties.add(GameBoard.FrogIslandPark);
		unownedProperties.add(GameBoard.FordLake);
		unownedProperties.add(GameBoard.PinballPetes);
		unownedProperties.add(GameBoard.MJR);
		unownedProperties.add(GameBoard.Petco);
		unownedProperties.add(GameBoard.ToysRUs);
		unownedProperties.add(GameBoard.Bowlero);
		unownedProperties.add(GameBoard.DetroitZoo);
		unownedProperties.add(GameBoard.Starbucks);
		unownedProperties.add(GameBoard.AppleStore);

		//update the player’s cash balance,
		//update the player’s position on the board, and
		//if class is a property, update the state of the property (owned/unowned, and owner).
		for (int i = 0; i < unownedProperties.size(); i++) {
			if (currentProperty.equals(unownedProperties.get(i))) {
				System.out.println("This property is unowned!" + unownedProperties.get(i));

				if (currentProperty.owned == true) {
					currentPlayer.payPlayer(currentProperty.owner, currentProperty.cost);
					System.out.println("Paid " + currentProperty.owner.getName() + " $" + currentProperty.cost + " for rent");
				} else {
					currentPlayer.addProperty(currentProperty);
					unownedProperties.remove(i);
					currentProperty.owned = true;
					currentProperty.owner = currentPlayer;
					System.out.println("Property purchased for $" + currentProperty.cost );
					System.out.println("Property added to players properties");
					break;
				}
			}  
		}
	}
}
