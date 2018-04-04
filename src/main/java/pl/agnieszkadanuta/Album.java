package pl.agnieszkadanuta;

import java.util.ArrayList;
import java.util.List;

public class Album {


    private String name;
    private List<Track> tracks = new ArrayList<>();

    public Album(String name, List<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }


    public boolean hasFavorite() {

        return tracks.stream().anyMatch(track -> track.getRating() >= 4);

    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
