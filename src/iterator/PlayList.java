package iterator;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    List<String> songsList = new ArrayList<>();
    private String name;

    public PlayList(String name){
        this.name = name;
    }

    public PlayList(List<String> listOfSongs){
        this.songsList = listOfSongs;
        this.name = "Default Name";
    }

    public List<String> getSongsList() {
        return songsList;
    }

    public String getName() {
        return name;
    }

    public void setSongsList(List<String> songsList) {
        this.songsList = songsList;
    }

    public void addSong(String song) {
        songsList.add(song);
    }
}
