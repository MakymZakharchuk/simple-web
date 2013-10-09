package ua.bychkovskyy.model.chessboard;

public class Figure {
    private Position position;
    private boolean isWhite;
    private FigureType type;

    public Figure(boolean white, FigureType type) {
        isWhite = white;
        this.type = type;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public FigureType getType() {
        return type;
    }
}
