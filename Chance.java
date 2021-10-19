/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-17-2021 by 11:59pm
 */

import java.util.Random;

public class Chance extends BoardSpace {
	
	Random random = new Random();
	
	public Chance(String string, int i, String string2, boolean b) {
		super("Chance", 0, "", false);
	}	
	
	// pick chance card
	public void OnLanding() {
		System.out.println("Take a chance card!");
		ChanceCard.getChance();
	}
}
