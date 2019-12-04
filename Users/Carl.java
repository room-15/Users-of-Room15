@Legacy
public class Carl extends Room15User {

    private boolean isRoomOwner = true;
    private boolean hasCircle = false; //traitor
    private boolean isMerman = true;

    public Carl() {
        System.out.println("Warning: The class Carl is now legacy code as it has been in use for so long.");
        System.out.println("As an alternative, consider using class: Users-of-Room15.users.Adam.java");
    }

    public int getAge() {
        return Integer.MAX_VALUE;
    }

    public boolean isCircle() {
        return hasCircle;
    }

    public boolean isOwner() {
        return isRoomOwner;
    }

    public boolean isMerman() {
        return isMerman;
    }
}
