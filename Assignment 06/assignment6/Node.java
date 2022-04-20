package assignment6;

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

