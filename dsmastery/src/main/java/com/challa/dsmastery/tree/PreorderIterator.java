package com.challa.dsmastery.tree;

import java.util.Stack;

public class PreorderIterator {
	Stack<Node>  stack=null;
	public  PreorderIterator(Node node){
		stack=new Stack<Node>();
        stack.push(node);
	}
	public boolean hasNext(){
		return stack==null || stack.isEmpty() ? false : true;
	}
	public int next() {
		Node node=stack.pop();
		int data=node.data; 
		if( node.right!=null ){
			stack.push(node.right);
		}
		if( node.left!=null ){
			stack.push(node.left);
		}
		return data;
	}
	
	public static void main(String[] args) {
		PreorderIterator pt=new PreorderIterator(TreeUtil.getBinaryTree());
		while(pt.hasNext()){
			System.out.println(pt.next());
		}
		
	}

}
