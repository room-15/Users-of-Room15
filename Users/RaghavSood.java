import skynet.Skynet;

public class RaghavSood extends Room15User  {
    public boolean isOwner = true;
    
    public RaghavSood() {
      return Skynet.analogueInterface();
    }
    
    public long firstSeen() {
      return 0;
    }
    
    public void summonBot() {
      Skynet.summonCloneWithName("AndroidBot");
    }
    
    public boolean isAsleep() {
      return false;
    }
}
