package observability.pubsub;

/**
 * Interface representing a subscriber in the pub/sub pattern.
 * Subscribers can subscribe to topics and receive updates when messages are published.
 */
public interface Subscriber {
    /**
     * Subscribes to a specific topic
     * @param topic The topic to subscribe to
     * @return true if subscription was successful, false otherwise
     */
    public boolean subscribe(Topic topic);

    /**
     * Unsubscribes from a specific topic
     * @param topic The topic to unsubscribe from
     * @return true if unsubscription was successful, false otherwise
     */
    public boolean unsubscribe(Topic topic);

    /**
     * Receives updates when a message is published to a subscribed topic
     * @param message The message that was published
     */
    public void update(Message message);
}
