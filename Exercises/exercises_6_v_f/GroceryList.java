/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6_v_f;

/**
 *
 * @author Sumon
 */
public class GroceryList {

    Entry front;

    public GroceryList() {
        front = null;
    }

    Boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        int size = 0;
        if (this.isEmpty()) {
            return size;
        }
        Entry it = front;
        while (it != null) {
            size++;
            it = it.next;
        }
        return size;

    }

    private void addFirst(Entry newNode) {
        newNode.next = front;
        front = newNode;
    }

    private void addAtEnd(Entry newNode) {
        if (front == null) {
            front = newNode;
        } else {
            for (Entry it = front; it != null; it = it.next) {
                if (it.next == null) {
                    it.next = newNode;
                    break;
                }
            }
        }
    }

    private boolean addSame(Entry newNode) {
        Entry current = front;
        while (current != null) {
            if (current.product.name.equals(newNode.product.name)) {
                current.amount += newNode.amount;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void add(Entry newNode) {
        if (this.isEmpty()) {
            front = newNode;
            return;
        }
        if (addSame(newNode)) {
            return;
        }
        if (newNode.product.location < front.product.location) {
            addFirst(newNode);
            return;
        }
        Entry current = front;
        while (newNode.product.location > current.product.location && current.next != null) {
            if (newNode.product.location < current.next.product.location) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

        if (current.next == null) {
            addAtEnd(newNode);
            return;
        }

    }

    private void removeFront() {
        if (front != null) {
            front = front.next;
        }
    }

    public void remove(String dataValue) {
        Entry it = this.front;
        if (it == null) {
            return;
        }

        if (it.product.name.equals(dataValue)) {
            removeFront();
            return;
        }

        while (it.next != null) {
            if (it.product.name.equals(dataValue)) {
                it.next = it.next.next;
                return;
            }
            it = it.next;

            if (it == null) {
                return;
            }
        }
    }

    void printGroceries() {
        for (Entry it = front; it != null; it = it.next) {
            System.out.println(it.toString());
        }
    }

    double calculateBill() {
        double bill = 0;

        if (this.isEmpty()) {
            return bill;
        }
        for (Entry it = front; it.next != null; it = it.next) {
            bill += it.product.price * it.amount;
        }
        return bill;
    }

    public static void main(String[] args) {
        GroceryList gl = new GroceryList();

        Product chocolate = new Product("Chocolate", 0.99, 3);
        gl.add(new Entry("Banana", 1.5, 1, 3));
        gl.add(new Entry("Coffee", 4.5, 2));
        gl.add(new Entry("Banana", 1.5, 1, 5));
        gl.add(new Entry("Tea", 3.5, 5));
        gl.add(new Entry("Ketchup", 0.9, 4, 1));
        gl.add(new Entry(chocolate, 5));
        gl.printGroceries();
        System.out.println(gl.calculateBill());

        GroceryList gl2 = new GroceryList();
        gl2.add(new Entry("Shake", 6.5, 1, 3));
        gl2.add(new Entry("Bread", 1.5, 2));
        gl2.printGroceries();

    }

}
