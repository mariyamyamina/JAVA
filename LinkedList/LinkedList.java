package LinkedList;

public class LinkedList {
    public static class Node{
        int data; // store the data
        Node next; //reference to next node

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void add(int idx , int data){
        Node newNode = new Node(data);
        int i=0;
        Node temp = head;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.print("LL is Empty");
            return;
        }

        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    public void removeLast(){
        if(head==null){
            System.out.print("LL is Empty");
            return;
        }

        if(head == tail){
            head = tail = null;
            return;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

    }
    public void printList(){
        Node temp = head;

        if(head==null){
            System.out.println("LL is Empty");
            return;
        }

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[]args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.printList();

        ll.addLast(3);
        ll.addLast(4);
        ll.printList();

        ll.add(2,9);
        ll.printList();

        ll.removeFirst();
        ll.printList();

        ll.removeLast();

        ll.printList();
    }
}
