package ua.bychkovskyy.factory;

import ua.bychkovskyy.model.chessboard.Figure;
import ua.bychkovskyy.model.chessboard.FigureType;
import ua.bychkovskyy.model.chessboard.Position;

import java.util.ArrayList;
import java.util.List;

public class FiguresFactory {
    private static List<Figure> figures;

    public static List<Figure> getFigures() {
        figures = new ArrayList<Figure>(32);
        initFigures();
        return figures;
    }

    private static void initFigures() {
        initFigures(true);
        initFigures(false);
    }

    private static void initFigures(boolean isWhite) {
        String horizontal = isWhite ? "1" : "8";
        figures.add(createFigure(isWhite, FigureType.ROOK, new Position(horizontal, "a")));
        figures.add(createFigure(isWhite, FigureType.ROOK, new Position(horizontal, "h")));

        figures.add(createFigure(isWhite, FigureType.BISHOP, new Position(horizontal, "c")));
        figures.add(createFigure(isWhite, FigureType.BISHOP, new Position(horizontal, "f")));

        figures.add(createFigure(isWhite, FigureType.KNIGHT, new Position(horizontal, "b")));
        figures.add(createFigure(isWhite, FigureType.KNIGHT, new Position(horizontal, "g")));

        figures.add(createFigure(isWhite, FigureType.KING, new Position(horizontal, "e")));
        figures.add(createFigure(isWhite, FigureType.QUEEN, new Position(horizontal, "d")));

        horizontal = isWhite ? "2" : "7";
        for (char i = 'a'; i <= 'h'; i++) {
            figures.add(createFigure(isWhite, FigureType.PAWN, new Position(horizontal, i + "")));
        }
    }

    private static Figure createFigure(boolean isWhite, FigureType type, Position position) {
        Figure result = new Figure(isWhite, type);
        result.setPosition(position);
        return result;
    }
}
