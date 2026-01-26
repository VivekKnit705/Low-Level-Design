package com.example.low_level_design.TicTacToe.Model;

public enum PlayingPeaceEnum {
    XPEACE("X"), OPEACE("O");
    private final String peace;

    PlayingPeaceEnum(String peace) {
        this.peace = peace;
    }
}
