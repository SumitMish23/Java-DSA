import java.util.LinkedList;

import javax.swing.plaf.synth.SynthStyle;

public class linkedLists {

    linkedLists() {
        this.size = 0;
    }

    private int size;
    private Node head;
    private Node tail;
   public void recur(int index,int value ){
       head=insertWithRecursion(index, value,head);



   }

   public void removeduplicates(){
       Node temp=head;
       while(temp.next!=null){
           temp=temp.next;
           if(temp.value==temp.next.value){
               temp.next=temp.next.next;
               System.out.println("The temp.next is "+temp.value);
               System.out.println("The temp.next.next is"+temp.next.value);

           }
       }

   }
   public Node insertWithRecursion(int  index,int value,Node node){
    if(value==0){
    Node temp=new Node(value);
    temp.next=node;
    size++;
    return temp;
}
          node.next= insertWithRecursion(index--, value, node.next);
          return node;
   }

    public void insertatFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtposition(int val, int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
            System.out.println("temp is" + temp.value);
            System.out.println("temp.next is" + temp.next.value);
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
    }

    public void insertatLast(int val) {
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = node;
        size++;
        // System.out.println(temp.value);

    }

    // Delete The Nodes :-

    public void deleteAtfirst() {
        Node temp = head;
        head = head.next;
        size--;

    }

    public int deleteAtLast() {
        if (size <= 1) {
            deleteAtfirst();
        }
        Node temp = getNode(size - 1);

        int value = tail.value;
        System.out.println("tail" + tail.value);
        tail = temp;
        tail.next = null;
        return value;

    }

    public int deleteAtPosition(int index) {

        Node temp = getNode(index - 1);
        int val = temp.next.value;

        temp.next = temp.next.next;

        return val;

    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public void display() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;

        }
        System.out.print("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String args[]) {
        linkedLists list = new linkedLists();
        list.insertatFirst(1);
       
        list.insertatFirst(2);
        list.insertatFirst(2);
        list.insertatFirst(3);
        list.insertatFirst(4);
        list.insertatFirst(4);
        list.insertatLast(230);
        list.insertatLast(230);
     
        list.insertAtposition(12, 3);
        list.deleteAtfirst();
        // list.deleteAtLast();
        // list.deleteAtPosition(2);

        list.display();
        list.deleteAtPosition(2);
        System.out.println();
        list.display();
        list.removeduplicates();
        System.out.println();
        // list.recur(9899, 2);
        list.display();

    }
}