package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DaoAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    public DaoAuth(Connection conn) {
        super();
        this.conn = conn;
    }
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {   
        
        
        // 컬럼명을 이용하여 값을 추출
        int result = -1;
        try {
            //SQL 쿼리문 작성
            String sql = " select count(*) total from auth ";
            
            //문장 객체 생성
            java.sql.PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            //문장 객체 실행 : executeQuery() = select로 실행할때 or executeUpdate() 나머지것들
            ResultSet rs = stmt.executeQuery();
            
            // 커서를 다음 row 로 이동
            rs.next();
            
            result = rs.getInt("total");
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return result;
    }
    


    @Override
    public int getMaxAuthid() throws SQLException { 
        int sss = -1;
        try {
            //SQL 쿼리문 작성
            String s = " select max(authid) authid from auth ";
            
            //문장 객체 생성
            java.sql.PreparedStatement st = this.conn.prepareStatement(s);
            
            //문장 객체 실행 : executeQuery() or executeUpdate() 
            ResultSet r =  st.executeQuery();
            
            
            r.next();
            
            sss = r.getInt("authid");
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return sss;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException { 
        //문장 객체 실행 : executeQuery() or executeUpdate()
        ResultSet r = null;
        try {
            //SQL 쿼리문 작성
            String s = " select * from auth ";
            
            //문장 객체 생성
            java.sql.PreparedStatement st = this.conn.prepareStatement(s);
            
            r = st.executeQuery();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        
        
        return r;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {  
        //SQL 쿼리문 작성
        
        ResultSet r = null;
        
        try {
            //찾고자 하는 값은 ? 로 바꾼다
            String s = " select * from auth where name like ? ";
            
            //문장 객체 생성
            java.sql.PreparedStatement stmt = this.conn.prepareStatement(s);
            
            //? 자리에 값을 넣기
            stmt.setString(1, "%"+ auth.getName()+"%");
            
          //문장 객체 실행 : executeQuery() or executeUpdate()
            r = stmt.executeQuery();
            
        } catch (Exception e) {        
            e.printStackTrace();          
        }
        
        return r;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        //문장 객체 실행 : executeQuery() or executeUpdate()
        ResultSet r = null;
        try {
            //SQL 쿼리문 작성
            String s = " select * from auth where name = ? ";
            
            
            //문장 객체 생성
            java.sql.PreparedStatement stmt = this.conn.prepareStatement(s);
            
           stmt.setString(1,  auth.getName() );
            
            r = stmt.executeQuery();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        
        return r;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException { 
       
        
        
        ResultSet ss = null;
        try {
            //SQL 쿼리문 작성
                                        String q = " select * from auth \n ";
                                               q += " where 1 =1 \n " ;
    if(auth.getAuthid() != null)          q +=" and authid = ? \n ";
    if(!auth.getName().isEmpty())         q += " and name = ?  \n ";
    if(!auth.getBirth().isEmpty())        q += " and birth = ? \n ";
                   
     
            //문장 객체 생성
            java.sql.PreparedStatement st = this.conn.prepareStatement(q);
    

            //문장 객체 실행 : executeQuery() or executeUpdate()
            ss = st.executeQuery();
           
            if(auth.getAuthid() != null){
                st.setInt(1, auth.getAuthid());
            }
            if(!auth.getName().isEmpty()){
                st.setString(1, auth.getName());   
            }else if (!auth.getName().isEmpty()){
                 st.setString(2, auth.getName());
            }
            if(!auth.getBirth().isEmpty()){
                st.setString(1, auth.getBirth());
                
            }else if(!auth.getBirth().isEmpty()){
                
                st.setString(2, auth.getBirth());
                
            }else if(!auth.getBirth().isEmpty()){
                
                st.setString(3, auth.getBirth());
            }
            
            
        } catch (Exception e) {
          
            e.printStackTrace();
            
        }
     
        return ss;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {  
        
        int r = -1;
        try {
            //SQL 쿼리문 작성
            String s = " insert into ";
            s += "  auth(authid,name,birth) ";
            s += " values(?,?,?)  ";
            
            //문장 객체 생성
            java.sql.PreparedStatement st = this.conn.prepareStatement(s);
            
          //? 자리에 값을 넣기
            st.setInt(1, auth.getAuthid());
            st.setString(2, auth.getName());
            st.setString(3, auth.getBirth() );
            
          //문장 객체 실행 : executeQuery() or executeUpdate()
            r = st.executeUpdate();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        return r;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {     
        
        int r = -1;
        try {
            //SQL 쿼리문 작성
            String s = " update auth  ";
            s += " set name = ? , birth = ?  ";       
            s += "where  1 = 1	";
            s += "and authid = ? " ;
            
            
            //문장 객체 생성
            
            java.sql.PreparedStatement st = this.conn.prepareStatement(s);
            
            st.setString(1, setauth.getName());
            st.setString(2, setauth.getBirth());
            st.setInt(3 , whereauth.getAuthid());
            
            //문장 객체 실행 : executeQuery() or executeUpdate()
          r =  st.executeUpdate();
            
        } catch (Exception e) {
            
           
            e.printStackTrace();
            
        }
        
        return r;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException { 
       
        int r = -1;
        try {
            
            //SQL 쿼리문 작성
            String s = "";
            s += "  delete from auth ";
            s += "  where 1 = 1  ";
            s += " and authid = ? ";
        
            
            //문장 객체 생성
            java.sql.PreparedStatement st = this.conn.prepareStatement(s);
            
            //? 자리에 값을 넣기
            st.setInt(1, auth.getAuthid());
        
            
            //문장 객체 실행 : executeQuery() or executeUpdate()
           r = st.executeUpdate();
           
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return r;
    }
    
}
