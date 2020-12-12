package ru.m.lab12;

public class Address {
    private String country = "";
    private String region = "";
    private String city = "";
    private String street = "";
    private String house = "";
    private String building = "";
    private String flat = "";

    Address (){

    }

    public static Address parse(String str, String delimiter)
    {
        Address a = new Address();
        String[] res = str.replaceAll("\\s", "").split(delimiter);
        a.country = res[0];
        a.region = res[1];
        a.city = res[2];
        a.street = res[3];
        a.house = res[4];
        a.building = res[5];
        a.flat = res[6];

        return a;
    }

    public static Address parse(String str)
    {
        return parse(str, ",");
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Address.parse("Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d] Квартира", "\\[d\\]"));
        System.out.println(Address.parse("Россия, МО, Москва, Есенина, 21, 10, 11"));
        System.out.println(Address.parse("Китай-Большая-Китайская-Стена-21-1А-80", "-"));
        System.out.println(Address.parse("USA/Alaska/Djuno/Right/21//1", "/"));
    }
}
