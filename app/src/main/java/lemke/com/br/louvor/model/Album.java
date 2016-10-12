package lemke.com.br.louvor.model;

import java.util.List;

/**
 * Created by Matheus Lemke on 12-Oct-16.
 */

public class Album {
    private String name;
    private List<Praise> praises;
    private Artist artist;
    private List<Artist> secondaryArtists;
}
