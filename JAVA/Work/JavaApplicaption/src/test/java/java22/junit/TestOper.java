package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jv22.junit.Oper;

public class TestOper {

    @Test
    public void testadd() {
        
        
       Oper op = new Oper(2,4);
       
      int rs =  op.add();
      
      assertEquals(6, rs);
    }
    
}
