package jutest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    private static Oper op = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
         op = new Oper(5, 3);
    }
    
    @Test
    public void testAdd() {
      int rs =  op.add();
      
      assertEquals(rs, 8);
      assertNotEquals(rs, 5);
     
      assertTrue(8 == rs);
      assertFalse(1 == rs);
      
    }
    
    @Test
    public void testMinus() {
      int rs = op.minus();
      
      assertEquals(rs, 2);
      assertNotEquals(rs, 5);
      
      assertTrue(2 == rs);
      assertFalse(5 == rs);
      
    }
    
    @Test
    public void testMul() {
      
       int rs = op.mul();
       
       assertEquals(rs, 15);
       assertNotEquals(rs, 5);
       
       assertTrue(15 == rs);
       assertFalse(1 == rs);
       
    }
    
    @Test
    public void testDiv() {
        double rs = op.div();
        
        assertEquals(1.6667, rs, 0.1);
        assertNotEquals(rs, 5);
        
        assertTrue(1.6666666666666667 == rs);
        assertFalse(1 == rs);
        
    }

  
    
}
