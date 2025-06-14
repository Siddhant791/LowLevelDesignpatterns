package observability.pubsub;

public class PaperPublisher implements Publisher{
    private final String name;

    public PaperPublisher(String name) {
        this.name = name;
    }

    @Override
    public void publish(Topic topic, Message message) {
        topic.publish(message);
    }

    public String getName() {
        return name;
    }
}
