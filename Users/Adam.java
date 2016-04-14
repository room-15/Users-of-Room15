public class Adam extends Room15User {

	private float speed = 0.0;
	private float ping = Float.MAX_VALUE; // Expressed in ms.
	private boolean isRoomOwner = true;
	private boolean isDumbass = true;
	private boolean hasCircle = true;

	// TODO Create method to find keystore.
	private KeyStore ks;

	//Number of times Adam has lost his keystore
	int keystoreLost = 1;

	private ArrayList<DadJoke> dadJokes;

	private ArrayList<String> tristanRandomLinksBuffer;

	public Adam() {
		ks = null;
		dadJokes = new ArrayList<>();
		tristanRandomLinksBuffer = new ArrayList<>();
		dadJokes.ensureCapacity(Integer.MAX_VALUE);
		tristanRandomLinksBuffer.ensureCapacity(Integer.MAX_VALUE);
	}

	//Always returns true because Adam is an idiot and lost his keystore
	public boolean hasLostKeystore(){
		return true;
	}

	public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
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
    	lovers.add("Mauker");
    	lovers.add("Karley");
    

    	//return lovers
		return lovers;
	}

	@Override
	public Object clone(){
		// Soon that will be true.
		return new сodeMagic();
	}
}
