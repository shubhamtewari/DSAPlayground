import ds.ALinkedList;
import ds.ANAryTree;
import ds.AStack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //stack();
        //linkedList();
        nAryTree();
    }

    public static void linkedList() {
        ALinkedList<Integer> aLinkedList = new ALinkedList<>(3);
        aLinkedList.addBegin(2);
        aLinkedList.addBegin(4);
        aLinkedList.addEnd(100);
        aLinkedList.addIndex(2, 554);
        aLinkedList.print();
        aLinkedList.addIndex(5, 999);
        aLinkedList.print();
        aLinkedList.addIndex(0, 0);
        aLinkedList.print();
        aLinkedList.remove(2);
        aLinkedList.print();
        aLinkedList.remove(100);
        aLinkedList.print();
        aLinkedList.remove(4);
        aLinkedList.print();
        aLinkedList.remove(123);
        aLinkedList.print();
        aLinkedList.remove(3);
        aLinkedList.print();
        aLinkedList.remove(123);
    }

    public static void stack() {
        AStack aStack = new AStack(2);
        aStack.push(3);
        aStack.push(7);
        aStack.push(112);
        aStack.push(0);
        aStack.print();
        aStack.pop();
        aStack.pop();
        aStack.pop();
        aStack.print();
        aStack.push(678);
        aStack.print();
        System.out.println("Peek: " + aStack.peek());
        aStack.pop();
        aStack.pop();
        aStack.pop();
        aStack.print();
        aStack.pop();
    }

    public static void nAryTree() {
        ANAryTree.Node[] rc211 = new ANAryTree.Node[3];
        rc211[0] = new ANAryTree.Node(1024, null);
        rc211[1] = new ANAryTree.Node(1021, null);
        rc211[2] = new ANAryTree.Node(10211, null);

        ANAryTree.Node[] rc2 = new ANAryTree.Node[2];
        rc2[0] = new ANAryTree.Node(84, rc211);
        rc2[1] = new ANAryTree.Node(83, null);

        ANAryTree.Node[] rc11 = new ANAryTree.Node[2];
        rc11[0] = new ANAryTree.Node(211, null);
        rc11[1] = new ANAryTree.Node(101, null);

        ANAryTree.Node[] rc12 = new ANAryTree.Node[2];
        rc12[0] = new ANAryTree.Node(311, null);
        rc12[1] = new ANAryTree.Node(151, null);

        ANAryTree.Node[] rc1 = new ANAryTree.Node[2];
        rc1[0] = new ANAryTree.Node(67, rc11);
        rc1[1] = new ANAryTree.Node(98, rc12);

        ANAryTree.Node[] rc = new ANAryTree.Node[2];
        rc[0] = new ANAryTree.Node(12, rc1);
        rc[1] = new ANAryTree.Node(23, rc2);

        ANAryTree anAryTree = new ANAryTree(101, rc);

        anAryTree.DFS(anAryTree.root);
        System.out.println();
        anAryTree.I_DFS(anAryTree.root);
        anAryTree.BFS(anAryTree.root);
    }
}