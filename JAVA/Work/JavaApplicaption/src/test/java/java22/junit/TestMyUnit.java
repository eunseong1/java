package java22.junit;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import jv22.junit.MyUnit;


public class TestMyUnit {
    private static MyUnit myunit = null;
    
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        myunit = new MyUnit();
    }
    
    
    @Test
    public void testConcate () {
      String resutl = null;
    try {
        resutl = myunit.concate("ab","12");
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
    }
        assertEquals("ab12", resutl);
    }
    @Test
    public void testGetBoolean() {
        boolean re = myunit.getBoolean();
        assertFalse(re);
        assertEquals(re,false);
        assertSame(re, false);
    }
    @Test
    public void testGetSameObject() {
        Object r = myunit.getSameObject();              // null검증
        assertSame(null, r);
        
        assertNull(r);
        assertEquals(null, r);
    }
    @Test
    public void testObject() {
        Object a = myunit.getObject();
        
        assertNull(a);
        assertEquals(null, a);
        assertSame(null , a);
    }
    @Test
    public void testGetStringArray() {
        String[] v = myunit.getStringAray();
        String [] expected = {"one", "two", "three"};
        assertArrayEquals(expected , v);
    }
    @Test(expected = ArithmeticException.class) //.class 꼭 넣을것! 메서드 안에서 예외처리를 정상적으로 하려고
    public void testGetException() {
        myunit.getException(); // ArithmeticException 발생
    }
    @Test(expected = ArithmeticException.class)
    public void testGetEmptyList() {
        ArrayList<String> list = myunit.getEmptyList();
        list.get(0);
    }
    

}
