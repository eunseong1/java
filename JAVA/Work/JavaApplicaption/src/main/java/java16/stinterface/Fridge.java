package java16.stinterface;


public class Fridge implements RemoteContol {
    
    @Override
    public void turnON() {
        System.out.println("Fridge.turnon()");
        
    }
    
    @Override
    public void turnOff() {
        
        System.out.println("Fridge.turnoff()");
    }

    @Override
    public void moveLeft() {
        
        System.out.println("Fridge.moveLeft()");
    }

    @Override
    public void moveRight() {
      
        System.out.println("Fridge.moveRight()");
    }
    
}
