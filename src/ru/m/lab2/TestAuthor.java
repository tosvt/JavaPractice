package ru.m.lab2;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Svyat Z", "svyat@gmail.com", 'm');
        Author a2 = new Author("Richard", 'm');
        Author a3 = new Author("Molly", "molly@gmail.com", 'f');
        Author a4 = new Author("Helen",'f');
        System.out.println(a1);
        a2.setEmail("richard@gmail.com");
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
