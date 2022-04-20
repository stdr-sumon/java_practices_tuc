/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6_v_f;

/**
 *
 * @author Sumon
 */
public class Entry {

    Product product;
    int amount;
    Entry next;

    public Entry(Product d) {
        this.product = d;
        this.amount = 1;
        this.next = null;
    }

    public Entry(Product d, int amount) {
        this.product = d;
        this.amount = amount;
        this.next = null;
    }

    public Entry(String name, double price, int location, int amount) {
        this.product = new Product(name, price, location);
        this.amount = amount;
        this.next = null;
    }

    public Entry(String name, double price, int location) {
        this.product = new Product(name, price, location);
        this.amount = 1;
        this.next = null;
    }

    public String toString() {
        return "location: " + this.product.location + "-> " + this.product.name + " x " + this.amount;
    }
}
