package java14st6manager;

public class manager extends Employee {
    
    private int bounus = 0;
    
    /////
    public int getBounus() {
        return bounus;
    }
    
    public void setBounus(int bounus) {
        this.bounus = bounus;
    }
    ////
    
    ////
    
    public void test() {
        
        String info = "name" + super.getName();
        info = info + ", adderss" + super.getAddress();
        info = info + ", salary" + super.salary;
        info = info + ", rrn " + super.getRrn();
        
        System.out.println(info);
    }
    
    public manager() {
        super();
    }

    public void setSalary(String string) {
    
        
    }

    public void setRrn(int i) {
      
    }
   
    
}
