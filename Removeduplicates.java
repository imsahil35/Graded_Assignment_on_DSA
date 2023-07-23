import java.util.*;

class Removeduplicates {
    class Node {
        int data;
        Node next;
        Node head;
        public Node(int data) {
            this.data = data;
        }
    }

    Node head;
    public void insert(int data) {
        Node node = new Node(data);
        Node temp = head;
        if(head == null) {
            head = node;
        }
        else {
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void rmvdup() {
        if(head == null) {
            return;
        }
        HashSet<Integer> dup = new HashSet<>();
        Node current = head;
        Node previous = null;

        while (current != null) {
            if (dup.contains(current.data)) {
                previous.next = current.next;
            } else {
                dup.add(current.data);
                previous = current;
            }
            current = current.next;
        }

    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Removeduplicates list = new Removeduplicates();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }
        list.rmvdup();
        list.display();
    }
}
