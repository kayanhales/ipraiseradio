package com.praisenation.ipraiseradio;

/**
 * Created by kayanhales on 6/24/15.
 */
public class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}



}
