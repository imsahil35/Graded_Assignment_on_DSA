import java.util.*;

class Merge&Sort {
    class Node {
        int data;
        Node head;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    public void insert(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
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
        System.out.println();
    }

    public void sort() {
        Node node = head;
        while(node != null) {
            Node temp = node.next;
            while(temp != null) {
                if(node.data > temp.data) {
                    int current = node.data;
                    node.data = temp.data;
                    temp.data = current;
                }
                temp = temp.next;
            }
            node = node.next;
        }
    }

    public void merge(Merge&Sort list2) {
        Node node = head;
        while(node.next != null) {
            node = node.next;
        }
        node.next = list2.head;
    }

    public static void main(String[] args) {
        Merge&Sort ms1 = new Merge&Sort();
        Merge&Sort ms2 = new Merge&Sort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            ms1.insert(sc.nextInt());
        }
        ms1.display();
        for(int i = 0; i < n; i++) {
            ms2.insert(sc.nextInt());
        }
        ms2.display();
        ms1.merge(merge_sort2);
        ms1.sort();
        ms1.display();
    }
}
