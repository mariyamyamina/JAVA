package LinkedList;

public class RecursiveSearch {
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

    public int recSearch(Node head , int key){
        
        if(head==null) return -1;

        if(head.data == key) return 0;

        int idx = recSearch(head.next , key);

        if(idx==-1) return -1;

        return idx+1;
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
        RecursiveSearch ll = new RecursiveSearch();
        int arr[] = {10,20,30,40,50};

        for(int val : arr){
            ll.addLast(val);
        }

        ll.print();
        System.out.print(ll.recSearch(ll.head,20));
    }
}
