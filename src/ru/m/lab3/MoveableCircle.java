package ru.m.lab3;


public class MoveableCircle implements Moveable{
    private int radius;
    private MoveablePoint center;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "It is moveable circle";
    }

    @Override
    public void moveUp(){
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown(){
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft(){
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight(){
        center.x += center.xSpeed;
    }
}
