public class MartinClient extends MeetingClient {
    @Override
    protected String getName() {
        return "Martin Montero";
    }

    @Override
    protected int getServerCode() {
        return 8082;
    }

    public static void main(String[] args) {
        new MartinClient().run();
    }
}