package com.example.demo;

public class BTree {
    public int data;
    public BTree left;
    public BTree rigth;

    public boolean hasLeft(){
        return left != null;
    }

    public boolean hasRigth(){
        return rigth != null;
    }

    public BTree(){}
}

class mainTree{
    public static void main(String[] args) {
        BTree root = new BTree();
        root.data = 0;

        BTree node1 = new BTree();
        node1.data = 1;

        BTree node2 = new BTree();
        node2.data = 2;

        BTree node3 = new BTree();
        node3.data = 3;

        BTree node4 = new BTree();
        node4.data = 4;

        BTree node5 = new BTree();
        node5.data = 5;

        BTree node6 = new BTree();
        node6.data = 6;

        root.left = node1;
        root.rigth = node2;

        node1.left = node3;
        node1.rigth = node4;

        node2.left = node5;
        node2.rigth = node6;

        System.out.println("先序遍历二叉树:");
        queryFirst(root);
        System.out.println();

        System.out.println("中序遍历二叉树:");
        queryMiddle(root);
        System.out.println();

        System.out.println("后序遍历二叉树:");
        queryLast(root);
        System.out.println();
    }
    //先序遍历二叉树
    public static void queryFirst(BTree tree){
        if(tree == null){
            return;
        }
        System.out.print(tree.data+"\t");
        if(tree.hasLeft()){
            queryFirst(tree.left);
        }
        if(tree.hasRigth()){
            queryFirst(tree.rigth);
        }
    }
    //中序遍历二叉树
    public static void queryMiddle(BTree tree){
        if(tree == null){
            return;
        }
        if(tree.hasLeft()){
            queryMiddle(tree.left);
        }
        System.out.print(tree.data+"\t");
        if(tree.hasRigth()){
            queryMiddle(tree.rigth);
        }
    }
    //后序便利二叉树
    public static void queryLast(BTree tree){
        if(tree == null){
            return;
        }
        if(tree.hasLeft()){
            queryLast(tree.left);
        }
        if(tree.hasRigth()){
            queryLast(tree.rigth);
        }
        System.out.print(tree.data+"\t");
    }
}
