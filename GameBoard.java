/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */

import java.util.ArrayList;

public class GameBoard {
	
	// import board spaces as objects
	public static BoardSpace Go = new Go("Go", 0, "", true);
    public static BoardSpace Jail = new Jail("Jail", 0, "", true);
    public static BoardSpace GoToJail = new GoToJail("Go To Jail", 0, "", true);
    public static BoardSpace Chance = new Chance("Chance", 0, "", true);
    public static BoardSpace FreeParking = new FreeParking("Free Parking", 0, true);
	public static BoardSpace Chicfila = new BoardSpace("Chic-fil-a", 1, "Brown", false);
	public static BoardSpace LittleCaesars = new BoardSpace("Little Caesar's", 1, "Brown", false);
	public static BoardSpace DairyQueen = new BoardSpace("Dairy Queen", 2, "Cyan", false);
	public static BoardSpace ChocoFactory = new BoardSpace("Choco Factory", 2, "Cyan", false);
	public static BoardSpace HalleLibrary = new BoardSpace("Halle Library", 2, "Pink", false);
	public static BoardSpace YpsiMuseum = new BoardSpace("Ypsi Museum", 2, "Pink", false);
	public static BoardSpace FrogIslandPark = new BoardSpace("Frog Island Park", 3, "Orange", false);
	public static BoardSpace FordLake = new BoardSpace("Ford Lake", 3, "Orange", false);
	public static BoardSpace PinballPetes = new BoardSpace("Pinball Pete's", 3, "Red", false);
	public static BoardSpace MJR = new BoardSpace("MJR Theater", 3, "Red", false);
	public static BoardSpace Petco = new BoardSpace("Petco", 3, "Yellow", false);
	public static BoardSpace ToysRUs = new BoardSpace("Toys R Us", 3, "Yellow", false);
	public static BoardSpace Bowlero = new BoardSpace("Bowlero", 4, "Green", false);
	public static BoardSpace DetroitZoo = new BoardSpace("Detroit Zoo", 4, "Green", false);
	public static BoardSpace Starbucks = new BoardSpace("Starbucks", 5, "Blue", false);
	public static BoardSpace AppleStore = new BoardSpace("Apple Store", 5, "Blue", false);
	
	public static ArrayList<BoardSpace> board;
	
	// establish array for game board
	public GameBoard() {
		board = new ArrayList<BoardSpace>();
		
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
	
	public ArrayList<BoardSpace> getBoard() {
	return board;
	}
}
