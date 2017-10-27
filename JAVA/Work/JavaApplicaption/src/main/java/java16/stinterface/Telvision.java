package java16.stinterface;

import java16.st2interface.serical;

public class Telvision implements RemoteContol, serical {

    @Override
    public void turnON() {
        System.out.println("Television.turnon()");
        
    }

    @Override
    public void turnOff() {
        System.out.println("Television.turnOff()");
        
    }

    @Override
    public void moveLeft() {
        System.out.println("Television.moveLeft()");
    }

    @Override
    public void moveRight() {
        System.out.println("Television.moveRight()");
    }

    @Override
    public void send() {
    }

    @Override
    public void receive() {
    }
    
}
