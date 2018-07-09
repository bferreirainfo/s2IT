package com.S2Test.arvorebinaria;

public class BinaryNode {
	int valor;
	BinaryNode left;
	BinaryNode right;

	public BinaryNode(int valor) {
		this.valor = valor;
	}
	
	/**
	 * NÃO DEU TEMPO DE CRIAR COM BDD ESTE, RECORRI AO BOM E VELHO MÉTODO MAIN
	 */
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree(1000);
		tree.root.left = new BinaryNode(1);
		tree.root.right = new BinaryNode(2);
		tree.root.left.left = new BinaryNode(3);
		tree.root.left.right = new BinaryNode(4);
		tree.root.left.right.right = new BinaryNode(5);
		System.out.println("total : " + tree.getValorTotalSubsequente(tree.root));
	}
}
