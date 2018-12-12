package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc, xGold, xDeck;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public int getxGold(int xGold) {return this.xGold;}

	public void setxGold(int Gold) {this.xGold = Gold;}

	public int getxDeck() {return xDeck;}

	public void setxDeck(int xDeck) {this.xDeck = xDeck;}

	public Person(String firstName, String familyName, int xLoc, int yLoc, int xGold, int xDeck)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.xGold = xGold;
		this.xDeck = xDeck;
	}


}
