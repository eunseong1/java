package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jv22.junit.Oper;

public class TestOper2 {
    
    @Test
    public void test() {
        Oper o = new Oper(5, 5);
        int r = o.add();
        assertEquals(10, r);
    }
    
    @Test
    public void test_min() {
        Oper o = new Oper(5, 5);
        int r = o.min();
        assertEquals(0, r);
    }
    
    @Test
    public void mul() {
        Oper o = new Oper(5, 5);
        int r = o.mul();
        assertEquals(25, r);
    }
    
    @Test
    public void div() {
        Oper o = new Oper(5, 5);
        double r = o.div();
        
        assertEquals(1.0, r, 0.01);
    }
    
}
