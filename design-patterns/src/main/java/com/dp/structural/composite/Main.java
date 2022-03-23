package com.dp.structural.composite;

public class Main {

	public static void main(String[] args) {

		Node root = new TreeNode("root");
		Node child1 = new TreeNode("child1");
		Node child2 = new TreeNode("child2");

		Node child11 = new TreeNode("child11");
		Node child12 = new TreeNode("child12");

		root.addChild(child1);
		root.addChild(child2);
		child1.addChild(child11);
		child1.addChild(child12);

		root.traverse();

	}
}
