package com.challa.dsmastery.tree;

import java.util.Stack;

public class InorderIterator {
	Stack<Node>  stack=null;
	public InorderIterator(Node node){
		stack=new Stack<Node>();
        while(node !=null ){
        	 stack.push(node);
        	 node=node.left;
        }
	}
	public boolean hasNext(){
		return stack==null || stack.isEmpty() ? false : true;
	}
	public int next() {
		Node node=stack.pop();
		int data=node.data; 
		if( node.right!=null ){
			node=node.right;
			stack.push(node);
			node=node.left;
			while(node!=null){
				stack.push(node);
				node=node.left;
			}
		}
		return data;
	}
	
	public static void main(String[] args) {
		InorderIterator it=new InorderIterator(TreeUtil.getBinaryTree());
		while(it.hasNext()){
			System.out.println(it.next());
		}
	

	}

}
