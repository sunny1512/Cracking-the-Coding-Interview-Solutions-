/*
	Author :: Ashwani Tiwari
	Code :: Linked Lists: Detect a Cycle 
	Problem statement :: From Hacker-rank
	link to problem :: https://www.hackerrank.com/challenges/ctci-linked-list-cycle
*/
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/
boolean hasCycle(Node head) {
    
    HashSet<Node>hs=new HashSet<Node>();
    Node p=head;
    while(p!=null){
        if(hs.contains(p)==true){
            return true;
        }
        else{
            hs.add(p);
        } 
        p=p.next;
    }
    return false;
}
