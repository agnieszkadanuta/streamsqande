package pl.agnieszkadanuta;

public class Track {

    int rating;
    String name;

    public Track(String name, int rating) {
        this.rating = rating;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' + "rating = " + rating +
                '}';
    }
}
