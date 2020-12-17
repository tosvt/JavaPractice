package ru.m.lab6;
import ru.m.lab6.Student;

import java.util.Arrays;
import java.util.Scanner;


public class Task1TestClass {
    public Student[] students;
    private int[] iDNumber;
    private Scanner scanner =new Scanner(System.in);
    public Task1TestClass(int n) {
        students=new Student[n];
        iDNumber=new int[n];
        int id;
        double gpa;
        String name;
        for(int i=0; i<students.length ;++i){
            System.out.println("Student #"+(i+1));
            System.out.print("id = ");
            id=scanner.nextInt();
            System.out.print("\ngpa = ");
            gpa=scanner.nextDouble();
            System.out.print("\nname = ");
            name=scanner.next();
            System.out.print('\n');
            students[i]=new Student(id,gpa,name);
            iDNumber[i]=id;
        }
    }

    void sort_id(){
        Arrays.sort(iDNumber);
    }

    void out_id(){
        for(int q:iDNumber) System.out.print(q+" ");
    }

    public void out_students(){
        System.out.println("id\t\tgpa\t\tname");
        for(Student q:students) System.out.println(q.getId()+"\t\t"+q.getGpa()+"\t\t"+q.getName());
    }
}

