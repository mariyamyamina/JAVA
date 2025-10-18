package LinkedList;

public class ReverseLL {
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
            return;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
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
        ReverseLL ll = new ReverseLL();

        int arr[] = {1,2,3,4,5};

        for(int val : arr){
            ll.addLast(val);
        }

        ll.print();
        ll.reverse();
        ll.print();
    }
}
