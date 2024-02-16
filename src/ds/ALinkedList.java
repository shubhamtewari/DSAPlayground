package ds;

public class ALinkedList<T> {
    Node<T> head;
    public ALinkedList(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        head = node;
    }

    public void addEnd(T data) {
        Node<T> node = new Node<T>();
        node.data = data;
        if (head == null) {
            head = node;
            return;
        }
        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }

    public void addBegin(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void addIndex(int index, T data) {
        Node<T> add = new Node<T>();
        add.data = data;
        if (index == 0) {
            if (head == null) {
                head = add;
            } else {
                add.next = head;
                head = add;
            }
            return;
        }
        Node<T> prev = head;
        for (int i = 1; i < index; i++) {
            if (prev != null) {
                prev = prev.next;
            }
        }
        if (prev == null) {
            System.out.println("Index out of bounds!");
        } else {
            add.next = prev.next;
            prev.next = add;
        }
    }

    public T remove(T data) {
        if (head == null) {
            System.out.println("Empty List!");
            return null;
        }
        Node<T> prev = null;
        Node<T> curr = head;
        while (curr != null) {
            if (curr.data == data) {
                if (prev == null) {
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return curr.data;
            }
            prev = curr;
            curr = curr.next;
        }
        return null;
    }

    public void print() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data.toString() + ((curr.next == null) ? "" : " -> "));
            curr = curr.next;
        }
        System.out.println();
    }

    public static class Node<T> {
        T data;
        Node<T> next;
    }
}
