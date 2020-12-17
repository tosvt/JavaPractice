package ru.m.lab6;

import java.util.Scanner;

public class Task1Start {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Сколько студентов?");
        int n=scanner.nextInt();
        Task1TestClass testClass=new Task1TestClass(n);
        testClass.sort_id();
        testClass.out_id();
    }
}



