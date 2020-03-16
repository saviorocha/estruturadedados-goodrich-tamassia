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
public class Main {
	/*
	 * (Luziânia (dados (de (Estrutura()) campus()) sistemas (2019()informação
	 * (de()))) grestrutura de dados campus luziania 2019 sistemas de informação
	 */
	public static void main(String[] args) throws Exception {
		BinaryTree<String> bt = new BinaryTree<>();
		bt.addRoot("Luziânia");
		Position<String> root = bt.root();

		bt.insertLeft(root, "dados");
		bt.insertRight(root, "sistemas");

		bt.insertLeft(root.getLeft(), "de");
		bt.insertRight(root.getLeft(), "campus");
		bt.insertLeft(root.getRight(), "2019");
		bt.insertRight(root.getRight(), "informação");

		bt.insertLeft(root.getLeft().getLeft(), "estrutura");
		bt.insertLeft(root.getRight().getRight(), "de");

		caminhamentoEmOrdem(root);
	}

	public static void caminhamentoEmOrdem(Position<?> node) {
		if (node != null) {
			caminhamentoEmOrdem(node.getLeft());
			System.out.print(node.element() + " ");
			caminhamentoEmOrdem(node.getRight());
		}
	}
}
