package observability.pubsub;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a topic in the pub/sub system.
 * A topic maintains a list of subscribers and handles message distribution.
 */
public class Topic {
    // List of subscribers interested in this topic
    private List<Subscriber> listOfSubscribers;
    // Name of the topic
    private String name;

    /**
     * Creates a new topic with the given name
     * @param name The name of the topic
     */
    public Topic(String name) {
        this.listOfSubscribers = new ArrayList<>();
        this.name = name;
    }

    /**
     * @return The list of subscribers for this topic
     */
    public List<Subscriber> getListOfSubscribers() {
        return listOfSubscribers;
    }

    /**
     * @return The name of the topic
     */
    public String getName() {
        return name;
    }

    /**
     * Publishes a message to all subscribers of this topic
     * @param message The message to be distributed to all subscribers
     */
    public void publish(Message message){
        // Notify all subscribers about the new message
        for (Subscriber subscriber : listOfSubscribers){
            subscriber.update(message);
        }
    }
}
