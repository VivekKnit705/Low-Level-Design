package com.example.low_level_design.TicTacToe.Model;

public class Players {
    PlayingPeace playingPeace;
    String name;

    public Players(PlayingPeace playingPeace, String name) {
        this.playingPeace = playingPeace;
        this.name = name;
    }
}
