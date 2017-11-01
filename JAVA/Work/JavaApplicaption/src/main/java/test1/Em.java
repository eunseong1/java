package test1;

public class Em {
    
    private String name    = "";
    private String address = "";
    private String rrn     = "";
    protected int  salary  = 0;
    
    
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
    public String getRrn() {
        return rrn;
    }
    public void setRrn(String rrn) {
        this.rrn = rrn;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
   
    @Override
    public String toString() {
        return "Em [name=" + name + ", address=" + address + ", rrn=" + rrn
                + ", salary=" + salary + "]";
    }
    public Em(String name, String address, String rrn, int salary) {
        super();
        this.name = name;
        this.address = address;
        this.rrn = rrn;
        this.salary = salary;
    }
   
    public Em() {
        super();
    }
   
    
    
   
    
  
   
    
    
}
