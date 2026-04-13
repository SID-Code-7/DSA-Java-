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
    public static int size;

    //addfirst node 
    public void addFirst(int data){
        // creat new node
        Node newnNode = new Node(data);
        size++;

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
        size++;
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
        size++;
        if(idx == 0){
            addFirst(data);
            return;
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

    //remove first node
    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return -1;
        }
        if(size == 1){
            int val =head.data;
            head = tail = null;
            size =0;
            return val;
        }
        
        Node prev =head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    //linear search
    public int search (int key){
        Node temp = head;
        int idx =0;
        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            else{
                temp = temp.next;
                idx++;
            }
        }
        return -1;
    }

    // recursive search 
    public int recSearch(int key, Node head){
         
        //base case 
        if(head == null){
            return -1;
        }

        //kaam
        if(head.data == key){
            return 0;
        }
        int idx = recSearch(key,head.next);
        if(idx == -1) return -1;

        return idx+1;
        
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
        // System.out.println(size);
        // ll.removeFirst();
        // ll.removeLast();
        System.out.println(ll.search(3));
        System.out.println(ll.recSearch(3, head));
        ll.print();
        // System.out.print(size);
    }
}
