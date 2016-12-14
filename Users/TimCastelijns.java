public class TimCastelijns extends Room15User implements Promoter {

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
}
