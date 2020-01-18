package com.app;

public class BinaryTree<E extends Comparable>{
// on indique le type E des éléments contenues dans l'arbre
    Noeud racine = null;

    public void insert(E value) {
        if(racine == null) {
            racine = new Noeud(value);
        }
        else
            insert(this.racine,value);
    }

    public void insert(Noeud noeud, E value) {

        if (noeud.getValue().compareTo(value) > 0 ) {
            if (noeud.getLeftNode() != null) {
                insert(noeud.getLeftNode(), value);
            } else {
                System.out.println(" Insertion de  " + value + " a gauche de " + noeud.getValue());
                noeud.setLeftNode(new Noeud<E>(value));
            }
        } else if (noeud.getValue().compareTo(value) < 0 ) {
            if (noeud.getRightNode() != null) {
                insert(noeud.getRightNode(), value);
            } else {
                System.out.println("  Insertion de " + value + " a droite de " + noeud.getValue());
                noeud.setRightNode(new Noeud<E>(value));
            }
        }
    }
// une arborescence elle a un noeud racine
    //le sous noeud gauche est la racine d'un arbre qui contient
    // les éléments inférieurs ou égaux à la valeur du noeud
    //le sous noeud droit est la racine d'un arbre qui contient les élements 
    // supérieurs à la valeur du noeud


    public boolean contenir(Noeud node, E value) {
        if (node != null) {
            if (node.getValue().compareTo(value)==0)
                return true;
            else if(node.getValue().compareTo(value)<0)
                return contenir(node.getRightNode(),value);
            else if (node.getValue().compareTo(value) > 0)
                return contenir(node.getLeftNode(),value);
        }
        return false;

    }



    public boolean contenir(E value) {
        return contenir(this.racine,value);
    }


    public void afficher(Noeud node) {
        if (node != null) {
            afficher(node.getLeftNode());
            System.out.println(" " + node.getValue());
            afficher(node.getRightNode());
        }
    }
    //méthode pour afficher les éléments dans leur
    //ordre naturel 

    public void afficher() {
        afficher(racine);
    }







    }
