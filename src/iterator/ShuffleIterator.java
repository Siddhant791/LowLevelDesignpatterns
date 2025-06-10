package iterator;

import java.util.List;
import java.util.random.RandomGenerator;

public class ShuffleIterator implements PlayListIterator<String>{

    private final List<String> playList;
    private final RandomGenerator randomGenerator = RandomGenerator.getDefault();

    public ShuffleIterator(List<String> playlist){
        this.playList = playlist;
    }

    @Override
    public boolean hasNext() {
        return !playList.isEmpty();
    }

    @Override
    public String next() {
        return playList.remove(randomGenerator.nextInt(getSize()));
    }

    private int getSize(){
        return playList.size();
    }
}
