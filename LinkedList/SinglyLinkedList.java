
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
    public void addAt(int x,int pos) {
        Node newNode = new Node(x);
        if(pos == 1 || isEmpty()) {
            addFirst(x);
        } else if(pos == size() + 1) {
            addLast(x);
        } else {
            Node curr = head;
            for(int i = 1; i < pos-1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }
    public int deletefirst() {
        if(isEmpty()) {
            return -1;
        } else {
            int d = head.data;
            head = head.next;
            return d;
        }
    }
    public int deleteLast() {
        if(isEmpty()) {
            return -1;
        } else if(size() == 1){
            return deletefirst();
        } else if(size() == 2) {
            int d = head.next.data;
            head.next = null;
            return d;
        } else {
            Node curr = head;
            while(curr.next.next != null) {
                curr = curr.next;
            }
            int d = curr.next.data;
            curr.next = null;
            return d;
        }
    }
    public int deleteAt(int pos) {
        if(isEmpty()) {
            return -1;
        } else if(pos == 1) {
            return deletefirst();
        } else if(pos == size()) {
            return deleteLast();
        } else {
            Node curr = head;
            for(int i = 1; i < pos-1; i++) {
                curr = curr.next;
            }
            int d = curr.next.data;
            Node t = curr.next.next;
            curr.next = t;
            return d;
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

class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(4);ll.addLast(3);ll.addLast(5);ll.addFirst(10);
        ll.addAt(1, 4);
        ll.print();
        ll.deleteAt(5);
        System.out.println("\nAfter deleting Last");
        ll.print();
    }
}