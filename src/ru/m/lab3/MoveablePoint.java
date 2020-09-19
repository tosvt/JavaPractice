package ru.m.lab3;


public class MoveablePoint implements Moveable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "Movable point x: "+this.x+" y: "+y;
    }

    @Override
    public void moveUp(){
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown(){
        this.y -= this.ySpeed;
    }

    @Override
    public void moveLeft(){
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight(){
        this.x += this.xSpeed;
    }
}
