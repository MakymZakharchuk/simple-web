package ua.bychkovskyy.service;


import ua.bychkovskyy.model.Player;

import java.util.List;

public interface PlayerService {
    void deletePlayer(Player player);

    Player updatePlayer(Player player);

    Player getPlayer(String userName);

    List<Player> getAllPlayers();

    void saveNewPlayer(Player player);
}
