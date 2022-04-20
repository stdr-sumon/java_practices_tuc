/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainexamprac;

/**
 *
 * @author Sumon
 */
public class Node {
    String data;
    Node next;
    
    public Node(String data) {
        this.data = data;
        this.next = null;
    }
    
    public String toString() {
        return "[" + this.data + "]";
    }
}
