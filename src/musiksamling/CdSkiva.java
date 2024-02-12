package musiksamling;

import java.util.Objects;

public class CdSkiva {
    private String artist;
    private String album;

    public CdSkiva(String artist, String album) {
        this.album = album;
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "CdSkiva{" +
                "artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CdSkiva cdSkiva = (CdSkiva) o;
        return Objects.equals(album, cdSkiva.album) && Objects.equals(artist, cdSkiva.artist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(album, artist);
    }
}
