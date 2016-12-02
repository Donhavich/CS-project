/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Description of assignment:
 * 		Create and design a turned based Spy vs Ninja game by using 
 * 		Object oriented techniques and follows the specifications 
 * 		based on the rubric. 
 * Team: Spirit Coders 
 * 		Wing Hung Lau
 * 		Michael Tang
 * 		Donovan Gonzalez
 * 		Lynn Nguyen
 * 		Xinyuan Wang
 * 		Connor Chase
 */
package edu.cpp.cs.cs141.final_project;

/**
 * @author Michael Tang
 * 
 * This class represents some of the attributes of Items in the game.
 */

public abstract class Item extends SquareObject {

	private boolean isUsed;
	
	private char symbol;

/**
 * 	This is the constructor of the {@link Item}
 * @param symbol
 */
	public Item (char symbol) {
		isUsed = false;
		this.symbol=symbol;
	}
	
/**
 * This method is used to return either true or false 
 * for the item being used.
*/	
	public boolean isUsed()
	{
		return isUsed;
	}
/**
 * This method is used to declared that the item is being used.
 */
	public void beingUsed()
	{
		isUsed = true;
	}
	
	
/**
 * This method is used for debugging the game to show the items.
 */
	@Override
	public String toString(boolean isDebug) {
		if(isDebug || this.isVisible())
			return "["+symbol+"]";
		else 
			return "[*]";

	
	}
}

