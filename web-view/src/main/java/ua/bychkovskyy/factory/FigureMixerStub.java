package ua.bychkovskyy.factory;

import ua.bychkovskyy.model.chessboard.Figure;
import ua.bychkovskyy.model.chessboard.Position;

import java.util.List;
import java.util.Random;

public class FigureMixerStub {
    public static void mixFigures(final List<Figure> figures) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    if (i == figures.size() ) {
                        i = 0;
                    }
                    Figure f1 = figures.get(i);
                    f1.setPosition(getRandomPosition());
                    i++;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t = new Thread(r);

        t.start();
    }

    private static Position getRandomPosition() {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        Random random = new Random();
        int i = random.nextInt(8);
        int j = random.nextInt(8);
        return new Position((i + 1) + "", chars[j] + "");

    }
}
