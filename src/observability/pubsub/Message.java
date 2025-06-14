package observability.pubsub;

import java.sql.Timestamp;

public class Message {
    private final String content;
    private final Timestamp timestamp;

    public Message(final String message){
        this.content = message;
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    public String getContent() {
        return content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
