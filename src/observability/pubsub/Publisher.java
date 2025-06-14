package observability.pubsub;

/**
 * Interface representing a publisher in the pub/sub pattern.
 * Publishers are responsible for publishing messages to specific topics.
 */
public interface Publisher {
    /**
     * Publishes a message to a specific topic
     * @param topic The topic to publish the message to
     * @param message The message content to be published
     */
    public void publish(Topic topic , Message message);
}
