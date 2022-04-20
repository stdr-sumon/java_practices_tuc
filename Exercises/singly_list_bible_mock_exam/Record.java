/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly_list_bible_mock_exam;

/**
 *
 * @author Sumon
 */
public class Record {
    String name;
    double price;
    int amount;
    ProductType productType;
    Record next;

    public Record(String name, double price, int amount, ProductType productType) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.productType = productType;
    }
        
    @Override
    public String toString() {
        return "Name: " + this.name + "-> " + this.price + "-> " +this.amount + " x " + this.productType;
    }
}
