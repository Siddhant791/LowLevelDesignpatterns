package iterator;

public class SimpleIterator implements PlayListIterator<String>{

    PlayList list;
    int current;

    public SimpleIterator(PlayList list){
        this.list = list;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < list.getSongsList().size();
    }

    @Override
    public String next() {
        String returnedSong = list.getSongsList().get(current);
        current++;
        return returnedSong;
    }
}
