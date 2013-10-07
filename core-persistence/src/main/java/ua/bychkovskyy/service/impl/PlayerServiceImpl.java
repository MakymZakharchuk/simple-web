package ua.bychkovskyy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.persistence.PlayerDao;
import ua.bychkovskyy.service.PlayerService;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    private PlayerDao playerDao;

    @Override
    @Transactional
    public void deletePlayer(Player player) {
        playerDao.delete(player);
    }

    @Override
    @Transactional
    public Player updatePlayer(Player player) {
        return playerDao.update(player);
    }

    @Override
    public Player getPlayer(String userName) {
        return playerDao.find(userName);
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerDao.findAll();
    }
}
