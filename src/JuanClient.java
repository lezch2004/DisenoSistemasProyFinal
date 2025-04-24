public class JuanClient extends MeetingClient {
    @Override
    protected String getName() {
        return "Juan Perez";
    }

    @Override
    protected int getServerCode() {
        return 8081;
    }

    public static void main(String[] args) {
        new JuanClient().run();
    }
}