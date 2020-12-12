package ru.m.lab9;

public class task1_people {
    private String  INN;
    private String FIO;
    int money;

    public task1_people(String INN, String FIO, int money) {
        this.INN = INN;
        this.FIO = FIO;
        this.money = money;
    }

    public String  getINN() {
        return INN;
    }

    public String getFIO() {
        return FIO;
    }
}
