package Algorithms.Trees;

import java.util.ArrayList;

public class LargestBSTinBinaryTree {
	static class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data = data;
			this.left = this.right=null;
		}
	}
	static class Info{
		boolean isBST;
		int size,min,max;
		
		public Info(boolean isBST, int size, int min, int max) {
			this.isBST = isBST;
			this.size = size;
			this.min = min;
			this.max = max;
		}
	}
	public static int maxBST = 0;
	public static Node Root_bst =null;
	
	public static Info largestBST(Node root){
		if(root==null){
			return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		Info leftInfo = largestBST(root.left);
		Info rightInfo = largestBST(root.right);
		int size = leftInfo.size+rightInfo.size+1;
		int max = Math.max(root.data,Math.max(leftInfo.max, rightInfo.max));
		int min = Math.min(root.data,Math.min(leftInfo.min, rightInfo.min));
		if(root.data<= leftInfo.max||root.data>= rightInfo.min){
			return new Info(false,size,min,max);
		}
		if(leftInfo.isBST && rightInfo.isBST){
			maxBST = Math.max(maxBST,size);
			Root_bst = root;
			return new Info(true,size,min,max);
		}
		return new Info(false,size,min,max);
	}
	
	public static void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void getInorder(Node root, ArrayList<Integer> arr){
		if(root==null){
			return;
		}
		getInorder(root.left,arr);
		arr.add(root.data );
		getInorder(root.left,arr);
	}
	public static Node createBST(ArrayList<Integer> li,int st,int end){
		if(st>end){
			return null;
		}
		int mid = (end-st)/2+st;
		Node temp = new Node(li.get(mid));
		temp.left = createBST(li,st,mid-1);
		temp.right = createBST(li,mid+1,end);
		return temp;
	}
	public static Node mergeBSTs(Node root1,Node root2){
		//step1 calculate inorder sequence of 1st bst
		ArrayList<Integer> arr1 = new ArrayList<>();
		getInorder(root1,arr1);
		//step2 calculate inorder sequence of 2nd bst
		ArrayList<Integer> arr2 = new ArrayList<>();
		getInorder(root2,arr2);
		//merge
		ArrayList<Integer> finalList = new ArrayList<>();
		int i=0,j=0,k=0;
		while(i<arr1.size()&& j<arr2.size()){
			if(arr1.get(i)>arr2.get(j)){
				finalList.add(arr2.get(j));
						j++;
			}
			else{
				finalList.add(arr1.get(i));
				i++;
			}
		}
		while(j<arr2.size()){
			finalList.add(arr2.get(j));
			j++;
		}
		while(i<arr1.size()){
			finalList.add(arr1.get(i));
			i++;
		}
		//sorted AL -> balanced BST
		return createBST(finalList,0,finalList.size()-1);
	}
//	public static void preorder(Node root){
//		if(root==null){
//			return;
//		}
//		System.out.print(root.data+" ");
//		preorder(root.left);
//	}
	public static void main(String[] args) {
//		 Node root = new Node(50);
//		 root.left = new Node(30);
//		 root.left.left = new Node(5);
//		 root.left.right = new Node(20);
//		 root.right = new Node(60);
//		 root.right.left = new Node(45);
//		 root.right.right = new Node(70);
//		 root.right.right.left = new Node(65);
//		 root.right.right.right = new Node(80);
//		 Info info = largestBST(root);
//		System.out.println(maxBST);
//		System.out.println(Root_bst.data);
//		preorder(Root_bst);
//		BinarySearchTree tr = new BinarySearchTree();
//		System.out.println();
//      Merge two BST
		
		
		Node root1 = new Node(2);
		root1.left = new Node(1);
		root1.right = new Node(4);
		
		Node root2 = new Node(9);
		root2.left = new Node(3);
		root2.right = new Node(12);
		
		Node root = mergeBSTs(root1,root2);
		preorder(root);
	}
}
