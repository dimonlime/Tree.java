package vsu.cs.soshich;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        // Заполнение дерева вручную (вставляем узлы в дерево):
        tree.insertNode(63);
        tree.insertNode(9);
        tree.insertNode(87);
        tree.insertNode(3);
        tree.insertNode(51);
        tree.insertNode(85);
        tree.insertNode(99);
        tree.insertNode(74);
        tree.insertNode(86);
        tree.insertNode(80);
        tree.insertNode(12);
        tree.insertNode(432);
        tree.insertNode(85);
        tree.insertNode(32);
        tree.insertNode( 10);
        tree.insertNode( 5);
        tree.insertNode( 4);
        tree.insertNode( 8);
        tree.insertNode( 1);
        System.out.println();
        // отображение дерева:
        tree.printTree();
        tree.getLeftCount();
        tree.getRightCount();
        tree.printLeftRight();
    }
}
