package com.example.background_music_player;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {

    Button btn_start;
    Button btn_end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start = findViewById(R.id.btn_start);
        btn_end = findViewById(R.id.btn_end);


        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyServices.class);
                startService(intent);
            }
        });

        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyServices.class);
                stopService(intent);
            }
        });






    }


}