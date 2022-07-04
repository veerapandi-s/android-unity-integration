package com.ragefan.pacman;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.unity3d.player.UnityPlayerActivity;


public class UnityHolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity_holder);
        Button button = findViewById(R.id.unityClick);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(UnityHolderActivity.this, UnityPlayerActivity.class);
            startActivity(intent);
        });
    }

    public int onGameFinish(int score) {
        Log.d("onGameFinishing", String.valueOf(score));
        return 1;
    }

}