package com.example.android.musicplayer;

/**
 * Created by Gian on 29/03/2018.
 */

public class Song {

    private String mArtistName;
    private String mTitle;
    private String mAlbum;

    public Song(String artistName, String songTitle, String album) {
        mArtistName = artistName;
        mTitle = songTitle;
        mAlbum = album;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAlbum() {
        return mAlbum;
    }


}
