import iterator.IteratorUtils;
import iterator.PlayListIterator;
import iterator.PlayListIteratorFactory;
import iterator.PlayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("In Main method of LLD");

        PlayList myPlayList = new PlayList("My Custom Playlist");
        myPlayList.addSong("Song 1");
        myPlayList.addSong("Song 2");
        myPlayList.addSong("Song 3");
        myPlayList.addSong("Song 4");

        PlayListIteratorFactory factory = new PlayListIteratorFactory(myPlayList);
        PlayListIterator<String> it = factory.iterator("Shuffle");
        System.out.println("Now playing in shuffled order");
        IteratorUtils.printAll(it);

        System.out.println("Now playing in proper order");
        it = factory.iterator("Simple");
        IteratorUtils.printAll(it);
    }
}
