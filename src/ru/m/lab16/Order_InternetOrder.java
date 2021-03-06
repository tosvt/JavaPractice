package ru.m.lab16;

import ru.m.lab16.Customer;
import ru.m.lab16.Menu_MenuItem;

import java.util.Arrays;
import java.util.Comparator;

public class Order_InternetOrder implements Order_Order{

    private int size;
    private Customer customer;

    //invariant: head.prev = last
    ListNode head;
    //invariant: last.next = head
    ListNode last;

    private static class ListNode {
        Menu_MenuItem item;
        ListNode next;

        ListNode(ListNode next, Menu_MenuItem item){
            this.next = next;
            this.item = item;
        }
    }

    public Order_InternetOrder(){
        size = 0;
        initHead();
    }


    @Override
    public boolean add(Menu_MenuItem item) {
        if (head.item == null) {
            head = new ListNode(null, item);
            this.last = this.head;
        } else
            last = last.next = new ListNode(head, item);
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        if (head.item == null){
            return null;
        }
        ListNode temp = head;
        String[] string = new String[size];
        for (int i = 0; i < size; i++) {
            string[i] = temp.item.getName();
            temp = temp.next;
        }
        return string;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        if (head.item == null){
            return 0;
        }
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.item.getName().equals(itemName)){
                quantity++;
            }
            temp = temp.next;
        }
        return quantity;
    }

    @Override
    public int itemQuantity(Menu_MenuItem item) {
        int quantity = 0;
        if (head.item == null){
            return 0;
        }
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.item.equals(item)){
                quantity++;
            }
            temp = temp.next;
        }
        return quantity;
    }

    @Override
    public Menu_MenuItem[] getItems() {
        if (head.item == null){
            return null;
        }
        ListNode temp = head;
        Menu_MenuItem[] items = new Menu_MenuItem[size];
        for (int i = 0; i < size; i++) {
            items[i] = temp.item;
            temp = temp.next;
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        if (head.item == null){
            return false;
        }
        ListNode temp = head;
        ListNode prev = null;
        do {
            if (temp.item.getName().equals(itemName)){
                return unlink(temp, prev);
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    @Override
    public boolean remove(Menu_MenuItem item) {
        if (head.item == null){
            return false;
        }
        ListNode temp = head;
        ListNode prev = null;
        do {
            if (temp.item.equals(item)){
                return unlink(temp, prev);
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    private boolean unlink(ListNode temp, ListNode prev) {
        if (prev != null) {
            prev.next = temp.next;
            if (temp == last){
                last = prev;
            }
        } else {
            if (size == 1) {
                initHead();
                return true;
            } else {
                head = last.next = temp.next;
            }
        }
        size--;
        return true;
    }

    @Override
    public boolean removeAll(String itemName) {
        if (head.item == null){
            return false;
        }
        for (int i = 0; i < size; i++) {
            remove(itemName);
        }
        return false;
    }

    @Override
    public boolean removeAll(Menu_MenuItem item) {
        if (head.item == null){
            return false;
        }
        for (int i = 0; i < size; i++) {
            remove(item);
        }
        return false;
    }

    @Override
    public Menu_MenuItem[] sortedItemsByCost() {
        Menu_MenuItem[] items = this.getItems();
        Arrays.sort(this.getItems(), Comparator.comparingInt(Menu_MenuItem::getCost));
        return items;
    }

    @Override
    public int costTotal() {
        int cost = 0;
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            cost +=  temp.item.getCost();
            temp = temp.next;
        }
        return 0;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    private void initHead(){
        this.head = new ListNode(null, null);
        this.last = this.head;
    }
}
