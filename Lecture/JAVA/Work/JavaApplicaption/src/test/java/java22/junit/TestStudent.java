package java22.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import jutest.Student;

public class TestStudent {
    private static Student s = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        s = new Student();
    }
  
    @Test
    public void testGetgrade() {
       
            
       
       
      assertEquals( s.getgrade(100)  ,  "A"  );
      assertEquals( s.getgrade(90)  ,  "A"  );
      assertEquals( s.getgrade(89)  ,  "B"  );
      assertEquals( s.getgrade(80)  ,  "B"  );
      assertEquals( s.getgrade(79)  ,  "C"  );
      assertEquals( s.getgrade(70)  ,  "C"  );
      assertEquals( s.getgrade(69)  ,  "D"  );
      assertEquals( s.getgrade(60)  ,  "D"  );
      assertEquals( s.getgrade(59)  ,  "F"  );
     
      
      
    }
    
}
