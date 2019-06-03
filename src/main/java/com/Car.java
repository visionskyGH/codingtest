package com;

public class Car {

    private int positionX;

    private int positionY;

    private OrientationEnum orientation;

    private Park park;

    private Driver driver;

    public Car() {
        this.positionX = 1;
        this.positionY = 1;
        this.orientation = OrientationEnum.NORTH;
    }

    public Car(int positionX, int positionY, OrientationEnum orientation) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.orientation = orientation;
    }

    public void move(DriverOperation operation)throws Exception{
        driver.move(operation,this);
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public OrientationEnum getOrientation() {
        return orientation;
    }

    public void setOrientation(OrientationEnum orientation) {
        this.orientation = orientation;
    }


    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void printInfo(){
        System.out.println(String.format("PositionX:%s",this.positionX));
        System.out.println(String.format("PositionY:%s",this.positionY));
        System.out.println(String.format("Orientation:%s",this.orientation));
        System.out.println();
    }
}
