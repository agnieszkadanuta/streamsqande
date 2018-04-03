package java.agnieszkadanuta;

import java.util.ArrayList;
import java.util.List;

public class Album {


    private String name;
    private List<Track> tracks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }


    public boolean hasFavorite() {

        return tracks.stream().anyMatch(track -> track.getRating() >= 4);

    }

}
