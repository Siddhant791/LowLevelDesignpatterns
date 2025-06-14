package observability.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<Subscriber> listOfSubscribers;
    private String name;

    public Topic(String name) {
        this.listOfSubscribers = new ArrayList<>();
        this.name = name;
    }

    public List<Subscriber> getListOfSubscribers() {
        return listOfSubscribers;
    }

    public String getName() {
        return name;
    }

    public void publish(Message message){
        for (Subscriber subscriber : listOfSubscribers){
            subscriber.update(message);
        }
    }
}
