/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_6;

/**
 *
 * @author Sumon
 */
public class Node {
    Vote vote;
    Node next = null;
    public Node(Vote vote){
        this.vote = vote;
    }
    public Vote getData()
    {
        return this.vote;
    }
    public Node getNext()
    {
        return this.next;
    }
}
