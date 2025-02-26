public abstract class RequestCreator {
    public abstract Request createRequest();

    public void processRequest() {
        Request request = createRequest();
        request.processRequest();
    }
}
