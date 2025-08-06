package org.example.equalsHashGenericsEnum;

import java.util.Objects;

public class Song {

    private String title;
    private String artist;
    private int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != getClass()) return false;

        Song song = (Song) obj;
        return Objects.equals(artist, song.artist) && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(title,artist);
    }
}
