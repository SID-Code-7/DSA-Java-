package linkedlist;

public class zigzag {
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

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        
    }

    public void zig(){
        //mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast =fast.next.next;
        }

        Node mid = slow;

        //reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //alternate head

        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            //update
            left = nextL;
            right = nextR;

        }
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
        zigzag ll = new zigzag();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.print();
        ll.zig();
        ll.print();
    }   
}
