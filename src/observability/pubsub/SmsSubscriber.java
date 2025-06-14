package observability.pubsub;

public class SmsSubscriber implements Subscriber{
    private final String subscriberName;

    public SmsSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public boolean subscribe(Topic topic) {
        return topic.getListOfSubscribers().add(this);
    }

    @Override
    public boolean unsubscribe(Topic topic) {
        return topic.getListOfSubscribers().remove(this);
    }

    @Override
    public void update(Message message) {
        System.out.println("SMS is sent with " + message.getContent() + " to " + this.subscriberName);
    }

    public String getSubscriberName() {
        return subscriberName;
    }
}
