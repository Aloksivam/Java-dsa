package Algorithms.Trees;

import java.util.ArrayList;

public class BinarySearchTree {
	static class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data = data;
			
		}
	}
	public static Node insert(Node root,int val){
		if(root==null){
			root = new Node(val);
			return root;
		}
			if(root.data>val){
				root.left = insert(root.left,val);
			}
			else{
				root.right = insert(root.right,val);
			}
		 
	return root;
	}
	public static void inorder(Node root)
	{
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static boolean SearchKey(Node root,int key){
		if(root==null)
			return false;
		if(root.data==key){
			return true;
		}
		if(root.data>key) {
			return SearchKey(root.left, key);
		}
		else {
			return SearchKey(root.right,key);
		}
		
		
	}
	public static Node delete(Node root,int val){
		if(root.data<val){
			root.right = delete(root.right,val);
		}
		else if(root.data>val){
			root.left = delete(root.left,val);
		}
		else{
			//case-1 leaf Node
			if(root.left==null && root.right==null){
				return null;
			}
			//case-2 single child
			if(root.left==null){
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			
			//Case-3 Both children exists
			//Is stands for inorder successor
			Node IS = findInorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		return root;
	}
	
	public static Node findInorderSuccessor(Node root){
		while (root.left!=null){
			root=root.left;
		}
		return root;
	}
	public static void PrintinRange(Node root,int k1,int k2){
		if(root==null){
			return;
		}
		if(root.data>=k1 && root.data<=k2){
			PrintinRange(root.left,k1,k2);
			System.out.println(root.data+" ");
			PrintinRange(root.right,k1,k2);
		} else if (root.data<k1) {
			PrintinRange(root.left,k1,k2);
		}
		else{
			PrintinRange(root.right,k1,k2);
		}
	}
	public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
		if(root==null){
			return;
		}
		path.add(root.data);
		if(root.left==null && root.right==null){
			printPath(path);
		}
		printRoot2Leaf(root.left,path);
		printRoot2Leaf(root.right,path);
		path.remove(path.size()-1);
		
	}
	public static void printPath(ArrayList<Integer> path){
		int i=0;
		while(i!=path.size()){
			System.out.print(path.get(i)+"-> ");
			i++;
		}
		System.out.println("Null");
	}
	public static boolean isValidBST(Node root,Node min,Node max){
		if(root==null){
			return true;
		}
		if(min!=null && root.data<=min.data){
			return false;
		}
		if(max!=null && root.data>=max.data){
			return false;
		}
		return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
	}
	public static Node createMirror(Node root){
		if(root==null){
			return null;
		}
		Node leftMirror = createMirror(root.left);
		Node rightMirror = createMirror(root.right);
		root.left = rightMirror;
		root.right = leftMirror;
		return root;
	}
	public static void preorder(Node root){
		if(root==null){
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static Node SortedArraytoBST(int[] arr,int low,int high){
		if(low>high){
			return null;
		}
		int mid = low+(high-low)/2;
		Node root = new Node(arr[mid]);
		root.left = SortedArraytoBST(arr,low,mid-1);
		root.right = SortedArraytoBST(arr,mid+1,high);
		return root;
	}
	
	public static void getInorder(Node root,ArrayList<Integer> inorder){
		if(root==null){
			return;
		}
		getInorder(root.left,inorder);
		inorder.add(root.data);
		getInorder(root.right,inorder);
	}
	
	public static Node createBST(ArrayList<Integer> arr,int l,int h ){
		if(l>h){
			return null;
		}
		int mid = l+ (h-l)/2;
		Node root = new Node(arr.get(mid));
		root.left = createBST(arr,l,mid-1);
		root.right = createBST(arr,mid+1,h);
		return root;
	}
	public static Node balanceBST(Node root){
		//calculate my inorder sequence
		// sorted tobst
		ArrayList<Integer> inorder = new ArrayList<>();
		getInorder(root,inorder);
		root = createBST(inorder,0,inorder.size()-1);
		return root;
	}
	
public static void main(String[] args) {
		System.out.println("Let us learn about binary search tree where left node is lesser than root node and right node is greater that root node");
//		int values[] = {5,1,3,4,2,7};
		int values[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
	for (int i = 0; i < values.length; i++) {
		root = insert(root,values[i]);
	}
	inorder(root);
	System.out.println();
	System.out.println(SearchKey(root,7));
//	root= delete(root,4);
//	inorder(root);
	System.out.println("Let us print in range of a binary search tree");
	PrintinRange(root,4,9);
	System.out.println("Let us print from root to leaf");
	printRoot2Leaf(root,new ArrayList<>());
	
	//Let us check that whether given bst is valid or not
	
	System.out.println(isValidBST(root,null,null));
	root = createMirror(root);
	preorder(root);
	
	//Let us try making a BST from a sorted array
	System.out.println("printing preorder of given sorted arrayt ");
	int[] arr = {3,5,6,8,10,11,12};
	Node root_from_arr = SortedArraytoBST(arr,0,arr.length-1);
	preorder(root_from_arr);
	
	 Node root2 = new Node(8);
	 root2.left = new Node(6);
	 root2.left.left = new Node(5);
	 root2.left.left.left = new Node(3);
	 
	 root2.right = new Node(10);
	 root2.right.right = new Node(11);
	 root2.right.right.right = new Node(12);
	Node root3 = balanceBST(root2);
	preorder(root3);
	}
}
