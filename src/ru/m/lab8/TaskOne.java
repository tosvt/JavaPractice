package ru.m.lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskOne {
        public static void main(String[] args) throws FileNotFoundException {
            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            Scanner scanner = new Scanner(System.in);
            printWriter.print(scanner.nextLine());
            printWriter.close();
        }
}
