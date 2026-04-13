package linkedlist;

public class reverse {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }

    }
    public static Node head;
    public static Node tail;


    //addlast
    public void addlast(int data){
        Node newnNode = new Node(data);

        //empty
        if(head == null){
            head = tail = newnNode;
            return;
        }
        tail.next = newnNode;
        tail = newnNode;
    }

    //reverse
    public void reversing(){
        Node prev = null;
        Node curr = tail =head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reverse ll = new reverse();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        ll.reversing();
        ll.print();
    }
}
