package ua.bychkovskyy.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.persistence.AbstractSpringTest;
import ua.bychkovskyy.persistence.PlayerDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.Assert.assertEquals;

@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class PlayerServiceTest extends AbstractSpringTest {
    @Autowired
    private PlayerService playerService;

    @Autowired
    private PlayerDao playerDao;

    @PersistenceContext
    private EntityManager em;

    @Test
    public void testSave() throws Exception {
        Player p = new Player();
        p.setUserName("aa");
        playerDao.save(p);

        p = new Player();
        p.setUserName("bb");
        playerDao.save(p);

        em.flush();
        em.close();

        List<Player> result = playerService.getAllPlayers();

        assertEquals(2, result.size());
    }
}
