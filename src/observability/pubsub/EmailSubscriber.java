package observability.pubsub;

/**
 * Implementation of a Subscriber that handles email-based notifications
 */
public class EmailSubscriber implements Subscriber{

    // Name of the email subscriber
    private final String subscriberName;

    /**
     * Creates a new email subscriber
     * @param subscriberName Name of the subscriber to receive email notifications
     */
    public EmailSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * Subscribes to a specific topic to receive email notifications
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
     * Processes the received message by sending it via email
     * @param message The message to be sent via email
     */
    @Override
    public void update(Message message) {
        System.out.println("Email is sent with " + message.getContent() + " to " + this.subscriberName);
    }

    /**
     * @return The name of the subscriber
     */
    public String getSubscriberName() {
        return subscriberName;
    }
}
