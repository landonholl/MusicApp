package com.example.android.musicApp;

public class Music {

    private String mSongName;
    private String mArtist;
    private String mAlbum;

    public Music(String songName, String artist, String album){
        mSongName = songName;
        mArtist = artist;
        mAlbum = album;
    }

    public String getSongName(){return mSongName;}

    public String getArtist(){return mArtist;}

    public String getAlbum(){return mAlbum;}
}
