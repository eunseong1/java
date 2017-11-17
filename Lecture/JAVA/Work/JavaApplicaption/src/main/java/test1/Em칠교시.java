package test1;

public class Em칠교시 {
    
    private String name    = "  ";
    private String address = " ";
    private int    salary  = 0;
    private String rrn     = " ";
    
    //
    
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
    
    //
    @Override
    public String toString() {
        return "Em칠교시 [name=" + name + ", address=" + address + ", salary="
                + salary + ", rrn=" + rrn + "]";
    }
    
    //
    public Em칠교시() {
        super();
    }
    
    //
    public Em칠교시(String name, String address, int salary, String rrn) {
        super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }
    
}
