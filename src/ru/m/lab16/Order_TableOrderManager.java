package ru.m.lab16;

import ru.m.lab16.Menu_MenuItem;

public class Order_TableOrderManager implements Order_OrderManager {

    private final Order_Order[] orders;

    public Order_TableOrderManager(int tables){
        orders = new Order_Order[tables];
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (Order_Order order: orders) {
            quantity += order.itemQuantity(itemName);
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(Menu_MenuItem item) {
        int quantity = 0;
        for (Order_Order order: orders) {
            quantity += order.itemQuantity(item);
        }
        return quantity;
    }

    @Override
    public Order_Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for (Order_Order order: orders) {
            cost += order.costTotal();
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return orders.length;
    }

    public void add(Order_Order order, int tableNumber){
        if (tableNumber <= orders.length)
            orders[tableNumber -1] = order;
    }

    public void addItem(Menu_MenuItem item, int tableNumber){
        if (tableNumber <= orders.length)
            orders[tableNumber - 1].add(item);
    }

    public Order_Order getOrder(int table){
        return orders[table-1];
    }

    public void remove(Order_Order order){
        for (int i = 0; i < orders.length; i++){
            if (orders[i].equals(order)) {
                orders[i] = null;
                return;
            }
        }
    }

    public void remove(int table){
        orders[table-1] = null;
    }

    public void removeAll(Order_Order order){
        for (int i = 0; i < orders.length; i++){
            if (orders[i].equals(order))
                orders[i] = null;
        }
    }
}

