package iterator;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<String> songsList = new ArrayList<>();

    public PlayList(){}

    public PlayList(List<String> listOfSongs){
        this.songsList = listOfSongs;
    }

    public List<String> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<String> songsList) {
        this.songsList = songsList;
    }

    public void addSong(String song) {
        songsList.add(song);
    }
}
