package ua.bychkovskyy.service.impl;

import org.springframework.stereotype.Service;
import ua.bychkovskyy.model.Game;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.service.GameService;

import java.util.Arrays;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    private Game game;

    @Override
    public List<Game> getActiveGames() {
        //todo remove stubs
        Player p1 = new Player();
        p1.setUserName("player1");
        Player p2 = new Player();
        p2.setUserName("player2");

        Game game = new Game(p1, p2);
        game.setId(1);

        Game game2 = new Game(p1, p2);
        game2.setId(2);
        return Arrays.asList(game, game2);
    }

    @Override
    public Game getGame(int id) {

        //TODO remove stubs
        Player p1 = new Player();
        p1.setUserName("player1");
        Player p2 = new Player();
        p2.setUserName("player2");

        if (game == null) {
            game = new Game(p1, p2);
        }
        game.setId(id);
        return game;
    }
}
