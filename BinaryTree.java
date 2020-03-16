/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifg.edu.arvore;

import java.util.Iterator;
import java.util.logging.Logger;

/**
 * addRoot(e)
 *
 * • insertLeft(v, e)
 *
 * • insertRight(v, e)
 *
 * • remove(v)
 *
 * • attach(v, T1, T2): conecta T1 e T2 como subárvores da esquerda e da direita
 *
 * de v
 *
 * • sibling(v): retorna os irmãos de v
 *
 * @author Savio
 */
public class BinaryTree<E> implements Tree<E> {

    private Position<E> root;
    private int size;

    public BinaryTree() {
        this.root = new BTNode<E> (null, null, null, null);//instacia-se como uma árvore nula
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void addRoot(E e) {
        root.setElement(e);
    }
    //adicionar um if pois a arvore binaria eh ordenada
    public void insertLeft(Position<E> v, E e) throws Exception {
        if (v.getLeft() == null) {
            Position<E> leftV = new BTNode<>(e, v, null, null);
            v.setLeft(leftV);
        } else {
            throw new Exception("Node already has a left child");
        }
    }

    public void insertRight(Position<E> v, E e) throws Exception {
        if (v.getRight() == null) {
            Position<E> rightV = new BTNode<>(e, v, null, null);
            v.setRight(rightV);
        } else {
            throw new Exception("Node already has a right child");
        }
    }
//

    public void remove(Position<E> v) {
        //parentV = v.getParent();
        v.setElement(null);
    }

    public void attach(BinaryTree T1, BinaryTree T2, Position<E> v) throws Exception {
        if (v.getLeft() == null && v.getRight() == null) {
            v.setLeft(T1.root());
            v.setRight(T2.root());
        } else {
            throw new Exception("Node has children");
        }
    }

    public Position<E> sibling(Position<E> v) throws Exception {
        Position<E> parentV = v.getParent();
        if (parentV.getLeft() == v) {
            return parentV.getLeft();
        } else if (parentV.getRight() == v) {
            return parentV.getRight();
        } else {
            throw new Exception("Node has no sibling");
        }
    }

    @Override
    public boolean isEmpty() throws Exception {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Position<E>> positions() throws Exception {
    	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E replace(Position<E> v, E e) throws Exception {
        v.setElement(e);
        return e;
    }

    @Override
    public Position<E> root() throws Exception {
        return root;
    }

    @Override
    public Position<E> parent(Position<E> v) throws Exception {
    	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Position<E>> children(Position<E> v) throws Exception {
    	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInternal(Position<E> v) throws Exception {
        return !(v.getLeft() == null || v.getRight() == null);
    }

    @Override
    public boolean isExternal(Position<E> v) throws Exception {
        return (v.getLeft() == null || v.getRight() == null);
    }

    @Override
    public boolean isRoot(Position<E> v) throws Exception {
        return v.getParent() == null;
    }
}
