package ru.m.lab16;

import ru.m.lab16.Menu_MenuItem;

public interface Order_OrderManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(Menu_MenuItem item);
    Order_Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}

