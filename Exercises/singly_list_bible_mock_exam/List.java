/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singly_list_bible_mock_exam;

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

    private void addAtFirst(Record newRecord) {
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
    
    public void addAtPosition(int position, Record newRecord) {
        if (isEmpty() || position == 0) {
            addAtFirst(newRecord);
        } else {
            int currentIndex = 0;
            Record current = front;
            Record newNode = newRecord;
            while (current != null && currentIndex < position) {                
                if (currentIndex == (position - 1)) {
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
                currentIndex++;
            }
        }
    }
    
    public void addSortedWise(Record newRecord) {
        Record current = front;
        if (isEmpty()) {
            addAtFirst(newRecord);
            return;
        }
        while(current != null) {
            if(current.name.equals(newRecord.name)) {
                addSame(newRecord);
                return;
            } else {
                newRecord.next = current.next;
                current.next = newRecord;
            }
            current = current.next;
        }
        if (current.next == null) {
            addAtEnd(newRecord);
        }
    }

    public void add(Record newRecord) {
        addSortedWise(newRecord);
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
        Record firstFront = this.front;
        Record secondFront = secondList.front;
        while (firstFront != null) {
            if (firstFront.next == null) {
                firstFront.next = secondList.front;
                return;
            } else {
                while (secondFront != null) {
                    if (secondFront.name.equals(firstFront.name)) {
                        firstFront.amount += secondFront.amount;
                    }                    
                    secondFront = secondFront.next;
                }
            }
            firstFront = firstFront.next;
        }
    }
    
    public Record getItemInfo(String itemName) {
        Record current = front;
        while (current != null) {
            if (current.name.equals(itemName)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    

    private void removeAtFront() {
        if (!isEmpty()) {
            front = front.next;
        }
    }
    
    private void removeAtEnd() {
        Record current, prevNode;
        current = prevNode = front;
        while (current != null) {
            if (current.next == null) {
                prevNode.next = null;
                return;
            }
            prevNode = current;
            current = current.next;
        }
    }
    
    private void removeAtPosition(int position) {
        if (position == 0) {
            removeAtFront();
        } else {
            int currentIndex = 0;
            Record current = front;
            while (current != null && currentIndex < position) {                
                if (currentIndex == (position - 1)) {
                    if (current.next.next != null) {
                        current.next = current.next.next;
                    } else {
                        current.next = null;
                    }
                    return;
                }
                current = current.next;
                currentIndex++;
            }
        }
    }

    private void removeSimilarData(ProductType productType) {
        boolean removed = true;
        Record current;
        while (removed) {
            current = front;
            removed = false;

            if (current.productType == productType) {
                removeAtFront();
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
    
    public void getSortedList() {
        Record current = front;
        int tmpAmount;
        String tmpName;
        ProductType tmpType;
        if (!isEmpty()) {
            while (current != null) {
                while (current.next != null) {
                    if (current.productType == current.next.productType) {
                        current.next = current.next.next;
                        continue;
                    } else {
                        tmpAmount = current.amount;
                        tmpName = current.name;
                        tmpType = current.productType;
                        
                        current.amount = current.next.amount;
                        current.name = current.next.name;
                        current.productType = current.next.productType;
                        
                        current.next.amount = tmpAmount;
                        current.next.name = tmpName;
                        current.next.productType = tmpType;
                    }
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }
    }
    
    public void getReversedList() { 
        
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
