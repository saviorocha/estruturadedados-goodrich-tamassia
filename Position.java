package com.ifg.edu.arvore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public interface Position<E> {
    /** Retorna o elemento armazenado nessa posição **/
    E element();
    Position<E> getRight();
    Position<E> getLeft();
    Position<E> getParent();
    void setRight(Position<E> v);
    void setLeft(Position<E> v);
    void setParent(Position<E> v);
    void setElement(E e);
}
