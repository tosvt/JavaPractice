package ru.m.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("file.txt");
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
