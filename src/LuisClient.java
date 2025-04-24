public class LuisClient extends MeetingClient {
    @Override
    protected String getName() {
        return "Luis Zaldumbide";
    }

    @Override
    protected int getServerCode() {
        return 8083;
    }

    public static void main(String[] args) {
        new LuisClient().run();
    }
}