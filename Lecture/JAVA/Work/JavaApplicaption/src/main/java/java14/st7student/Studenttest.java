package java14.st7student;

public class Studenttest extends Student {
    
    public String lab;
    
    //
    
    public String getLab() {
        return lab;
    }
    
    public void setLab(String lab) {
        this.lab = lab;
    }
    //
    
    public Studenttest() {
        super();
        
    }

    @Override
    public String toString() {
        return "Studenttest [lab=" + lab + ", toString()=" + super.toString()
                + "]";
    }

    public Studenttest(int number, String name, String phone, String lab) {
        super(number, name, phone);
        this.lab = lab;
    }

    
    
    //
    
}
