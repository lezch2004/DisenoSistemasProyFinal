public class EstebanClient extends MeetingClient {
    @Override
    protected String getName() {
        return "Esteban Silva";
    }

    @Override
    protected int getServerCode() {
        return 8085;
    }

    public static void main(String[] args) {
        new EstebanClient().run();
    }
}