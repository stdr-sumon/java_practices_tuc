/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainexamprac;

/**
 *
 * @author Sumon
 */
public class TestClass {
    public static void main(String[] args) {
//        PracticeString ps = new PracticeString("abcdaba");
//        int charCount =  ps.charCounter('b');
//        System.out.println("Char times: " + charCount);
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        String direction = "left";
//        PracticeArray pa = new PracticeArray();
//        //int sum = pa.diagonalSum(arr, direction);
//        int sum = pa.diagonalSumOneLoop(arr, direction);
//        System.out.println("Sum: " + sum);
//        SimpleLinkedList myList = new SimpleLinkedList();
//        myList.addNodeToFirst("hello");
//        myList.addNodeToFirst("World");
//        myList.printContent();
//        myList.addNodeToLast("Beauty");
//        myList.addNodeToLast("Nice");
//        myList.printContent();
//        myList.addNodeToMiddle("Wow", "Beauty");
//        myList.printContent();
//        myList.deleteFirst();
//        myList.printContent();
//        myList.deleteLast();
//        myList.printContent();
//        myList.deleteMiddle("Beauty");
//        myList.printContent();
//        myList.updateContent("Wow", "WoW!");
//        myList.printContent();
//        myList.addNodeIndexWise("Nice", 2, "after");
//        myList.printContent();
//        myList.addNodeIndexWise("Fantastic", 2, "before");
//        myList.printContent();
//        myList.reverseList();
//        myList.printContent();
        DoubleLinkedList myDoubleList = new DoubleLinkedList();
//        myDoubleList.addNodeToAnywhare("Wow", "Beauty");
//        myDoubleList.printContentForward();
//        myDoubleList.addNodeToAnywhare("Beauty", "Wow");
//        myDoubleList.printContentForward();
//        myDoubleList.addNodeToAnywhare("Nice", "Wow");
//        myDoubleList.addFirst("Nice");
        myDoubleList.addAt(0,"Beauty");
        myDoubleList.addAt(1,"Nice");
        myDoubleList.addAt(1,"Wow");
        myDoubleList.printContentForward();
    }
}
