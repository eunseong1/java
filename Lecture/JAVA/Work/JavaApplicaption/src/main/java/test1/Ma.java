package test1;

public class Ma extends Em {
    
    private int bouns = 0;
    
    public void test() {
        
    } 
    //

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    @Override
    public String toString() {
        return "Ma [bouns=" + bouns + "]";
    }

    public Ma(String name, String address, String rrn, int salary, int bouns) {
        super(name, address, rrn, salary);
        this.bouns = bouns;
    }

    public Ma() {
        super();
        
    }

  
    
    
    
   
    
    
    
}
