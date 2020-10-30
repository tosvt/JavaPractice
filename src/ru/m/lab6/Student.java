package ru.m.lab6;

public class Student implements Comparable {
    private int iDNum;
    public Student(int iDNum) {
        this.iDNum = iDNum;
    };
    public void setiDNum(int iDNum) {
        this.iDNum = iDNum;
    }
    public int getiDNum(){
        return iDNum;
    }

    @Override
    public int compareTo(Object o) {
        return this.iDNum > ((Student)o).iDNum ?  1 : -1;
    }
}

