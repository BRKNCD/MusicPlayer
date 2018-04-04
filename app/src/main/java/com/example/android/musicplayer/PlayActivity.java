package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayActivity extends AppCompatActivity {

    boolean isPlaying;

    TextView artistText;
    TextView titleText;
    TextView albumText;

    ImageButton play;
    ImageButton prev;
    ImageButton next;
    ImageButton back;

    int position;

    SongList songList = new SongList();
    final ArrayList<Song> song = songList.songList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_layout);

        isPlaying = true;

        artistText = findViewById(R.id.artist_text_view);
        titleText = findViewById(R.id.title_text_view);
        albumText = findViewById(R.id.album_text_view);

        play = findViewById(R.id.play);
        prev = findViewById(R.id.prev);
        next = findViewById(R.id.next);
        back = findViewById(R.id.back);

        play.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);

        Bundle extras = getIntent().getExtras();

        position = extras.getInt("POSITION");

        setInfo(position);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isPlaying = !isPlaying;
                if (isPlaying) {
                    play.setImageResource(R.drawable.ic_pause_circle_filled_black_24dp);
                } else {
                    play.setImageResource(R.drawable.ic_play_circle_filled_black_24dp);
                }
            }
        });


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position--;
                position = position % song.size();
                setInfo(position);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position++;
                position = position % song.size();
                setInfo(position);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayActivity.this, SongActivity.class);
                startActivity(intent);
            }
        });
    }

    public void setInfo(int position) {
        Song item = song.get(position);
        String artist = item.getArtistName();
        String title = item.getTitle();
        String album = item.getAlbum();

        artistText.setText(artist);
        titleText.setText(title);
        albumText.setText(album);
    }
}