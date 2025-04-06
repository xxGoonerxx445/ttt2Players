package com.example.tictactoe2players;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GameActivty extends AppCompatActivity {
    private FbModule fbModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activty);
        BoardGame boardGame=new BoardGame(this);
        setContentView(boardGame);
        fbModule=new Position(line,col);
        fbModule.setPositionInFireBase();
    }

    public void setPositionFromFb(Position position) {
    }

    public void setNewTouch(int line, int col) {
        Position position=new Position(line,col);
        fbModule.setPositionInFireBase(position);
    }
}