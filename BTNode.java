/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifg.edu.arvore;

/**
 *
 * @author Savio
 */
public final class BTNode <E> implements Position<E>{
    E element;
    private Position<E> left, right, parent;
    
    public BTNode(E element, Position<E> parent,  Position<E> left, Position<E> right){
        this.element = element;
        setLeft(left);
        setRight(right);
        setParent(parent);
    }

    
    @Override
    public E element() {//retorna o elemento
        return element;
    }

    @Override
    public Position<E> getRight() {//retorna o filho da direita
        return right;
    }

    @Override
    public Position<E> getLeft() {
        return left;
    }

    @Override
    public Position<E> getParent() {
        return parent;
    }

    @Override
    public void setRight(Position<E> e) {
        this.right = e;
    }

    @Override
    public void setLeft(Position<E> e) {
        this.left = e;
    }

    @Override
    public void setParent(Position<E> e) {
        this.parent = e;
    }

    @Override
    public void setElement(E e) {
        this.element = e;
    }


}