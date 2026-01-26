package com.example.low_level_design.TicTacToe;

import com.example.low_level_design.TicTacToe.Model.OPlayingPeace;
import com.example.low_level_design.TicTacToe.Model.Players;
import com.example.low_level_design.TicTacToe.Model.PlayingPeace;
import com.example.low_level_design.TicTacToe.Model.XPlayingPeace;

import java.util.Deque;
import java.util.LinkedList;

public class TicTacToeGame {
    Deque<Players> players;
    String name;

    TicTacToeGame(){
        initializeGame();
    }

    private void initializeGame() {
        // initialize players, board
        players=new LinkedList<>();

        PlayingPeace oPlayingPeace=new OPlayingPeace();
        PlayingPeace xPlayingPeace=new XPlayingPeace();

        Players player1=new Players(xPlayingPeace,"Player 1");
        Players player2=new Players(oPlayingPeace,"Player 2");

        players.add(player1);
        players.add(player2);

    }
}
