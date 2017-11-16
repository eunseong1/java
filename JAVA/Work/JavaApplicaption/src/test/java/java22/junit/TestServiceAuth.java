package java22.junit;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.ModelAuth;
import java23.jdbc.ServiceAuth;

public class TestServiceAuth {
    private static ServiceAuth s = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
            s = new ServiceAuth();
    }
    

    @Test
    public void testGetCount() throws SQLException {
       ModelAuth auth = null;
       int rs =   s.getCount(auth );
       
       //검증 인스턴스 검증 , 값 검증 
       
       assertEquals(3, rs);
    }
    
    @Test
    public void testGetMaxAuthid() throws SQLException {
        
      int rs =  s.getMaxAuthid();
      
      assertEquals(7, rs);
        
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        
     ResultSet rs =   s.selectAll();
        
         /*rs.next();
         
         assertEquals("1970.05.01" , rs.getString("birth"));*/
         
         //인스턴스 검증
         assertNotNull(rs);
         //값으로 검증
         //1.갯수로 검증
         
          ModelAuth auth = null;
        int count = s.getCount(auth );
        
        //ResultSet 갯수 가져오기
        rs.last(); // 마지막 row 로 커서이동
        int countset = rs.getRow(); // 현재 커서의 index 값을 가져오기
        
        assertEquals(count, countset);
        
        
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        
      
        ModelAuth auth = new ModelAuth();
        
        auth.setName("park");
        
        ResultSet rs =   s.selectLike(auth);
        
        rs.last();
      
        String s = rs.getString("name");
     
        assertEquals(s, "park");
      
      
        
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        
        ModelAuth auth = new ModelAuth();
        auth.setName("bob");
        
        ResultSet rs =  s.selectEqual(auth );
        
        rs.next();
               
        String result = rs.getString("name");
        assertEquals("bob", result);
        
   
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
       
      ModelAuth auth = new ModelAuth();
      
      
      
      ResultSet rs = s.selectDynamic(auth );
      
      
      
    }
    
    @Test
    public void testInsertAuth() throws SQLException {
       
        ModelAuth auth = new ModelAuth();
        
        auth.setAuthid(999);
        auth.setName("sss");
        auth.setBirth("2017-01-01");
        
        int rs =  s.insertAuth(auth );
        
        assertTrue(rs >=0);
        
    }
    
    @Test
    public void testUpdateAuth() throws SQLException {
       
        ModelAuth whereauth = new ModelAuth();
        ModelAuth setauth = new ModelAuth();
        
        setauth.setName("2323");
        setauth.setBirth("fff");
        whereauth.setAuthid(999);
        
        
        
        int rs = s.updateAuth(whereauth, setauth);
        
        assertTrue(rs >= 0);
        
    }
    
    @Test
    public void testDeleteAuth() throws SQLException {
        
        
        ModelAuth auth = new ModelAuth();
        
        auth.setAuthid(999);
        
       int rs = s.deleteAuth(auth );
        
       assertTrue(rs >= 0);
       
    }
    
}
