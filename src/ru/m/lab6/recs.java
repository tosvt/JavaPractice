package ru.m.lab6;

import java.util.*;

public class recs {
    public static void rec13() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n > 0) {
            int c = in.nextInt();
            System.out.println(n);

            if (c > 0) rec13();

        }
    }

    public static String rec14(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return rec14(n / 10) + " " + n % 10;
        }
    }

    public static int rec15(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return rec15(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("\tВыберите пункт меню: \n1 - Задача 13\n2 - Задача 14\n3 - Задача 15\n0 - Выход");
        Scanner in = new Scanner(System.in);
        System.out.println("-> ");
        int v = in.nextInt();
        switch (v){
            case 0: System.exit(0); break;
            case 1: rec13(); break;
            case 2: System.out.println(rec14(95)); break;
            case 3: System.out.println(rec15(95));
        }
    }
}

