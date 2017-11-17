package java16.stinterface;


public class RemoteControlTest {
    public static void main(String[] args) {
        
        
        RemoteContol obj = new Telvision();
        
        
        
        obj.turnON();
        obj.turnOff();
        
        obj = new Fridge();
        
        
        obj.turnON();
        obj.turnOff();
    }
   
}
