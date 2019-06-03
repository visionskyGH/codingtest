package com;

public class SimpleDriver implements Driver {
    public void move(DriverOperation operation, Car c)throws Exception {
        switch (operation){
            case MOVE_FORWARD:
                moveForward(c);
                break;
            case TURN_CLOCKWISE:
                turnClockwise(c);

        }
    }

    private void moveForward(Car c)throws Exception{
        System.out.println("Car move forward");
        int x = c.getPositionX();
        int y = c.getPositionY();
        if(OrientationEnum.EAST.equals(c.getOrientation())){
            x++;
        }else if(OrientationEnum.SOUTH.equals(c.getOrientation())){
            y--;
        }else if(OrientationEnum.NORTH.equals(c.getOrientation())){
            x--;
        }else{
            x++;
        }
        if(x<=0||x>c.getPark().getXsize()||y<=0||y>c.getPark().getYsize()){
            throw new RuntimeException("Move out of the park");
        }
        c.setPositionX(x);
        c.setPositionY(y);
    }

    private void turnClockwise(Car c){
        System.out.println("Car turnClockwise");
        OrientationEnum orientation = OrientationEnum.EAST;
        if(OrientationEnum.EAST.equals(c.getOrientation())){
            orientation = OrientationEnum.SOUTH;
        }else if(OrientationEnum.SOUTH.equals(c.getOrientation())){
            orientation = OrientationEnum.WEST;
        }else if(OrientationEnum.WEST.equals(c.getOrientation())){
            orientation = OrientationEnum.NORTH;
        }
        c.setOrientation(orientation);
    }
}
