package java13.st4emp;


public class Employee {
    
    private String name;
    private String address; 
    private String rrn;
    private int salar;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSalar() {
        return salar;
    }
    public void setSalar(int salar) {
        this.salar = salar;
    }
    public String getRrn() {
        return rrn;
    }
    public void setRrn(String rrn) {
        this.rrn = rrn;
    }
    
    //
    
    public Employee() {
        
    }
    
    //
    public Employee(String name, String address, int salar, String rrn) {
        super();
        this.name = name;
        this.address = address;
        this.salar = salar;
        this.rrn = rrn;
    }
 
    
    
}
