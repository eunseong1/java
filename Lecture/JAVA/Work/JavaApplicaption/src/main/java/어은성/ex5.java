package 어은성;

public class ex5 {
    
    private String name   = "";
    private String addr   = "";
    private String rrn    = "";
    protected int  salary = 0;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddr() {
        return addr;
    }
    
    public void setAddr(String addr) {
        this.addr = addr;
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
        return "ex5 [name=" + name + ", addr=" + addr + ", rrn=" + rrn
                + ", salary=" + salary + "]";
    }
    
    public ex5(String name, String addr, String rrn, int salary) {
        super();
        this.name = name;
        this.addr = addr;
        this.rrn = rrn;
        this.salary = salary;
    }
    
    public ex5() {
        super();
    }
    
}
