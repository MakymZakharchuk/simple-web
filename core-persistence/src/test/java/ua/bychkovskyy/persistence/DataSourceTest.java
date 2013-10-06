package ua.bychkovskyy.persistence;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

import static org.junit.Assert.assertNotNull;

public class DataSourceTest extends AbstractSpringTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testDataSource() throws Exception {
        assertNotNull(dataSource);

    }
}
