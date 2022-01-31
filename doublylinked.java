public class doublylinked {
    int size;

    doublylinked() {
        this.size = 0;
    }

    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;

        }

    }

    public void insertAtfirst(int value) {

        Node temp = new Node(value);

        temp.next = head;
        temp.prev = null;
        if (head != null) {
            head.prev = temp;
        }
        head = temp;

        size++;

    }

    public void insertAtLast(int value){
        Node node=new Node(value);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }

    public void display() {
        Node temp;
        temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;

        }
        System.out.println("End");

        System.out.println("Reverse Order !");
        while (last != null) {

            System.out.print(last.value + " -> ");

            last = last.prev;

        }
        System.out.print("End");
        System.out.println();

    }

    public static void main(String args[]){
        doublylinked doublyLinkedList=new doublylinked();
        doublyLinkedList.insertAtfirst(16);
        doublyLinkedList.insertAtfirst(76);
        doublyLinkedList.insertAtfirst(23);
        doublyLinkedList.display();
        System.out.println("--------Second Time Display :-------");
        doublyLinkedList.insertAtLast(99);
        doublyLinkedList.insertAtLast(100);
        doublyLinkedList.display();


    }
}
