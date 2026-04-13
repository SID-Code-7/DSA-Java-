package linkedlist;

public class palindrom {
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

   // main ans 
   public Node midNode(){  // slow is our mid
        //slow fast approch for mid
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }

        return slow;
   }

   public boolean check(){
    //step 1 find mid
    Node mid =  midNode();
    // step 2 reverse from mid
    Node prev = null;
    Node curr = mid;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node right = prev;
    Node left = head;

    // step 3 check both half left and right
    while(right != null){
        if(left.data != right.data){
            return false;
        }

        right = right.next;
        left = left.next;
    }

    return true;

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
        palindrom ll = new palindrom();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(1);
        System.out.println(ll.check());
    }   
}
