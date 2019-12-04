public class Mauker extends Room15User {

	private boolean isRoomOwner = false;
	private boolean hasCircle = true;
	private boolean hasWearOS = true;
	private boolean hasHat = true;
	private boolean hasMSc = true;
	private boolean hasPhD = false;
	
	private ArrayList<Color> hatColors;

	public Mauker() {
		// TODO auto generated method stub
		if (hasHat) {
			hatColors = new ArrayList<>();
			hatColors.add(Color.BLACK);
			hatColors.add(Color.WHITE);
		}	
	}

	public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
	}

	public boolean hasWearOS() {
		return hasWearOS;
	}

	public boolean hasHat() {
		return hasHat;
	}
	
	public boolean hasMSc() {
		return hasMSc;
	}
	
	public boolean hasPhD() {
		return hasPhD;
	}

	public ArrayList<Color> getHatColors() {
		if (hasHat) {
			if (hatColors != null) {
				return hatColors;
			}
		}
		return null;
	}
	
	public void plz() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Mauker plz";
	}
}
