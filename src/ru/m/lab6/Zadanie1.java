package ru.m.lab6;
import java.util.*;

public class Zadanie1 {
    public static Student[] insertSort(Student[] arr, int n) {
        for( int j = 1; j < n; j++){
            Student key = arr[j];
            int i = j-1;
            while(i >= 0 && arr[i].compareTo(key) > 0){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        // Random rand = new Random();
        int n = 5;
        Student[] stud = new Student[n];
        for(int i = 0; i<n; i++) {
            stud[i] = new Student((int)(Math.random()*1000));
        }
        for(int i = 0; i<n; i++) {
            System.out.println(stud[i].getiDNum()+" ");
        }

        stud = insertSort(stud, n);
        for(Student a: stud) {
            System.out.println(a);
        }

    }
}
