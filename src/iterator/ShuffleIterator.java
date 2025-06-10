package iterator;

import java.util.random.RandomGenerator;

public class ShuffleIterator implements PlayListIterator<String>{

    private PlayList playList;
    private final RandomGenerator randomGenerator = RandomGenerator.getDefault();

    public ShuffleIterator(PlayList playlist){
        this.playList = playlist;
    }

    @Override
    public boolean hasNext() {
        return !playList.getSongsList().isEmpty();
    }

    @Override
    public String next() {
        return playList.getSongsList().remove(randomGenerator.nextInt(getSize()));
    }

    private int getSize(){
        return playList.getSongsList().size();
    }
}
