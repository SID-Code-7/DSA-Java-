package linkedlist;

public class LinkedList {
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

    //addfirst node 
    public void addFirst(int data){
        // creat new node
        Node newnNode = new Node(data);

        //is empty
        if(head == null){
            head = tail = newnNode;
            return;
        }
        //newnode point to head
        newnNode.next = head;
        head = newnNode;
    }

    //add at last
    public void addLast(int data){
        //1.create new node
        Node newNode = new Node(data);
         // if empty
        if(head == null){
            head=tail= newNode;
            return;
        }
        //2. last node point to new
        tail.next = newNode;
        tail = newNode;
    }
    public void add(int idx, int data){
        Node newNode = new Node(data);
        if(idx == 0){
            addFirst(data);
        }
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        // temp == prev
        newNode.next = temp.next;
        temp.next = newNode;

    }
     //print 
     public void print(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
     }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
    }
}
