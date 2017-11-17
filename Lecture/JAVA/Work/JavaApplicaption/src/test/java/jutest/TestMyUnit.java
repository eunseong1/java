package jutest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyUnit {
    private static MyUnit my = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
            my = new MyUnit();
    }
    
    
    @Test
    public void testConcate() {
        
        String s = my.concate("e", "d");
        
        
        assertEquals("x", "ed", s);
        assertNotSame(null, "x", s);
        assertNotNull(s);
        assertEquals("ed", s);
    }
    
    @Test
    public void testGetBoolean() {
       
        boolean s = my.getBoolean();
        
        assertFalse(s);
  
            
    }
    
    @Test
    public void testGetSameObject() {
       
        Object o = my.getSameObject();
        

        
       assertSame(null, o);
       
       assertNull(o);
       assertEquals(null, o);
        
    }
    
    @Test
    public void testGetObject() {
        
        Object o = my.getObject();
        
        assertEquals(null, o);
        
        
        
    }
    
    @Test
    public void testGetStringArray() {
        
        String [] o = my.getStringArray();
        String [] x = {"one", "two", "three"};
        assertArrayEquals(x, o);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetException() {
     
        my.getException();
    }
    
    @Test(expected = java.lang.IndexOutOfBoundsException.class)
    public void testGetEmptyList() {
        
        ArrayList<String> list = my.getEmptyList();
        list.get(0);
        
        
    }
    
}
