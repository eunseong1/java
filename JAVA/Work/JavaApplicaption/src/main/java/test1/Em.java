package test1;


public class Em {
    
    private String name ="어은성";
    private String address ="ddd";
    private int salary= 999;
    private String rrn = "aaa";
    
    
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
    
    
   
    
    @Override
    public String toString() {
        return "Em [name=" + name + ", address=" + address + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }
    
    public Em() {
        super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }
    
    
    
    
    
}
