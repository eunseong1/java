package jutest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayList {
    static List<String> list = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
      
            
            list = new ArrayList<String>();
            
            list.add("0");
            list.add("2");
            list.add("1");
            list.add("3");
            list.add("4");
            
        }
        
    
    
    @Test
    public void test01() {
        boolean b =  list.add("0");
        
        assertNotNull(list);
        
    }
    
    @Test
    public void test02() {
       int b = list.size();
        
        assertEquals(5, b);
        
    }
    @Test
    public void test03() {
        
      boolean b = list.contains("10");
        
        assertNotSame("10", list);
        
    }
    @Test
    public void test04() {
        
        
        String [] names1 = {"y2kpooh","hwang"};
        String [] names2 = {"y2kpooh","hwang"};
        
        assertEquals(names1, names2);
        assertArrayEquals(names1, names2);
        
    }
}
