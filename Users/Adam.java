public class Adam{

	boolean isRoomOwner = true;
	boolean isDumbass = true;

	//Number of times Adam has lost his keystore
	int keystoreLost = 1;

	//Always returns true because Adam is an idiot and lost his keystore
	public boolean hasLostKeystore(){
		return true;
	}

	//Method that returns the number of times Adam has lost his keystore
	public int keystoreLostCount(){
		return keystoreLost;
	}

	public ArrayList<String> inLoveWith(){
		//Initialize list of lovers
    	ArrayList lovers = new ArrayList<String>();

    	//Add lovers in order from most in love to least
    	lovers.add("Tristan");
    	lovers.add("Karly");
    	lovers.add("Mauker");

    	//return lovers
		return lovers;
	}
}