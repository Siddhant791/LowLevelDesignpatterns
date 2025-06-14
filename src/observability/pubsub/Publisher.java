package observability.pubsub;

public interface Publisher {
    public void publish(Topic topic , Message message);
}
