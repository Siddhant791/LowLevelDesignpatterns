import iterator.IteratorUtils;
import iterator.PlayListIterator;
import iterator.PlayListIteratorFactory;
import iterator.PlayList;
import observability.pubsub.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("In Main method of LLD");

//        PlayList myPlayList = new PlayList("My Custom Playlist");
//        myPlayList.addSong("Song 1");
//        myPlayList.addSong("Song 2");
//        myPlayList.addSong("Song 3");
//        myPlayList.addSong("Song 4");
//
//        PlayListIteratorFactory factory = new PlayListIteratorFactory(myPlayList);
//        PlayListIterator<String> it = factory.iterator("Shuffle");
//        System.out.println("Now playing in shuffled order");
//        IteratorUtils.printAll(it);
//
//        System.out.println("Now playing in proper order");
//        it = factory.iterator("Simple");
//        IteratorUtils.printAll(it);


        // PUB / SUB model

        Publisher p1 = new PaperPublisher("Times Of India");
        Topic news = new Topic("News");
        Topic sports = new Topic("Sports");
        Subscriber siddhant = new EmailSubscriber("Siddhant");
        Subscriber tanya = new SmsSubscriber("Tanya");
        Subscriber harish = new SmsSubscriber("Harish");

        siddhant.subscribe(sports);
        siddhant.subscribe(news);
        harish.subscribe(sports);

        p1.publish(news, new Message("Donald trump wom the election"));

        System.out.println("First message is published and subscribed successfully");

        p1.publish(sports, new Message("India won the world cup"));

        harish.unsubscribe(sports);

        p1.publish(sports, new Message("China won gold medal in long jump in olymics"));
    }
}
