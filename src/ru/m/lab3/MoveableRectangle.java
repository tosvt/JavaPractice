package ru.m.lab3;


public class MoveableRectangle implements Moveable {
    private MoveablePoint topLeft;
    private MoveablePoint bottomRight;

    MoveableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "It's moveable rectangle set: " + topLeft.x + ", " + bottomRight.y + " and  " + bottomRight.xSpeed + ", " + topLeft.ySpeed + " speed";
    }

    @Override
    public void moveUp(){
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown(){
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft(){
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight(){
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}

