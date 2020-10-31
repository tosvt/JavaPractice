package ru.m.lab7;

public class Stack {

    private int size;
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.size = m;
        stackArray = new int[size];
        top = -1;
    }

    public void addElement(int element) {
        stackArray[++top] = element;
    }

    public int deleteElement() {
        return stackArray[top--];
    }

    public int readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}