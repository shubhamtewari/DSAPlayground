package ds;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class ANAryTree {
    public Node root;

    public ANAryTree(int data, Node[] children) {
        root = new Node(data, children);
    }

    public static class Node {

        public Node(int data, Node[] children) {
            this.data = data;
            this.children = children;
        }

        public int data;
        public Node[] children;
    }

    public void BFS(Node root) {
        if (root == null) {
            return;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");
            if (curr.children != null) {
                queue.addAll(Arrays.asList(curr.children));
            }
        }
        System.out.println();
    }

    public void DFS(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        if (root.children != null) {
            for (Node node : root.children) {
                DFS(node);
            }
        }
    }

    public void I_DFS(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " ");
            if (curr.children != null) {
                for (int i = curr.children.length - 1; i >= 0; i--) {
                    stack.add(curr.children[i]);
                }
            }
        }
        System.out.println();
    }
}
