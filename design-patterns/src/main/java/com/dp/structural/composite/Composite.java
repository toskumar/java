package com.dp.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Node {
	String getName();

	List<Node> getChildren();

	void addChild(Node node);

	void removeChild(Node node);

	void traverse();
}

class TreeNode implements Node {

	String name;
	List<Node> children;

	public TreeNode(String name) {
		this.name = name;
		this.children = new ArrayList<Node>();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void addChild(Node node) {
		if (!this.children.contains(node)) {
			this.children.add(node);
		}
	}

	@Override
	public void removeChild(Node node) {
		if (this.getChildren().contains(node)) {
			this.children.remove(node);
		}
	}

	@Override
	public List<Node> getChildren() {
		return this.children;
	}

	@Override
	public void traverse() {
		this.traverse(this);
	}

	private void traverse(Node node) {

		if (node != null) {
			System.out.println(node.getName());

			Iterator<Node> iter = node.getChildren().iterator();

			while (iter.hasNext()) {
				traverse(iter.next());
			}
		}
	}
}
