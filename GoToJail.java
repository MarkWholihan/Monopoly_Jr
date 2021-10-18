
public class GoToJail extends BoardSpace {
	public GoToJail() {
		super("GoToJail", 0, "", null);
	}
	
	public void OnLanding(Player currentPlayer) {
		System.out.println("Uh oh! You're going to jail!");		
		currentPlayer.inJail = true;
		currentPlayer.move(-12,currentPlayer);
	}
}
