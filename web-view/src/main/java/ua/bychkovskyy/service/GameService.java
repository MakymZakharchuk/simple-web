package ua.bychkovskyy.service;

import ua.bychkovskyy.model.Game;

import java.util.List;

public interface GameService {
    List<Game> getActiveGames();
    Game getGame(int id);
}
