package iterator;

import java.util.ArrayList;

public class PlayListIteratorFactory {

    private final PlayList playlist;

    public PlayListIteratorFactory(PlayList playlist){
        this.playlist = playlist;
    }

    public PlayListIterator<String> iterator(String type){
        if (type.equalsIgnoreCase("Simple"))
        {
            return new SimpleIterator(new ArrayList<>(playlist.getSongsList()));
        }
        else if (type.equalsIgnoreCase("Shuffle")) {
            return new ShuffleIterator(new ArrayList<>(playlist.getSongsList()));
        }
        else {
            throw new RuntimeException("Not a correct type of iterator type");
        }
    }
}
