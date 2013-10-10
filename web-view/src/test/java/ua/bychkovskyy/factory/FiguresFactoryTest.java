package ua.bychkovskyy.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FiguresFactoryTest {
    @Test
    public void testGetFigures() throws Exception {
        assertEquals(32, FiguresFactory.getFigures().size());
    }
}
