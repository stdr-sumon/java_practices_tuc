/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6_part_2;

/**
 *
 * @author Sumon
 */
public class GroceryList {
    private Grocery groceries;
    
    public GroceryList() {
        groceries = new Grocery();
    }
    
    public void add(Entry entry) {
        groceries.addSorted(entry);
    }
    
    public void remove(String productName) {
        groceries.remove(productName);
    }
    public void printGroceries() {
        groceries.printContent();
    }
    
    public double calculateBill() {
        return groceries.sum();
    }
    public static void main(String[] args) {
        GroceryList gl = new GroceryList();
        Product chocolate = new Product("Chocolate", 0.99, 4);
        gl.add(new Entry("Banana", 1.5, 1, 3));
        gl.add(new Entry("Coffee", 4.5, 2));
        gl.add(new Entry("Banana", 1.5, 1, 5));
        gl.add(new Entry("Tea", 3.5, 5));
        gl.add(new Entry("Ketchup", 0.9, 3, 1));
        gl.add(new Entry(chocolate, 5));
        gl.printGroceries();
        System.out.println(gl.calculateBill());
    }
}
