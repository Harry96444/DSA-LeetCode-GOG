
class LinkedList {
    Node head;
    public void print() {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        Node curr = head;
        int c = 0;
        while(curr != null) {
            c++;
            curr = curr.next;
        }
        return c;
    }
    public void addFirst(int x) {
        Node n = new Node(x);
        if(isEmpty()) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }
    public void addLast(int x) {
        Node newNode = new Node(x);
        if(isEmpty()) {
            addFirst(x);
        } else {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    private class Node {
        int data;
        Node next;
        public Node(){}
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

class MakeLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);ll.addFirst(3);ll.addFirst(5);
        ll.print();
    }
}