package com;



import org.junit.Test;

import static org.junit.Assert.*;


public class CarTest {


    @Test(expected = Exception.class)
    public void move() throws Exception {
        Car c = new Car();
        c.setPark(new Park(4,4));
        c.setDriver(new SimpleDriver());
        c.move(DriverOperation.TURN_CLOCKWISE);
        assertEquals(1,c.getPositionX());
        assertEquals(1,c.getPositionY());
        assertEquals(OrientationEnum.EAST,c.getOrientation());
        c.move(DriverOperation.MOVE_FORWARD);
        assertEquals(2,c.getPositionX());
        assertEquals(1,c.getPositionY());
        assertEquals(OrientationEnum.EAST,c.getOrientation());
        c.move(DriverOperation.TURN_CLOCKWISE);
        assertEquals(2,c.getPositionX());
        assertEquals(1,c.getPositionY());
        assertEquals(OrientationEnum.SOUTH,c.getOrientation());
        c.move(DriverOperation.MOVE_FORWARD);


    }



}
