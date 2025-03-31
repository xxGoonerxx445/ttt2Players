package com.example.tictactoe2players;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GameActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activty);
        BoardGame boardGame=new BoardGame(this);
        setContentView(boardGame);
    }
}