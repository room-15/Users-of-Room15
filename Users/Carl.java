@Deprecated
public class Carl extends Room15User {
  private boolean isRoomOwner = true;
	private boolean hasCircle = true;

  public Carl() {
    System.out.println("Warning: The class Carl is deprecated.  It has been in use for a long time and is too old to use");
  }
  
  public int getAge() {
    return Integer.MAX_VALUE;
  }
  
  public boolean isCircle(){
		return hasCircle;
	}

	public boolean isOwner(){
		return isRoomOwner;
	}
}
