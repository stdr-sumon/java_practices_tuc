/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_6_singly_link_list_bible;

/**
 *
 * @author Sumon
 */
public class List {

    Node front;
    int size;

    public List() {
        front = null;
        size = 0;
    }
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (front == null) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = front;
        front = newNode;
    }

    public void addAtEnd(int data) {
        Node current = front;
        Node newNode = new Node(data);
        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public void addAtPosition(int position, int data) {
        if (isEmpty() || position == 0) {
            addFirst(data);
        } else {
            int currentIndex = 0;
            Node current = front;
            Node newNode = new Node(data);
            while (current != null && currentIndex < position) {                
                /*
                    Now 'current' is previous element of given 'position'
                    Need proper 'wiring' since there has more 'elements' after the given 'position' 
                    Proper 'order' of wiring is IMPORTANT
                 */
                if (current != null) {
                    newNode.next = current.next;
                    current.next = newNode;
                    break;
                }
                current = current.next;
                currentIndex++;
            }
        }
    }

    public void addSorted(int data) {
        Node current = front;
        if (isEmpty()) {
            addFirst(data);
            return;
        }
        if (data < current.data) {
            addFirst(data);
            return;
        }
        while (data >= current.data && current.next != null) {
            if (data < current.next.data) {
                /*
                    Now 'data' is less than 'current' node data 
                    'current.next' is NOT NULL and data means 'current.next.data' also grater than new Node data
                    So, this is the expected position
                    Need proper 'wiring' since there has more 'elements'
                    Proper 'order' of wiring is IMPORTANT
                 */
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
        
        if (current.next == null) {
            addAtEnd(data);
        }
    }

    public void removeFront() {
        if (!isEmpty()) {
            front = front.next;
        }
    }
    
    // This method only delete the first founded element
    public void remove(int data) {
        Node current = front;
        if (current.data == data) {
            removeFront();
            return;
        }
        while (current != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    // This method only delete according to given index
    public void removeAtIndex(int index) {
        Node current = front;
        int counter = 0;
        if (index == 0) {
            removeFront();
            return;
        }
        while (current != null && counter < index) {
            if (counter + 1 == index) {
                current.next = current.next.next;
                return;
            }
            counter++;
            current = current.next;
        }
    }
    
    // This method delete all similar data
    void removeSimilarData(int data) {
        boolean removed = true;
        Node current = front;
        while (removed) {
            // Need updated 'front' since the front may get deleted
            current = front;
            removed = false;
            
            if (current.data == data) {
                removeFront();
                removed = true;
            }
            /*  Be careful here, about wiring, 
                If need draw simulation. 
                Remove 2 from [2, 2, 2, 1, 3, 2, 2, 1, 2, 3]
                Draw pan-paper simulation
            */
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    removed = true;
                }
                if (current.next != null) {
                    current = current.next;
                }
            }
        }
    }
    
    public double sum() {
        double total = 0.0;
        if (isEmpty()) {
            return total;
        }
        
        Node current = front;
        while (current != null) {
            total += (double) current.data;
            current = current.next;
        }
        return total;
    }
    
    public int size() {
        int size = 0;
        if (isEmpty()) {
            return size;
        }
        
        Node current = front;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    
    public void margeTwoList(List secondList) {
        Node firstFront = this.front;
        while (firstFront != null) {
            if (firstFront.next == null) {
                firstFront.next = secondList.front;
                return;
            }
            firstFront = firstFront.next;
        }
    }

    public void printContent() {
        Node current = front;
        while (current != null) {
            System.out.print(current.toString());
            current = current.next;
        }
        System.out.println();
    }
}
