package java14.stanimal;


public class Animal {
    
    public  void sleep(){
        System.out.println("sleep");
    }
    public void eat(){
        System.out.println("eat");
    }
    
    @Override
    public String toString() {
        return "Animal [getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
    
    
   
  
}
