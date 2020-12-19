package ru.m.lab16;

import ru.m.lab16.Menu_Drink;
import ru.m.lab16.Menu_DrinkType;
import ru.m.lab16.Order_InternetOrder;
import ru.m.lab16.Order_Order;
import ru.m.lab16.Order_TableOrder;

import java.util.Arrays;

public class RestaurantDriver {

    public static void main(String[] args) {
        Menu_Drink drink = new Menu_Drink(19, "vodka", "ds", 50, Menu_DrinkType.JUICE);
        System.out.println(drink.isAlcoholicDrink());

        Order_Order order = new Order_TableOrder();
        order.add(drink);
        order.add(new Menu_Drink(399, "no vodka", "ds", 50, Menu_DrinkType.JUICE));
        System.out.println(Arrays.toString(order.getItems()));
        order.add (new Menu_Drink(19, "vodka", "ds", 50, Menu_DrinkType.JUICE));

        System.out.println(Arrays.toString(order.itemsNames()));
        System.out.println(Arrays.toString(order.sortedItemsByCost()));

        order.removeAll("vodka");
        System.out.println(Arrays.toString(order.itemsNames()));
    }
}