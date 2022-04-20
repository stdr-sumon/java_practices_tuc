/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examtask_3;

/**
 *
 * @author Sumon
 */
public class List {

    Record front;
    
    public List() {
        front = null;
    }

    private boolean isEmpty() {
        boolean isEmpty = false;
        if (front == null) {
            isEmpty = true;
        }
        return isEmpty;
    }

    private void addFirst(Record newRecord) {
        newRecord.next = front;
        front = newRecord;
    }

    private void addAtEnd(Record newRecord) {
        Record current = front;
        while (current != null) {
            if (current.next == null) {
                current.next = newRecord;
                return;
            }
            current = current.next;
        }
    }

    private void addSame(Record newNode) {
        Record current = front;
        while (current != null) {
            if (current.name.equals(newNode.name)) {
                current.amount += newNode.amount;
                return;
            }
            current = current.next;
        }
    }

    public void add(Record newRecord) {
        if (isEmpty()) {
            addFirst(newRecord);
            return;
        }
        Record current = front;
        while (current != null) {
            if (current.name.equals(newRecord.name)) {
                addSame(newRecord);
                return;
            }
            if (current.next == null) {
                addAtEnd(newRecord);
                return;
            }
            current = current.next;
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        if (isEmpty()) {
            return total;
        }

        Record current = front;
        while (current != null) {
            total += (double) (current.price * current.amount);
            current = current.next;
        }
        return total;
    }

    public void merge(List secondList) {
        Record firstFront, prevNode;
        firstFront =  prevNode = front;
        Record secondFront = secondList.front;
        while (firstFront != null) {
            if (firstFront.next == null) {
                // When null join second front and update if
                while (secondFront != null) {
                    if (secondFront.name.equals(firstFront.name)) {
                        firstFront.amount += secondFront.amount;                        
                    }                    
                    secondFront = secondFront.next;
                }
                firstFront.next = secondList.front;
                return;
            } else {
                // update amount with second list for each calling node
                secondFront = secondList.front;
                while (secondFront != null) {
                    if (secondFront.name.equals(firstFront.name)) {
                        System.out.println("Fist: " + firstFront.name + " Second: " + secondFront.name);
                        firstFront.amount += secondFront.amount;    
                        prevNode.next = secondFront.next;
                    }
                    prevNode = secondFront;
                    secondFront = secondFront.next;
                }
            }
            firstFront = firstFront.next;
        }
    }
    

    private void removeFront() {
        if (!isEmpty()) {
            front = front.next;
        }
    }

    private void removeSimilarData(ProductType productType) {
        boolean removed = true;
        Record current = front;
        while (removed) {
            current = front;
            removed = false;

            if (current.productType == productType) {
                removeFront();
                removed = true;
            }
            while (current.next != null) {
                if (current.next.productType == productType) {
                    current.next = current.next.next;
                    removed = true;
                }
                if (current.next != null) {
                    current = current.next;
                }
            }
        }
    }
    
    

    public List splitByType(ProductType productType) {
        List deletedProduct = new List();
        Record currentRec = front;
        while (currentRec != null) {
            if (currentRec.productType == productType) {
                Record deletedRecord = new Record(currentRec.name, currentRec.price, currentRec.amount, currentRec.productType);
                deletedProduct.add(deletedRecord);
            }
            currentRec = currentRec.next;
        }
        
        if (!isEmpty()) {
            removeSimilarData(productType);
        }
        return deletedProduct;
    }

    public void printRecords() {
        Record current = front;
        while (current != null) {
            System.out.println(current.toString());
            current = current.next;
        }
        System.out.println();
    }
}
