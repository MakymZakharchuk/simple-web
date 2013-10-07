package ua.bychkovskyy.persistence;

import ua.bychkovskyy.model.Player;

import java.util.List;

public interface PlayerDao extends GenericDao<Player> {
    List<Player> findAll();
}
