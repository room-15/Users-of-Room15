public class Mauker extends Room15User {

	boolean isRoomOwner = false;
	boolean hasCircle = true;
	boolean hasAndroidWear = true;

	public Mauker() {
		// TODO auto generated method stub
	}

	public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
	}

	public boolean hasAndroidWear() {
		return hasAndroidWear;
	}

	@Override
	public String toString() {
		return "Mauker plz";
	}
}