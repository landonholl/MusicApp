/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;



import java.util.ArrayList;

public class myMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        ArrayList<Music> songs = new ArrayList();
        songs.add(new Music("Song: All The Smoke, Pt. 2", "Artist: Elijah Ghost", "Album: All The Smoke, Pt. 2"));
        songs.add(new Music("Song: Ballbreaker", "Artist: AC/DC", "Album: BallBreaker"));
        songs.add(new Music("Song: At The Mall", "Artist: Plus Crier", "Album: At the Mall"));
        songs.add(new Music("Song: The End of Evangelion", "Artist: Komm Susser Tod", "Album: Evangelion OST"));
        songs.add(new Music("Song: Honeycomb Highway", "Artist: SEGA SOUND TEAM", "Album: SONIC LOST WORLD OST"));
        songs.add(new Music("Song: Shake The Room!", "Artist: The Funk Hunters", ""));
        songs.add(new Music("Song: Step!", "Artist: Mio Honda", ""));
        songs.add(new Music("Song: Song for Denis - Maxi Ver.", "Artist: Piano Fantasia", "Album: Best Collector: Piano Fantasia"));
        songs.add(new Music("Song: Homage", "Artist: Mild High Club", "Album: SkipTracing"));
        songs.add(new Music("Song: Resonance", "Artist: Home", "Album: Odyssey"));


        MusicAdapter adapter =
                new MusicAdapter(this , songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
