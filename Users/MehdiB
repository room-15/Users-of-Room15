public class MehdiB extends Room15User {

	private final static String TlDr            = "Do yourself a favor, watch this https://www.youtube.com/watch?v=DXriKwXXkn8, then ping me if you liked it.";
	private final static String SpaceException  = "Tab key is located in the 1st column, 3rd row of a keyboard. Refer to https://goo.gl/Vap1sJ";
	
	public MehdiB () {
		System.out.println (TlDr);
	}
	
	public boolean findsJokeFunny (Joke joke) {
		if (!joke instanceof Sarcasm) {
			return false;
		}
		
		return ((Sarcasm)joke).getWeight () > 0.72; // 0 -> 1 (best) 
	}
	
	public void spaceForIndentation () throws Exception {
		throw new Exception (SpaceException);
	}
	
	public boolean usesTabs () {
		return true;
	}
	
	@Override
	public boolean isTiredOfDaveShit () {
		return false;
	}
}
