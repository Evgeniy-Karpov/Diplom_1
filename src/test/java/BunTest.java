package praktikum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BunTest {

    @Test
    void testGetName() {
        Bun bun = new Bun("black bun", 100);
        assertEquals("black bun", bun.getName());
    }

    @Test
    void testGetPrice() {
        Bun bun = new Bun("white bun", 200);
        assertEquals(200, bun.getPrice());
    }

    @Test
    void testCreateBunWithNullName() {
        Bun bun = new Bun(null, 100);
        assertNull(bun.getName());
    }

    @Test
    void testCreateBunWithNegativePrice() {
        Bun bun = new Bun("red bun", -50);
        assertEquals(-50, bun.getPrice());
    }
}