package linkedlist;

public class cycle {
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
    //if nodes have cycle that means slow and fast pointer meet at same node once
    public static boolean check(){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    //remove that node 
    public static void remove(){
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag=true;
                break;
            }
        }
        if(flag == false){
            return;
        }
        //find where slow and fast meet again after making slow = head
        slow = head;
        Node prev =null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next=null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // 1-2-3-2
        System.out.println(check());
        remove();
        System.out.println(check());
    }
}
