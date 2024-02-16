package ds;

public class AStack {
    Node top;

    public AStack(int data) {
        top = new Node();
        top.data = data;
    }

    public void push(int data) {
        Node node = new Node();
        node.data = data;
        if (top == null) {
            top = node;
            return;
        }
        node.next = top;
        top = node;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Empty Stack!");
            return -1;
        }
        Node curr = top;
        top = curr.next;
        return curr.data;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Empty Stack!");
        }
        return top.data;
    }

    public void print() {
        System.out.println("---");
        Node curr = top;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println("---");
    }

    public static class Node {
        int data;
        Node next;
    }
}
