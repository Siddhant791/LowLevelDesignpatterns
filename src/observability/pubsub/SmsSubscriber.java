package observability.pubsub;

/**
 * Implementation of a Subscriber that handles SMS-based notifications
 */
public class SmsSubscriber implements Subscriber{
    // Name of the SMS subscriber
    private final String subscriberName;

    /**
     * Creates a new SMS subscriber
     * @param subscriberName Name of the subscriber to receive SMS notifications
     */
    public SmsSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * Subscribes to a specific topic to receive SMS notifications
     * @param topic The topic to subscribe to
     * @return true if subscription was successful
     */
    @Override
    public boolean subscribe(Topic topic) {
        return topic.getListOfSubscribers().add(this);
    }

    /**
     * Unsubscribes from a specific topic
     * @param topic The topic to unsubscribe from
     * @return true if unsubscription was successful
     */
    @Override
    public boolean unsubscribe(Topic topic) {
        return topic.getListOfSubscribers().remove(this);
    }

    /**
     * Processes the received message by sending it via SMS
     * @param message The message to be sent via SMS
     */
    @Override
    public void update(Message message) {
        System.out.println("SMS is sent with " + message.getContent() + " to " + this.subscriberName);
    }

    /**
     * @return The name of the subscriber
     */
    public String getSubscriberName() {
        return subscriberName;
    }
}
