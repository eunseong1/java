package java12.st4emp;

public class Emp {
    
    private String name;
    private double salary;
    private int    count;
    
   
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    
    ////
    @Override
    public String toString() {
        return "Emp [name=" + name + ", salary=" + salary + ", count=" + count
                + "]";
    }
    
    
    
    
}
