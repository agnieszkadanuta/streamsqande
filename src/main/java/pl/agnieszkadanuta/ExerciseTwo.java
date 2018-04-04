package pl.agnieszkadanuta;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Exercise from
 * https://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
 * <p>
 * Convert the following code into a new implementation that uses lambda expressions and aggregate operations
 * instead of nested for loops.
 * Hint: Make a pipeline that invokes the filter, sorted, and collect operations, in that order.
 */
public class ExerciseTwo {

    public static void main(String[] args) {

        List<Album> albums = createAlbums();
        List<Album> favs = selectFavoriteAlbums(albums);
        showAlbums(favs);

       /*
       //wersja bez streama

       for (Album album : albums) {
            boolean hasFavorite = false;
            for (Track t : album.getTracks()) {
                if (t.getRating() >= 4) {
                    hasFavorite = true;
                    break;
                }
            }
            if (hasFavorite)
                favs.add(album);
        }
        Collections.sort(favs, new Comparator<Album>() {
            public int compare(Album a1, Album a2) {
                return a1.getName().compareTo(a2.getName());
            }
        });*/

    }

    private static List<Album> selectFavoriteAlbums(List<Album> albums){
        return albums.stream().filter(album -> album.hasFavorite())
                .sorted(Comparator.comparing(Album::getName)).collect(Collectors.toList());
    }

    private static void showAlbums(List<Album> albums) {
        albums.forEach(album -> System.out.println(album));
    }

    private static List<Album> createAlbums() {

        List<Album> albums = new ArrayList<>();

        albums.add(createAlbum("Gorillaz",
                new Track("Clint Eastwood", 5), new Track("Broken", 3), new Track("On melancholy Hill", 5)));
        albums.add(createAlbum("Radiohead",
                new Track("Surprise", 2), new Track("Creep", 5), new Track("High and Dry", 2), new Track("Witch", 5)));
        albums.add(createAlbum("Nick Cave",
                new Track("High Blossom Blues", 5), new Track("Skeletons Tree", 5), new Track("Ship Song", 5), new Track("Weeping Song", 2)));
        albums.add(createAlbum("Portis Head",
                new Track("Glory Box", 2), new Track("It's a fire", 3), new Track("Mystery", 1)));

        return albums;
    }

    private static Album createAlbum(String name, Track ...tracks){
        return new Album(name, Arrays.asList(tracks));
    }
}
