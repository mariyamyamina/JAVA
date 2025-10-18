package LinkedList;
import java.util.ArrayList;

public  class Palindrome{
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

    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }

        Node mid = middleNode(head);

        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while(right != null){
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isPalindrome(Node head){
        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;

        while(temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }

        int i=0 , j = list.size()-1;
        while(i < j ){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[]args){
        Palindrome ll = new Palindrome();
        int arr[] = {1,2,3,4,1};

        for(int val : arr){
            ll.addLast(val);
        }

        ll.print();
        System.out.print(ll.isPalindrome(ll.head));
    }
}