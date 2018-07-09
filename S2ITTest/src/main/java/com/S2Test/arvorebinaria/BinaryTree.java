package com.S2Test.arvorebinaria;

public class BinaryTree {
	public BinaryNode root;
	
	public BinaryTree(int valor) {
		root = new BinaryNode(valor);
	}
	
	/**
	 * RETORNA A SOMA DO VALOR DE TODOS OS NÓS INCLUINDO ESTE.
	 * @return
	 */
	public int getValorTotal() {
		return getValorTotalNode(root);
	}
	
	/**
	 * RETORNA A SOMA DO VALOR DE TODOS OS NÓS SUBSEQUENTES AO NÓ PASSADO COMO PARÂMETRO.
	 * @param node
	 * @return
	 */
	public int getValorTotalSubsequente(BinaryNode node) {
		// COMEÇA O CALCULO A PARTIR DOS NÓS SUBSEQUENTES IGNORANDO O VALOR DO NÓ ATUAL
		return getValorTotalNode(node.left) + getValorTotalNode(node.right);
	}

	private int getValorTotalNode(BinaryNode node) {
		if (node == null)
			return 0;
		else if (node.left == null && node.right == null)
			return node.valor; // CHEGOU AO FIM DO ÁRVORE
		else
			return node.valor + getValorTotalNode(node.left) + getValorTotalNode(node.right); // RECURSIVAMENTE SOMA O VALOR DO NÓ ATUAL COM NÓS SUBSEQUENTES
	}
}
