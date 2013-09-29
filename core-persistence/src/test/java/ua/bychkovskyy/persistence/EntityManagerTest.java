package ua.bychkovskyy.persistence;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class EntityManagerTest extends AbstractSpringTest {
    @Test
    public void testEntityManagerTest() throws Exception {
        assertNotNull(getEntityManager());
    }
}
