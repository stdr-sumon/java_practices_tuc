/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6_part_2;

/**
 *
 * @author Sumon
 */
public class Grocery {
    Entry front;
    Entry rear;
    int size;
    
    public Grocery() {
        front = new Entry();
        rear = new Entry();
        
        //front wiring
        front.next = rear;
        front.previous = null;
        
        //rear wiring
        rear.previous = front;
        rear.next = null;
        
        size = 0;
    }
    
    public boolean isEmpty() {
        return (front.amount == 0);
    }
    
    public int size() {
        int count = 0;
        if (isEmpty()) {
            return count;
        }
        Entry current = front;
        while (current != null) {
            current = current.next;
            ++count;
        }
        return count;
    }
    
    public double sum() {
        double sum = 0;
        if (isEmpty()) {
            return sum;
        }
        Entry current = front;
        while (current != null && current.amount > 0) {
            sum += (current.product.price * current.amount);
            current = current.next;
        }
        return sum;
    }
    
    public void addFirst(Entry newEntry) {
        newEntry.next = rear;
        newEntry.previous = front;
        rear.previous= newEntry;
        front = newEntry;
        size++;
    }
    
    public boolean addSame(Entry newEntry) {
        Entry current = front;
        while (current != null && current.amount > 0) {
            if (newEntry.product.name.equals(current.product.name)) {
                current.amount += newEntry.amount;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void addAtEnd(Entry newEntry) {
        Entry current = front;
        while (current != null) {
            if (current.next == null ) {
                current.next = newEntry;
                newEntry.previous = current;
                newEntry.next = null;
                this.rear = newEntry;
            }
            current = current.next;
        }
    }
    
    public void addSorted(Entry newEntry) {
        // if list is empty
        if (isEmpty()) {
            newEntry.next = rear;
            newEntry.previous = front;
            rear.previous= newEntry;
            front = newEntry;
            size++;        
            return;
        }
        // if already in list
        if (addSame(newEntry)) {
            return;
        }
//        System.out.println(newEntry.product.location + "   " + newEntry.product.name + "   " + front.product.location);
        // if location data is smallest, then new first
        if (newEntry.product.location < front.product.location) {
            addFirst(newEntry);
            return;
        }
        
        Entry current = front;
//        System.out.println(current.product.name);
        while (current.next != null && current.amount > 0) {
            if (newEntry.product.location > current.product.location) {
                newEntry.next = current.next;
                newEntry.previous = current;
                current.next.previous = newEntry;
                current.next = newEntry;
                return;
            }
            current = current.next;
            if (current == null) {
                addAtEnd(newEntry);
                return;
            }
        }
    }
    
    public void removeFront() {
        if (front != null) {
            front = front.next;
        }
    }
    
    public void remove(String productName) {
        Entry current = front;
        if (current == null) {
            return;
        }
        // if data is in the front node
        if (current.product.name.equals(productName)) {
            removeFront();
            return;
        }
        
        while (current != null) {
            if (current.product.name.equals(productName)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
            // if data is in the last node
            if (current == null) {
                return;
            }
        }
    }
    
    public void printContent() {
        Entry current = front;
        while (current != null && current.amount > 0) {
            System.out.println(current.toString());
            current = current.next;
        }
    }
}
