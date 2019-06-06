package com.challa.dsmastery.tree;

public class TreeUtil {
	
	public static Node getBinaryTree(){
		Node node=new Node(-20);
		node.left=new Node(5);
		node.left.left=new Node(3);
		node.left.right=new Node(4);
		node.right=new Node(6);
		node.right.left=new  Node(2);
		node.right.right=new Node(1);
		return node;
	}

}
