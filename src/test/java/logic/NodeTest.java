package logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void NodeSetAsBombIsBomb() {
        Node bomb = new Node(true);

        assertTrue(bomb.isBomb());
    }
}
