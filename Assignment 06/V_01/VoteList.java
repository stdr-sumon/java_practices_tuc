/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_6;

/**
 *
 * @author Sumon
 */
public class VoteList {
    Node head;
    Node tail;
    public VoteList()
    {
        head = null;
    }
    public Node getHead()
    {
        return head;
    }
    public boolean add(Vote data) {
        Node newNode = new Node(data);
        if (head == null) {    
            head = newNode;
            tail = newNode;    
        }  else {
            tail.next = newNode; 
            tail = newNode;            
        }
        
        return true;
    }
    
    public int importVotes(Vote[] data) {
        int totalImport = 0;
        for (int i = 0; i < data.length; i++) {
            add(data[i]);
            if (i == data.length - 1) {
                totalImport = i + 1;
            }
        }
        return totalImport;
    }
    
    public boolean isValid() {
        Node current = head;
        boolean isValid = false;
        int totalVote = 0;
        int totalInvalid = 0;
        double voteParcentageInvalid = 0.0;
        while (current != null) { 
            totalVote++;
            if (current.vote.equals(Vote.INVALID)) {
                totalInvalid++;
            }
            current = current.next;    
        } 
        voteParcentageInvalid = (double) totalInvalid / totalVote * 100;
        if ( (int) voteParcentageInvalid < 40) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }
    
    public String countVotes() {
        Node current = head;
        int totalYes = 0;
        int totalNo = 0;
        int totalInvalid = 0;
        String output = "";
        boolean isValid = isValid();
        while(current != null) { 
            if (current.vote.equals(Vote.YES)) {
                totalYes++;
            }
            if (current.vote.equals(Vote.NO)) {
                totalNo++;
            }
            if (current.vote.equals(Vote.INVALID)) {
                totalInvalid++;
            }
            current = current.next;    
        } 
        if (totalYes > totalNo) {
            output = Vote.YES.toString();
        } else if (totalNo > totalYes) {
            output = Vote.NO.toString();
        } else if ( (isValid == false) || (totalYes == totalNo) ) {
            output = Vote.INVALID.toString();
        }
        return output;
    }
    
    public static void main(String[] args) {
        VoteList christmasPartyVoting = new VoteList();
        Vote[] friendVotes = {Vote.YES, Vote.YES, Vote.NO, Vote.INVALID, Vote.INVALID, Vote.NO, Vote.YES, Vote.NO};
        Vote[] familyVotes = {Vote.INVALID, Vote.YES, Vote.YES, Vote.NO};
        System.out.println(christmasPartyVoting.importVotes(friendVotes)); // returns 8
        System.out.println(christmasPartyVoting.isValid()); // returns true
        System.out.println(christmasPartyVoting.countVotes()); // returns INVALID
        System.out.println(christmasPartyVoting.importVotes(familyVotes)); // returns 4
        System.out.println(christmasPartyVoting.isValid()); // returns true
        System.out.println(christmasPartyVoting.countVotes()); // returns YES
    }
}
