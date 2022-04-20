/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6;

/**
 *
 * @author Sumon
 */
public class IntegerListTest {
    public static void main(String[] args) {
        IntegerList list = new IntegerList();
        System.out.println(list.isEmpty());
        list.addSorted(3);
        list.addSorted(3);
        list.addSorted(3);
        list.addSorted(2);
        list.addSorted(360);
        list.addSorted(3);
        list.addSorted(-100);
        list.addSorted(-53);
        list.addSorted(3);

        //System.out.println();
        list.printContent();
        System.out.println(list.sum());
        System.out.println(list.isEmpty());
        System.out.println((list.negativePercentage() * 100) + "%");
        list.removeAll(3);
        list.printContent();
    }
}
