import java.util.Random;

/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

public class Chance extends BoardSpace {
	
	Random random = new Random();
	
	public Chance() {
		super("Chance");
	}	
	
	// pick chance card
	public void OnLanding() {
		System.out.println("Take a chance card!");
		ChanceCard.getChance();
	}
}
