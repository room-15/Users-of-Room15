public class Asim extends Room15User {

	private boolean confused = true;
	
	private boolean usesWeirdVariableNames = true;
	
	public Asim() {
		System.out.println("Thanks for initializing me");	
	}

	public boolean isConfused(){
		return confused;
	}

	public boolean usesWeirdNames(){
		return usesWeirdVariableNames;
	}

	@Override
	public String toString() {
		return "I am not a String";
	}
	
	@Override
	public boolean isTiredOfDaveShit () {
		System.out.println("I don't know him");
		return false;
	}
}
