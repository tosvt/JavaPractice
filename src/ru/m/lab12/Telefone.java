package ru.m.lab12;

public class Telefone {

    public static String parse(String str)
    {
        String result = "";
        result = "-" + str.substring(str.length()-2);
        str = str.substring(0, str.length()-2);

        result = "-" + str.substring(str.length()-2) + result;
        str = str.substring(0, str.length()-2);

        result = "-" + str.substring(str.length()-3) + result;
        str = str.substring(0, str.length()-3);

        result = "-" + str.substring(str.length()-3) + result;
        str = str.substring(0, str.length()-3);

        return str + result;
    }

    public static void main(String[] args) {
        System.out.println(parse("+104289652211"));
        System.out.println(parse("+79123456789"));
        System.out.println(parse("89123456789"));
    }

}
