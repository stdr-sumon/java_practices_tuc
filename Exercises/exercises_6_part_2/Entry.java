/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6_part_2;

/**
 *
 * @author Sumon
 * Consider this class as Node
 * It has a double pointer(next, previous) for pointing next and previous element of a particular node
 * For pointing next and previous element of a particular node that it will point
 * As multiple item(Entry) will be in a grocery list
 */
public class Entry {
    Product product;
    int amount;
    Entry next;
    Entry previous;
    
    public Entry() {
        this.next = this.previous = null;
    }

    public Entry(Product product) {
        this.product = product;
        this.amount = 1;
        this.next = this.previous = null;
    }
    
    public Entry(Product product, int amount) {
        this.product = product;
        this.amount = amount;
        this.next = this.previous = null;
    }
    
    public Entry(String name, double price, int location, int amount) {
        this.product = new Product(name, price, location);
        this.amount = amount;
        this.next = this.previous = null;
    }
    
    public Entry(String name, double price, int location) {
        this.product = new Product(name, price, location);
        this.amount = 1;
        this.next = this.previous = null;
    }
    
    public String toString() {
        return this.product.name + " x" + this.amount;
    }
}
