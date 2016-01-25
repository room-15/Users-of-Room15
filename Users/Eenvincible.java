import java.util.*;

public class Eenvincible extends Room15User {
    private List<InspirationalQuotes> mQuotes = new ArrayList<>();
    
    private boolean mCircle = true;
    
    public Eenvincible() {
        mQuotes.ensureCapacity(Integer.MAX_VALUE);
    }
    
    public boolean isCircle() {
        return mCircle;
    }
}
