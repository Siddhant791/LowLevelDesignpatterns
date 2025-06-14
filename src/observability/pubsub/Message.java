package observability.pubsub;

import java.sql.Timestamp;

/**
 * Represents a message in the pub/sub system.
 * Contains the message content and timestamp of creation.
 */
public class Message {
    // The content of the message
    private final String content;
    // Timestamp when the message was created
    private final Timestamp timestamp;

    /**
     * Creates a new message with the given content and current timestamp
     * @param message The content of the message
     */
    public Message(final String message){
        this.content = message;
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    /**
     * @return The content of the message
     */
    public String getContent() {
        return content;
    }

    /**
     * @return The timestamp when the message was created
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }
}
