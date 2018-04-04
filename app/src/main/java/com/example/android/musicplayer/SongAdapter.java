package com.example.android.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> song) {
        super(context, 0, song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, parent, false);
        }

        Song currentSong = getItem(position);

        // Find the TextView in the song_list.xml layout with the ID version_name
        TextView artistName = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist name from the currentSong object and
        // set this text on the name TextView
        artistName.setText(currentSong.getArtistName());

        // Find the TextView in the song_list.xml layout with the ID version_name
        TextView songTitle = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the song title from the currentSong object and
        // set this text on the name TextView
        songTitle.setText(currentSong.getTitle());

        // Find the TextView in the song_list.xml layout with the ID version_name
        TextView albumName = (TextView) listItemView.findViewById(R.id.album_text_view);
        // Get the album name from the currentSong object and
        // set this text on the name TextView
        albumName.setText(currentSong.getAlbum());

        return listItemView;
    }
}
