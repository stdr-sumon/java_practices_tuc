/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly_list_bible_mock_exam;

/**
 *
 * @author Sumon
 */
public class TestListRecord {

    public static void main(String[] args) {
        List firstList = new List();
        List secondList = new List();
        List deletedList = new List();
        
        //1st List
        System.out.println("1st List =>");
        firstList.add(new Record("Apple", 12.5, 4, ProductType.FOOD));
        firstList.add(new Record("Rice", 12.5, 4, ProductType.FOOD));
        firstList.add(new Record("Shampoo", 12.5, 4, ProductType.NONFOOD));
        firstList.add(new Record("Soap", 12.5, 4, ProductType.NONFOOD));
        secondList.add(new Record("Banana", 12.5, 4, ProductType.FOOD));
        firstList.add(new Record("Fanta", 12.5, 4, ProductType.BEVERAGES));
        firstList.add(new Record("Coke", 12.5, 4, ProductType.BEVERAGES));
        firstList.add(new Record("Rice", 12.5, 4, ProductType.FOOD));
        secondList.add(new Record("Banana", 12.5, 4, ProductType.FOOD));
        firstList.printRecords();
        System.out.println("Bill of 1st lis: " + firstList.calculateTotal());
        System.out.println();
        //Delete by Product Type and Return the Deleted product
        System.out.println("After Delete Current List =>");
        deletedList = firstList.splitByType(ProductType.BEVERAGES);
        firstList.printRecords();
        
        System.out.println("Deleted Product =>");
        deletedList.printRecords();
        
        //2nd List
        System.out.println("2nd List =>");
        secondList.add(new Record("Banana", 12.5, 4, ProductType.FOOD));
        secondList.add(new Record("Pepsi", 12.5, 4, ProductType.BEVERAGES));
        secondList.add(new Record("Gel", 12.5, 4, ProductType.NONFOOD));
        secondList.add(new Record("Coke", 12.5, 4, ProductType.BEVERAGES));
//        secondList.add(new Record("Coke", 12.5, 8, ProductType.BEVERAGES));
        secondList.printRecords();
        
//        Merge with 2nd list
        System.out.println("NEW");
        firstList.merge(secondList);
        firstList.printRecords();        
        
    }
}
