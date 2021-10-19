/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */

public class FreeParking extends BoardSpace {
	
	public FreeParking(String string, int i, boolean b) {
		super("FreeParking", 0, "", false);
	}
	
	public void OnLanding() {
		System.out.println("Enjoy the free parking!");
	}
}
