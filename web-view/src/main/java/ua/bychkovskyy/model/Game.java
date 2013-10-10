package ua.bychkovskyy.model;

import ua.bychkovskyy.model.chessboard.Figure;

import javax.servlet.AsyncContext;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private Player whitePlayer;
    private Player blackPlayer;
    private List<Figure> figures;
    private Integer id;
    private List<GameObserver> watchers = new LinkedList<GameObserver>();

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void addGameObserver(GameObserver observer){
        watchers.add(observer);
    }
}
