package LinkedList;

public class IterativeSearch {
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

        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void print(){
        Node temp = head;

        if(head == null){
            System.out.print("LL is Empty");
            return;
        }

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
       System.out.println("null");
    }

    public int ItrSearch(int key){
        Node temp = head;
        int idx=0;
        while(temp != null){
            if(temp.data == key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public static void main(String args[]){
        IterativeSearch ll = new IterativeSearch();

        int arr[] = {1,3,5,7,9};

        for(int val : arr){
            ll.addLast(val);
        }

        ll.print();
        System.out.print(ll.ItrSearch(2));
    }
}
