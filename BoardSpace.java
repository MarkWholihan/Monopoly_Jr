/*  Programmers: Mark Wholihan & Alder Yang
Course: COSC 211, Fall 2021
Project#: 1 Monopoly Jr
Due date: 10-10-2021 by 11:59pm
 */

// superclass template to make subclasses for each type of board space
abstract public class BoardSpace {
	String space;
	
	public BoardSpace(String sType) {
		space = sType;
	}
	
	public String toString() {
		return space;
	}
}
