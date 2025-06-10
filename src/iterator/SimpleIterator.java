package iterator;

import java.util.List;

public class SimpleIterator implements PlayListIterator<String>{

    List<String> list;
    int current;

    public SimpleIterator(List list){
        this.list = list;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < list.size();
    }

    @Override
    public String next() {
        String returnedSong = list.get(current);
        current++;
        return returnedSong;
    }
}
