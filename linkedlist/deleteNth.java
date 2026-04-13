package linkedlist;

public class deleteNth {
    public static class Node{
        int data;
        Node next;
        public Node(int data ){
            this.data = data;
            next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    //main ans -> remove nth from end;
    public void removeNth(int n){
        int idx = size-n;
        int i=1;
        Node temp = head;
        if( n == size){
            head = head.next;
            size--;
            return ;
        }
        while(i<idx){
            temp = temp.next;
            i++;
        }

        //prev == temp
        temp.next = temp.next.next;
        size--;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        deleteNth ll = new deleteNth();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.print();
        ll.removeNth(3);
        ll.print();
        System.out.println(size);
    }   
}
