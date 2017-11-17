package jutest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    private static Rect re = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
         re = new Rect(10,20);
        
    }
    
    @Test
    public void testArea() {
        int r = re.area();
        
        assertEquals(r, 200);
        assertNotEquals(r, 1);
        
        assertFalse(11 == r );
        assertTrue(200 == r);
        
        
        
    }
    
    @Test
    public void testPerimeter() {
        
        int r = re.perimeter();
        
        assertEquals(r, 60);
        assertNotEquals(r, 1);
        
        assertFalse(11 == r );
        assertTrue(60 == r);
        
        
    }
    
}
