public class Miva2 extends Room15User {

	private boolean isRoomOwner = false;
	private boolean hasCircle = false;
	private boolean isGhost = true;

	private Random random;

	public Miva2() {
		// TODO auto generated method stub
		random = new Random();
		isGhost = random.nextBoolean();
	}

	public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
	}

	public boolean isGhost() {
		return isGhost;
	}
}