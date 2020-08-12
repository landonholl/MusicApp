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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class recommendedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        ArrayList<Music> songs = new ArrayList<Music>();
        songs.add(new Music("Song: Savage", "Artist: Megan Thee Stalion", "Album: Suga"));
        songs.add(new Music("Song: Chamber of Reflection", "Artist: Mac DeMarco", "Album: Salad Days"));
        songs.add(new Music("Song: Queen", "Artist: Artronach's Aura", "Album: I Want to Leave"));
        songs.add(new Music("Song: Long Time - Intro", "Artist: Playboi Carti", "Album: Long Timem"));
        songs.add(new Music("Song: The Box", "Artist: Roddy Ricch", "Album: Please Excuse Me For Being Antisocial"));
        songs.add(new Music("Song: Oblivion", "Artist: Grimes", "Album: Visions"));
        songs.add(new Music("Song: Them Changes", "Artist: Thunder Cat", "Album: Drunk"));
        songs.add(new Music("Song: Blinding Lights", "Artist: The Weeknd", "Album: After Hours"));
        songs.add(new Music("Song: Wrap It", "Artist: Rollomatik", ""));
        songs.add(new Music("Song: Falling", "Artist: Trevor Daniel", "Album: Falling"));


        MusicAdapter adapter =
                new MusicAdapter(this , songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
