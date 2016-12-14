package Users;

public class Room15Vampire extends Room15User{

	// TODO : create cure();
	
	public Interface VampireInterface(){
		void onHelpReceived(String resource);
		void onHelpReceiveTimeout(String resource);
	}
	
	// initiates basic capabilities
	public Room15Vampire(String name){
		/* compiled code */
	}
	
	// posts received resources, waits for response, fires VampireInterface methods
	public void ask(String question){
		/* compiled code */
	}
	
	// consumes the life force of resource
	public void drink(String resource){
		/* compiled code */
	}
	
	// sets received resource to null
	public void dodge(String resource){
		/* compiled code */
	}
	
	// fake Thread.sleep
	public void goWandering(long millis){
		/* compiled code */
	}
	
	public void bite(Room15Vampire victim){
		/* compiled code */
	}
	
	public boolean isVampire(Room15User userToCheck){
		/* compiled code */
	}
	
	public void promoteToHelpVampire(Room15Vampire vampire){
		/* compiled code */
	}
	
	public void promoteToRealmVampire(Room15Vampire vampire){
		/* compiled code */
	}

	public void promoteRealm(String realmUrl){
		/* compiled code */
	}
}