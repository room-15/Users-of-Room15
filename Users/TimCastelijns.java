public class TimCastelijns extends Room15User implements Promoter {

    // http://chat.stackoverflow.com/transcript/message/35324997#35324997
    public static final int MAX_THREADS = 10239;
    
    private Realm realm;
    private List<Room15User> bestFriends;

    public TimCastelijns() {
        realm = Realm.getDefaultInstance();

        bestFriends = new ArrayList<>() {{
            add(new MarkOSullivan94());
            add(new ColdFire());
        }};

        this.add(self);
    }

    /**
     * Prints out a markdown formatted message that promotes the use of Realm.
     * <p>
     * This method gets called at random intervals, but never more than 2 days apart.
     */
    @Override
    void promote() {
        System.out.println(String.format("Check out this library >>[Realm](%s)<< it's awesome!", realm.getWebsiteUrl()));
    }
    
    /**
    * Checks if Tim is real(m)
    *
    * returns true it's really Tim, false otherwise.
    **/
    public boolean isTim() {
        return isPromotingRealm();
    }
}
