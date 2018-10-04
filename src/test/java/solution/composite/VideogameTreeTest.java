package solution.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solution.Videogame;

import static org.junit.jupiter.api.Assertions.*;

class VideogameTreeTest {

    Videogame videogame;
    VideogameComponent videogameComponent1,videogameComponent2;

    @BeforeEach
    void beforeEach() {
        videogame = new Videogame("1", "Final Fantasy");
        videogameComponent1 = new VideogameLeaf(videogame);
        videogameComponent2 = new VideogameComposite("composite");
    }

    @Test
    void testViewLeaf() {
        assertEquals("1",videogameComponent1.view());
    }

    @Test
    void testViewComposite() {
        assertEquals("composite",videogameComponent2.view());
    }

}
