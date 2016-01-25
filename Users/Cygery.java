public class Cygery extends Room15User {

	private boolean isRoomOwner = false;
	private boolean isDumbass = false;
	private boolean hasCircle = true;
	private boolean hasAndroidWear = true;

	public CptEric() {
		
	}

	public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
	}

	public boolean isDumbass() {
		return isDumbass;
	}

	public boolean hasAndroidWear() {
		return hasAndroidWear;
	}
}