/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6;

/**
 *
 * @author Sumon
 */
public class IntegerList {
    Node head;
    int size;

    public IntegerList() {
        this.head = null;
        this.size = 0;
    }
    
    public int size() {
        Node tmp = this.head;
        while (tmp != null) {
            tmp = tmp.next;
            ++size;
        }
        return size;
    }
    
    private void addAtFirst(int val) {
        Node newNode = new Node(val);
        if (this.head == null) {
            newNode.next = null;
            this.head = newNode;
        }
        ++size;
    }
    
    private void addInSortedPos(int val) {
        Node tmp, prevNode;
        tmp = prevNode = this.head;
        Node newNode = new Node(val);
        newNode.next = null;
        int tmpVal = 0;
//        System.out.println("hh" + tmp.getValue());
        while (tmp != null) {
//            System.out.println("hh");
            if (tmp.next == null) {
//                System.out.println("hh");
                tmp.next = newNode;
                ++size;
                if (prevNode.getValue() > newNode.getValue()) {
                    tmpVal = prevNode.getValue();
                    prevNode.setValue(newNode.getValue());
                    newNode.setValue(tmpVal);
                    break;
                }
                return;
            }
            prevNode = tmp;
            tmp = tmp.next;
        }
    }
    
    public void addSorted(int val) {
        if (this.head == null) {
            this.addAtFirst(val);
        } else {
            this.addInSortedPos(val);
        }
    }
    
    public int sum() {
        Node tmp = this.head;
        int sum = 0;
        while (tmp != null) {
            sum += tmp.getValue();
            tmp = tmp.next;
        }
        return sum;
    }
    
    public double negativePercentage() {
        Node tmp = this.head;
        double totalNum = 0;
        double negNum = 0;
        while (tmp != null) {
            if (tmp.getValue() < 0) {
                ++negNum;
            }
            ++totalNum;
            tmp = tmp.next;
        }
        return (negNum >= 0) ? (negNum/totalNum) : 0;
    }
    
    private void deleteAtFirst() {
        if (this.head == null) {
            this.head = null;
        } else {
            this.head = this.head.next;
        }
    }
    
    private void deleteAtLast() {
        Node tmp = this.head;
        Node prevNode = null;
        while (tmp.next != null) {
            if (tmp.next == null) {
                prevNode.next = null;
                break;
            }
            prevNode = tmp;
            tmp = tmp.next;
        }
    }
    public int getUpdatedIndex(int val) {
        int updatedIndex = 0;
        Node tmp = this.head;
        
        while (tmp.next != null) {
            if (tmp.getValue() == val) {
                break ;
            }
            ++updatedIndex;
            tmp = tmp.next;
        }
        
        return updatedIndex;
    }
    
    private void deleteAtIndex(int index, int val) {
        Node tmp, prevNode, followingNode;
        tmp = prevNode = this.head;
        followingNode = this.head.next;
        int counter = 0;
        
        while (tmp != null) {
            if (index == 0) {
//                System.out.println("Deleted: " + index);
                this.head = tmp.next;
                tmp = null;
                break;
            } else {
                index = getUpdatedIndex(val);
                    if (counter == index) {
//                        System.out.println("Deleted: " + index);
                    prevNode.next = tmp.next;
                    tmp = null;
    //                System.out.println("Hi: " + index + " V: " + prevNode.getValue());
                    break;
                }
            }
            ++counter;
            prevNode = tmp;
            tmp = tmp.next;
        }
        return;
    }
    
    public void removeAll(int val) {
        if (this.head.next == null) {
            this.deleteAtFirst();
        } else {
            Node tmp = this.head;
            int index = 0;
            while (tmp != null) {
                if (tmp.getValue() == val) {
                    this.deleteAtIndex(index, val);
                    System.out.println("delete: " + index); 
//                    printContent();
                }
                ++index;
                tmp = tmp.next;
            }
        }
    }
    
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (this.head == null) {
            isEmpty = true;
        }
        return isEmpty;
    }
    
    public void printContent() {
        for (Node it = this.head; it != null; it = it.next) {
            System.out.print(it.getValue() + " ");
        }
        System.out.println();
    }
}
