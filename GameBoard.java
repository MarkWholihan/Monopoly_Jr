/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

import java.util.ArrayList;

public class GameBoard {
	
	// import board spaces as objects
	public static Go Go = new Go();
	public static Chance Chance = new Chance();
	public static FreeParking FreeParking = new FreeParking();
	public static GoToJail GoToJail = new GoToJail();
	public static Jail Jail = new Jail();
	
	// properties
	public static Property go = new Property("GO", 0, "");
	public static Property jail = new Property("JAIL", 0, "");
	public static Property goToJail = new Property("GO TO JAIL", 0, "");
	public static Property chance = new Property("CHANCE", 0, "");
	public static Property freeParking = new Property("FREE PARKING", 0, "");
	public static Property Chicfila = new Property("Chic-fil-a", 1, "Brown");
	public static Property LittleCaesars = new Property("Little Caesar's", 1, "Brown");
	public static Property DairyQueen = new Property("Dairy Queen", 2, "Cyan");
	public static Property ChocoFactory = new Property("Choco Factory", 2, "Cyan");
	public static Property HalleLibrary = new Property("Halle Library", 2, "Pink");
	public static Property YpsiMuseum = new Property("Ypsi Museum", 2, "Pink");
	public static Property FrogIslandPark = new Property("Frog Island Park", 3, "Orange");
	public static Property FordLake = new Property("Ford Lake", 3, "Orange");
	public static Property PinballPetes = new Property("Pinball Pete's", 3, "Red");
	public static Property MJR = new Property("MJR Theater", 3, "Red");
	public static Property Petco = new Property("Petco", 3, "Yellow");
	public static Property ToysRUs = new Property("Toys R Us", 3, "Yellow");
	public static Property Bowlero = new Property("Bowlero", 4, "Green");
	public static Property DetroitZoo = new Property("Detroit Zoo", 4, "Green");
	public static Property Starbucks = new Property("Starbucks", 5, "Blue");
	public static Property AppleStore = new Property("Apple Store", 5, "Blue");
	
	
	// establish array for game board
	public void BoardArray() {
		ArrayList<BoardSpace> board = new ArrayList<BoardSpace>();
		
		// add board spaces
		board.add(Go);
		
		board.add(Chicfila);
		board.add(LittleCaesars);
		
		board.add(Chance);
		
		board.add(DairyQueen);
		board.add(ChocoFactory);
		
		board.add(Jail);
		
		board.add(HalleLibrary);
		board.add(YpsiMuseum);
		
		board.add(Chance);
		
		board.add(FrogIslandPark);
		board.add(FordLake);
		
		board.add(FreeParking);
		
		board.add(PinballPetes);
		board.add(MJR);
		
		board.add(Chance);
		
		board.add(Petco);
		board.add(ToysRUs);
		
		board.add(GoToJail);
		
		board.add(Bowlero);
		board.add(DetroitZoo);
		
		board.add(Chance);
		
		board.add(Starbucks);
		board.add(AppleStore);
	}
}
