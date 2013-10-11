package ua.bychkovskyy.model;

import ua.bychkovskyy.factory.FiguresFactory;
import ua.bychkovskyy.model.chessboard.Figure;

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
        this.figures = FiguresFactory.getFigures();
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

    public void addGameObserver(GameObserver observer) {
        watchers.add(observer);
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
