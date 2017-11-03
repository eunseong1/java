package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jv22.junit.Rect;

public class TestRect {
   private static Rect r = null;
   
   @BeforeClass
   public static void setUpBeforeClass() throws Exception{
       System.out.println("setupBefore");  // 한번만 생성
       r = new Rect();
       r.setHeight(2);
       r.setWidth(30);
   }
       
    @Test
    public void test() {
        
        int a = r.area();
        
        assertEquals(60, a);
        
        assertTrue(60 == a);
        assertFalse(80 == a);
    }
   
    
    @Test
    public void test2(){
        int d = r.per();
        
        assertNotEquals(100, d, 5);
        
    }
    
    @Before
    public void setup() throws Exception{
        System.out.println("setup");         //여러번 생성
    }
    
    
    @Test
    public void test_type(){
        Object r2 = r.type();
        assertNull(r2);
    }
    
    
}
