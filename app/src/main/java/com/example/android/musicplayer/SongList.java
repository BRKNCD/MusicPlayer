package com.example.android.musicplayer;

import java.util.ArrayList;

public class SongList {
    ArrayList<Song> song = new ArrayList<Song>();

    public ArrayList<Song> songList() {

        song.add(new Song("Eminem", "The Real Slim Shady", "The Marshall Mathers LP"));
        song.add(new Song("Broken Code", "They Know", "No Tears For The Dead"));
        song.add(new Song("Muse", "Space Dementia", "Origin Of Symmetry"));
        song.add(new Song("Broken Code", "What Are You Afraid Of?", "No Tears For The Dead"));
        song.add(new Song("Jamie xx", "Gosh", ""));
        song.add(new Song("Eminem", "Amityville", "The Marshall Mathers LP"));
        song.add(new Song("Muse", "Resistance", "Resistance"));
        song.add(new Song("Muse", "Bliss", "Origin Of Symmetry"));
        song.add(new Song("Eminem", "The Way I Am", "The Marshall Mathers LP"));
        song.add(new Song("Ophidian", "Abandon", "Abandon / End The Earth"));
        song.add(new Song("Ruffneck", "LSD '97", "The World Of The LSD User"));
        song.add(new Song("Nine Inch Nails", "Right Where It Belongs", "With Teeth"));

        return song;
    }
}
