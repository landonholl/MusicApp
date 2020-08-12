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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView my_music = (TextView) findViewById(R.id.my_music);

        my_music.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myMusicIntent = new Intent(MainActivity.this, myMusicActivity.class);

                startActivity(myMusicIntent);
            }
        });


        TextView recommended = (TextView) findViewById(R.id.recommended);

        recommended.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recommendeIntent = new Intent(MainActivity.this, recommendedActivity.class);
                startActivity(recommendeIntent);
            }
        });
    }
}
