/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifg.edu.arvore;

import java.util.Iterator;

/**
 *
 * @author Lucas
 */
public interface Tree<E>{
    /**Retorna a quantidade de nodos da arvore **/
    public int size() throws Exception;
    /** Retorna se a arvore esta vazia **/
    public boolean isEmpty() throws Exception;
    /** Retorna um iterador sobre os elementos armazenados na arvore **/
    public Iterator<E> iterator() throws Exception;
    /** Retorna uma coleção iterável dos nodos */
    public Iterable<Position<E>> positions() throws Exception;
    /** Substitui o elemento armazenado em um dado nodo **/
    public E replace(Position<E> v, E e) throws Exception;
    /** Retorna a raiz de uma arvore **/
    public Position<E> root() throws Exception;
    /** Retorna o pai de um dado nodo **/
    public Position<E> parent(Position<E> v) throws Exception;
    /** Retorna os filhos  de um dado nodo **/
    public Iterable<Position<E>> children(Position<E> v) throws Exception;
    /** Retorna se um dado nodo eh interno **/
    public boolean isInternal(Position<E> v) throws Exception;
    /** Retorna se um dado nodo eh externo **/
    public boolean isExternal(Position<E> v) throws Exception;
    /** Retorna se um dado nodo eh a raiz da arvore **/
    public boolean isRoot(Position<E> v) throws Exception;
}   
