package ru.m.lab6;
import java.util.Scanner;

public class Task2Main {
        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("Сколько студентов?");
            int n=scanner.nextInt();
            Task2SortingStudentsByGPA sortingStudentsByGPA = new Task2SortingStudentsByGPA(n);
            System.out.println("каким методом сортировки хотите воспользоваться?\n\t1\t- Сортировка слиянием\n\t2\t- Быстрая сортировка");
            if(scanner.nextInt()==1) Task2SortingStudentsByGPA.sortGpaMerge();
            else Task2SortingStudentsByGPA.sortGpaQuick();
            Task2SortingStudentsByGPA.out_students();
        }
    }