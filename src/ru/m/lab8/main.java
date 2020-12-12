package ru.m.lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try(FileWriter writer = new FileWriter("text_lab8.txt", false)){
            writer.write(scanner.next());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
