package observability.pubsub;

public interface Subscriber {
    public boolean subscribe(Topic topic);
    public boolean unsubscribe(Topic topic);
    public void update(Message message);
}
