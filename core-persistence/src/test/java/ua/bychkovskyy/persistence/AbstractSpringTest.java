package ua.bychkovskyy.persistence;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/persistence-config.xml")
public abstract class AbstractSpringTest {

    @PersistenceContext
    private EntityManager manager;

    @Before
    public void abstractSetUp() throws Exception {
        manager.setFlushMode(FlushModeType.COMMIT);
    }

    public EntityManager getEntityManager() {
        return manager;
    }
}
