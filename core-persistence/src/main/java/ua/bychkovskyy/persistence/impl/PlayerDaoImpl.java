package ua.bychkovskyy.persistence.impl;


import org.springframework.stereotype.Service;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.persistence.PlayerDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
public class PlayerDaoImpl extends AbstractDao<Player> implements PlayerDao {

    @PersistenceContext
    private EntityManager em;

    public PlayerDaoImpl() {
        setPersistenceClass(Player.class);
    }

    @Override
    public Player find(Object pk) {
        return super.find(pk);
    }

    @Override
    public void delete(Player entity) {
        super.delete(entity);
    }

    @Override
    public void save(Player entity) {
        super.save(entity);
    }

    @Override
    public Player update(Player entity) {
        return super.update(entity);
    }

    @Override
    public List<Player> findAll() {
        Query query = em.createQuery("SELECT P FROM Player P");
        return query.getResultList();
    }
}
