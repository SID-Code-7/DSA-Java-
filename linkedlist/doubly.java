package linkedlist;

public class doubly{
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add last
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode; 
        newNode.prev = tail;
        tail= newNode;
    }

    //remove first

    public static int removeFirst(){
        if(head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        } 

        int val = head.data;
        head=head.next;
        head.prev =null;
        size--;
        return val;
    }

    //remove last
    public static int removeLast(){
        if(head == null || head.next == null){
            return Integer.MAX_VALUE;
        }

        int i=0;
        Node temp = head;
        while(i<size-2){   
            temp = temp.next;
            i++;
        }

        int val = temp.next.data;
        temp.next=null;
        tail.prev = temp;
        tail = temp;
        return val;

    }

    public static void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +"<->");
            temp= temp.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        addFirst(1);
        addFirst(2);
        addFirst(3);
        addLast(5);
        print();
        // removeFirst();
        // removeLast();
        reverse();
        print();
    }
}