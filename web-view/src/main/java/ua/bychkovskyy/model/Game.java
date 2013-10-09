package ua.bychkovskyy.model;

import ua.bychkovskyy.model.chessboard.Figure;

import java.util.List;

public class Game {
    private Player whitePlayer;
    private Player blackPlayer;
    private List<Figure> figures;

    public Game(Player whitePlayer, Player blackPlayer) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
    }

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }
}
