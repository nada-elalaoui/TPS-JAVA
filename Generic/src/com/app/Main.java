package com.app;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.insert(5);
        tree.insert(7);
        tree.insert(4);
        tree.insert(3);
        tree.insert(8);

        System.out.println(tree.contenir(56));


    }
}
