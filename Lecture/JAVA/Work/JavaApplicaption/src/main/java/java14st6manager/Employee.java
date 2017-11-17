package java14st6manager;

public class Employee {
    private String name    = "";
    private String address = "";
    protected int  salary  = 0;
    private String rrn     = "";
    
    // gettersetter
    
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
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public String getRrn() {
        return rrn;
    }
    
    public void setRrn(String rrn) {
        this.rrn = rrn;
    }
    
    // toString
    
    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }
    
    // constructor
    
    public Employee() {
        super();
    }
    
}
