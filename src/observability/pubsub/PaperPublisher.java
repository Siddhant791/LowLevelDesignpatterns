package observability.pubsub;

/**
 * Implementation of a Publisher that represents a newspaper publisher
 */
public class PaperPublisher implements Publisher{
    // Name of the newspaper publisher
    private final String name;

    /**
     * Creates a new paper publisher with the given name
     * @param name Name of the newspaper publisher
     */
    public PaperPublisher(String name) {
        this.name = name;
    }

    /**
     * Publishes a message to the specified topic
     * @param topic The topic to publish the message to
     * @param message The message to be published
     */
    @Override
    public void publish(Topic topic, Message message) {
        topic.publish(message);
    }

    /**
     * @return The name of the publisher
     */
    public String getName() {
        return name;
    }
}
