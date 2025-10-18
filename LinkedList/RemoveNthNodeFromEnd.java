package LinkedList;

public class RemoveNthNodeFromEnd{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }

    Node head;
    Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeNode(int n){
        int size = 0 ;

        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(n==size){
            head = head.next;
            return;
        }

        int i=1;
        int iToFind = size-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[]args){
        RemoveNthNodeFromEnd ll = new RemoveNthNodeFromEnd();

        int arr[]={1,2,3,4,5};

        for(int val : arr){
            ll.addLast(val);
        }

        ll.print();
        ll.removeNode(1);
        ll.print();
    }
}