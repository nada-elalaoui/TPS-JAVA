package com.app;


public class Noeud <E extends Comparable>{
    private E value;
    private Noeud<E> leftNode;
    private Noeud<E> rightNode;
// le type E indique les valeurs qui seront conservées dans le noeud
    public Noeud() {
        this(null); // constructeur sans paramètre
    }

    public Noeud(E value) {
        this(value,null,null);
    } // constructeur qui prend une valeur en paramètre

    public Noeud(E value, Noeud leftNode, Noeud rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;

    } // constructeur qui prends une valeur et les 2 noeuds gauche et droit
    


    public E getValue() {
        return value;
    }

    public Noeud getLeftNode() {
        return leftNode;
    }

    public Noeud getRightNode() {
        return rightNode;
    }


    public void setValue(E value) {
        this.value = value;
    }

    public void setLeftNode(Noeud leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Noeud rightNode) {
        this.rightNode = rightNode;
    }


    public void setLeftNodeValue(E leftNodeValue) {
        this.leftNode.value = leftNodeValue;
    }

    public void setRightNodeValue(E rightNodeValue) {
        this.rightNode.value = rightNodeValue;
    }



    @Override
    public String toString() {
        String toResult=  "Noeud{" +
                "value=" + value +
                ", leftNode=" + leftNode.value +
                ", rightNode=" + rightNode.value +
                '}';

        return toResult;

    } // méthode toString() qui affiche les valeurs du noeud et les sous-noeuds attachés 

}


// on a créer une classe un noeud d'un arbre binaire
// noeud peut avoir 2 noeuds fils : noeud gauche et noeud droit