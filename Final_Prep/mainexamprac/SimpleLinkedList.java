/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainexamprac;

/**
 *
 * @author Sumon
 */
public class SimpleLinkedList {
    Node front;

    public SimpleLinkedList() {
        this.front = null;
    }
    
    public void printContent() {
        for (Node it = this.front; it != null; it = it.next) {
            System.out.print(it.toString());
        }
        System.out.println();
    }
    
    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void addNodeToFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = front;
        front = newNode;
    }
    
    public void addNodeToLast(String data) {
        Node newNode = new Node(data);
        if(this.front == null) {
            this.front = newNode;
        } else {
            for (Node it = this.front; it != null; it = it.next) {
                if (it.next == null) {                
                    it.next = newNode;
                    break;
                } 
            }  
        }
    }
    public void addNodeToMiddle(String data, String cond) {
        Node newNode = new Node(data);
        for (Node it = this.front; it != null; it = it.next) {
            if (it.data.equals(cond)) { 
                Node prevNode = it.next;
                it.next = newNode;
                newNode.next = prevNode;
            } 
        }  
    }
    
    public void deleteFirst() {
        Node nextFirst = this.front.next;
        this.front = null;
        this.front = nextFirst;
    }
    
    public void deleteLast() {
        Node prevNode = this.front;
        for (Node it = this.front; it != null; it = it.next) {
            if (it.next == null) {
                it = null;
                prevNode.next = null;
                break;
            }
            prevNode = it; 
        }
    }
    
    public void deleteMiddle(String cond) {
        Node prevNode = this.front;
        for (Node it = this.front; it != null; it = it.next) {
            if (it.data == cond) {                
                prevNode.next = it.next;
                it = null;
                break;
            }
            prevNode = it; 
        }
    }
    
    public void updateContent(String prevData, String newData) {
        for (Node it = this.front; it != null; it = it.next) {
            if (it.data == prevData) {                
                it.data = newData;
                break;
            }
        }
    }
    public void addNodeIndexWise(String newData, int pos, String direction) {
        int count = 0;
        Node newNode = new Node(newData);
        for (Node it = this.front; it != null; it = it.next) {
            ++count;
            if (direction == "before") {
                    if (pos - 1 == count) {  
                    newNode.next = it.next;
                    it.next = newNode;
                    break;
                }
            }
            if (direction == "after") {
                    if (pos == count) {  
                    newNode.next = it.next;
                    it.next = newNode;
                    break;
                }
            }
        }
    }
    
//    public void reverseList() {
//        Node prev = null;
//        Node curr = this.front;
//        Node next = null;
//        while(curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = curr.next;
//            System.out.println("Node " + curr.data);
//        }           
//        this.front = prev;
//    }
}
