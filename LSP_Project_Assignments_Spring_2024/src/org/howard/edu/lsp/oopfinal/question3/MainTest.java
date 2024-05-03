package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void testCreateCircle() {
        Shape circle = Main.createShape("Circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = Main.createShape("Rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
}
