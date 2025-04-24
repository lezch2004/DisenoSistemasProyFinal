public class DanielClient extends MeetingClient {
    @Override
    protected String getName() {
        return "Daniel Fellig";
    }

    @Override
    protected int getServerCode() {
        return 8084;
    }

    public static void main(String[] args) {
        new DanielClient().run();
    }
}