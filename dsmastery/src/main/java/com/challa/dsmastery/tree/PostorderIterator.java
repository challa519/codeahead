package com.challa.dsmastery.tree;

import java.util.Stack;

public class PostorderIterator {
	Stack<Node>  stack=null;
	public PostorderIterator(Node node){
		stack=new Stack<Node>();
        while(node !=null ){
        	 stack.push(node);
        	 node=node.right;
        }
	}
	public boolean hasNext(){
		return stack==null || stack.isEmpty() ? false : true;
	}
	public int next() {
		Node node=stack.pop();
		int data=node.data; 
		if( node.left!=null ){
			node=node.left;
			stack.push(node);
			node=node.right;
			while(node!=null){
				stack.push(node);
				node=node.right;
			}
		}
		return data;
	}

	public static void main(String[] args) {
		PostorderIterator pt=new PostorderIterator(TreeUtil.getBinaryTree());
		while(pt.hasNext()){
			System.out.println(pt.next());
		}

	}

}
