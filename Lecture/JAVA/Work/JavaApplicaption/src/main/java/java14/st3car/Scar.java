package java14.st3car;

public class Scar extends Car {
    
    private boolean turbo;
    
    // getter setter
    
    public boolean isTurbo() {
        return turbo;
    }
    
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
    
    // toString
    
    @Override
    public String toString() {
        return "Scar [turbo=" + turbo + ", toString()=" + super.toString()
                + "]";
    }
    
 // constructor

    public Scar() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Scar(int speed, int gear, String color) {
        super(speed, gear, color);
        // TODO Auto-generated constructor stub
    }
////////////////////////////////////////////////////////////////
    public Scar(boolean turbo) {
        super();
        this.turbo = turbo;
    }
////////////////////////////////////////////////////////////////
    public Scar(int speed, int gear, String color, boolean turbo) {
        super(speed, gear, color);
        this.turbo = turbo;
    }  //= Car(int speed, int gear, String color,)

    public Scar(String color, boolean turbo) {
        super(color);
        this.turbo = turbo;
    }
    
    

    
    
}
