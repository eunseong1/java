package java23.jdbc;


public class ModelA {
                                                  
    private Integer  authid = null;  // `authid` INT(11) NOT NULL,             
    private String  name = "";   //`name` VARCHAR(50) NULL DEFAULT NULL,           
    private String  birth = "";  // `birth` VARCHAR(10) NULL DEFAULT NULL,  
    
    //get set   
    
    public Integer getAuthid() {
        return authid;
    }
    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    
    // toString
    @Override
    public String toString() {
        return "ModelA [authid=" + authid + ", name=" + name + ", birth="
                + birth + "]";
    }   
    
    //default constructor
    public ModelA() {
        super();
    }
                                  
   
    
  
   
    
}                                               
                                                