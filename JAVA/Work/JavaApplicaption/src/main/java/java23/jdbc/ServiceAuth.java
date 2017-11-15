package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    public ServiceAuth() throws Exception {
        super();
        this.conn = DBConnect.makeConnection();
    }
    
    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            // DAO에 있는 SQL 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.getCount(auth);
            
            // 트랜잭션 커밋
            this.conn.commit();
            
            // 트랜잭션 롤백
            this.conn.rollback();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            // DAO에 있는 SQL 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.getMaxAuthid();
            
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // 트랜잭션 롤백
            this.conn.rollback();
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        ResultSet rs = null;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            // DAO에 있는 SQL 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectAll();
            
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // 트랜잭션 롤백
            this.conn.rollback();
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            // DAO에 있는 SQL 실행
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectLike(auth);
            
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // 트랜잭션 롤백
            this.conn.rollback();
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        ResultSet rs = null;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
             rs = dao.selectEqual(auth);
            
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // 트랜잭션 롤백
            this.conn.rollback();
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectDynamic(auth);
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // 트랜잭션 롤백
            this.conn.rollback();
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.insertAuth(auth);
            // 트랜잭션 커밋
            this.conn.commit();
            
        } catch (Exception e) {
            // 트랜잭션 롤백
            this.conn.rollback();
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.updateAuth(whereauth, setauth);
            
            // 트랜잭션 커밋
            this.conn.commit();
            
           
        } catch (Exception e) {
            // 트랜잭션 롤백
            this.conn.rollback();
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        
        int rs = -1;
        try {
            // 트랜잭션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.deleteAuth(auth);
            
            // 트랜잭션 커밋
            this.conn.commit();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

            // 트랜잭션 롤백
            this.conn.rollback();
            
        }
        
        return rs;
    }
    
}
