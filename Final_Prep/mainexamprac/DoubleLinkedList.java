/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainexamprac;

/**
 *
 * @author Sumon
 */
public class DoubleLinkedList {
    DoubleNode front;
    DoubleNode rear;
    int size;

    public DoubleLinkedList() {
        front = new DoubleNode("");
        rear = new DoubleNode("");
        //front wiring
        front.next = rear;
        front.prev = null;
        //rear wiring
        rear.prev = front;
        rear.next = null;
        
        size = 0;
    }
    
    public boolean isEmpty() {
        if (this.front == null && this.rear == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void printContentForward() {
        for (DoubleNode it = this.front; it != null; it = it.next) {
            System.out.print(it.toString());
        }
        System.out.println();
    }
    
    public void printContentBackward() {
        for (DoubleNode it = this.rear; it != null; it = it.prev) {
            System.out.print(it.toString());
        }
        System.out.println();
    }
    
    public void addNodeToAnywhare(String data, String cond) {
        if (this.front == null && this.rear == null) {
            DoubleNode newNode = new DoubleNode(data);
            this.front = newNode;
            this.rear = newNode;
        } else {
            DoubleNode newNode = new DoubleNode(data);
            for (DoubleNode it = this.front; it != null; it = it.next) {
                if (it.data.equals(cond)) { 
                                      
                } 
            }
        }
    }
    public void addFirst(String data) {
        DoubleNode newNode = new DoubleNode(data);
        if (size == 0) {
            newNode.next = rear;
            newNode.prev = front;
            rear.prev = newNode;
            front.next = newNode;
            size++;
        } else {
            newNode.next = front.next;
            newNode.prev = front;
            front.next.prev = newNode;
            front.next = newNode;
            size++;
        }
    }
    
    public void deleteNode() {
        
    }
    
    public void updateNode() {
        
    }
    
    public void reverseNode() {
        
    }
    
    public void addAt(int position, String data) {
        if (position == 0) {
            addFirst(data);
            return;
        } else {
            DoubleNode currentNode = this.front;
            int i = 0;
            while (currentNode != this.rear) {
                currentNode = currentNode.next;
                i++;
                System.out.println("Inserting at podition: " + position + "; i: " + i + data);
                if(i == position) {
                    DoubleNode newNode = new DoubleNode(data);
                    newNode.next = currentNode.next;
                    newNode.prev = currentNode;
                    //currentNode.next = newNode;
                    //currentNode.next.prev = newNode;
                    // *** Ordering is important ***
                    currentNode.next.prev = newNode;
                    currentNode.next = newNode;
                    size++;
                    return;
                } else if (i == position && position == size) {
                    DoubleNode newNode = new DoubleNode(data);
                    newNode.next = currentNode.next;
                    newNode.prev = currentNode;
                    //currentNode.next = newNode;
                    //currentNode.next.prev = newNode;
                    // *** Ordering is important ***
                    currentNode.next.prev = newNode;
                    currentNode.next = newNode;
                    size++;
                    return;
                }
            }
        }
    }   
}
