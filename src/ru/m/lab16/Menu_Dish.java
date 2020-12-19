package ru.m.lab16;

public final class Menu_Dish extends Menu_MenuItem {
    public Menu_Dish(int cost, String name, String description) {
        super(cost, name, description);
    }

    public Menu_Dish(String name, String description) {
        super(name, description);
    }
}