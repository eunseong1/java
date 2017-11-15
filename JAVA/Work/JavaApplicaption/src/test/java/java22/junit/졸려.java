package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jv22.junit.TT;


public class 졸려 {
    
    @Test
    public void test_add(){
        TT t = new TT(4,2);
        int a = t.add();
        assertSame(6, t);
    }
    @Test
    public void test_min(){
        
    }
    @Test
    public void test_mul(){
        
    }
    @Test
    public void test_div(){
        
    }
    
    
    
}
