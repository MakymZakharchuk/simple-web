package ua.bychkovskyy.model.chessboard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {
    @Test
    public void testEqualAndHashCode() throws Exception {
        Position p1 = new Position("1","1");
        Position p2 = new Position("1","1");
        assertEquals(p1, p2);
        assertEquals(p1.hashCode(), p2.hashCode());
    }
}
