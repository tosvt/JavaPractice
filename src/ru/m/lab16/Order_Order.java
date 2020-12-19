package ru.m.lab16;

import ru.m.lab16.Customer;
import ru.m.lab16.Menu_MenuItem;

public interface Order_Order {
    boolean add(Menu_MenuItem item);
    String[] itemsNames();
    int itemsQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(Menu_MenuItem item);
    Menu_MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(Menu_MenuItem item);
    boolean removeAll(String itemName);
    boolean removeAll(Menu_MenuItem item);
    Menu_MenuItem[] sortedItemsByCost();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}

