package com.challa.dsmastery.tree;

public class MaxSumSubTree {
	
	int sum=Integer.MIN_VALUE;
	public int maxSum(Node node){
		if(node == null ) return 0;
		int leftSum=maxSum(node.left);
		int rightSum=maxSum(node.right);
		int currSum=node.data+leftSum+rightSum;
		if(sum<currSum){
			sum=currSum;
		}
		return currSum;
	}

	public static void main(String[] args) {
		MaxSumSubTree tree=new MaxSumSubTree();
		System.out.println(tree.maxSum(TreeUtil.getBinaryTree()));
		System.out.println(tree.sum);
	}

}
