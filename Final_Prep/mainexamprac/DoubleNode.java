/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainexamprac;

/**
 *
 * @author Sumon
 */
public class DoubleNode {
    String data; 
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(String data) {
        this.next = this.prev = null;
        this.data = data;
    }
    
    public String toString() {
        return "[" + this.data + "]";
    }
    
}
