/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6_singly_link_list_bible;

/**
 *
 * @author Sumon
 */
public class ListTest {

    public static void main(String[] args) {
        List list = new List();
        System.out.println(list.isEmpty());
        list.addSorted(3);
        System.out.println(list.isEmpty());
        list.addSorted(3);
        list.addSorted(3);
        list.addSorted(4);
        list.addSorted(1);
        list.addSorted(3);
        list.addSorted(200);
        list.addSorted(3);
        list.addSorted(-100);
        list.addSorted(-100);
        list.addFirst(3);
        list.addAtPosition(1, 6);
        list.removeFront();
        list.remove(-100);
        
        
        
        
        System.out.println(list.sum());
        list.printContent();
        System.out.println(list.sum());
        System.out.println(list.isEmpty());
        list.removeSimilarData(3);
        list.printContent();
        List listTwo = new List();
        
        listTwo.addSorted(3);
        listTwo.addSorted(2);
        listTwo.addSorted(360);
        listTwo.printContent();
        System.out.println();
        
        list.margeTwoList(listTwo);
        list.printContent();
    }
}
