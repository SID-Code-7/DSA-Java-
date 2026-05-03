package linkedlist;

public class mergesort {
    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //getmid
    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    //merge

    public static Node merge(Node head1,Node head2){
        Node newMerge = new Node(-1);
        Node temp = newMerge;

        //comparison
        while(head1 != null && head2 != null){

            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return newMerge.next;
    }

    public static Node sort(Node head){
        //base case 
        if(head == null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        // divide into 2 halfs 
        Node right = mid.next;
        mid.next =null;
        Node newLeft = sort(head);
        Node newRight = sort(right);

        //merge them
        return merge(newLeft,newRight);
    }


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
        mergesort ll = new mergesort();
        head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        ll.print();
        head = sort(head);
        ll.print();
    }
}
