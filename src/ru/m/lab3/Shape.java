package ru.m.lab3;


public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){}

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    abstract public String toString();

}

class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }

    public Circle(double radius){
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }

}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 1;
        this.length = 1;
        this.color = "yellow";
        this.filled = false;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return (length*2)+(width*2);
    }
    @Override
    public String toString(){
        return "Shape: Rectangle, length: "+this.length+", width: "+this.width;
    }
}

class Square extends Rectangle {
    public Square(){
        this.width = 1;
        this.length = 1;
        this.color = "green";
        this.filled = false;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
    }


    public void setWidth(double side){
        this.width = side;
    }

    public void setLength(double side){
        this.length = side;
    }
    @Override
    public String toString(){
        return "Shape: Square, side: "+this.length+", color: "+this.color;
    }
}

