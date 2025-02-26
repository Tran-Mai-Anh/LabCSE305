public class HighPriorityConcreteCreator extends RequestCreator {
    @Override
    public Request createRequest() {
        return new HighPriorityRequest();
    }
}
