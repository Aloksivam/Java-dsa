package Algorithms.Trees;

import java.util.*;

public class Treee {
	static class Node{
		int data;
		Node left,right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	static class BinaryTree{
		static int idx=-1;
		public static Node buildTree(int nodes[]){
			idx++;
			if(nodes[idx]==-1){
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}
		public static void Preorder(Node root){
			if(root==null){
				return;
			}
			System.out.println(root.data+" ");
			Preorder(root.left);
			Preorder(root.right);
		}
		public static void Postorder(Node root){
			if(root==null){
				return;
			}
			Postorder(root.left);
			Postorder(root.right);
			System.out.println(root.data+" ");
		}
		public static void Inorder(Node root){
			if(root==null){
				return;
			}
			Inorder(root.left);
			System.out.println(root.data+" ");
			Inorder(root.right);
		}
		public static void LevelOrder(Node root){
			if(root==null){
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty()){
				Node curr = q.remove();
				if(curr==null){
					System.out.println("");
					if(q.isEmpty()){
						break;
					}
					else{
						q.add(null);
					}
				}
				else{
				System.out.print(curr.data+" ");
				if(curr.left!=null)
				q.add(curr.left);
				if(curr.right!=null)
				q.add(curr.right);
				}
			}
		}
		public static int HeightFind(Node root){
			if(root==null){
				return 0;
			}
			int lh = HeightFind(root.left);
			int rh = HeightFind(root.right);
			return Math.max(lh,rh)+1;
		}
		public static int NodeFind(Node root){
			if(root==null){
				return 0;
			}
			int rc = NodeFind(root.right);
			int lc = NodeFind(root.left);
			return lc+rc+1;
		}
		public static int NodeSum(Node root){
			if(root==null){
				return 0;
			}
			int leftSum = NodeSum(root.left);
			int rightSum = NodeSum(root.right);
			return leftSum+rightSum+ root.data;
		}
		public static int Diameter(Node root){ //O(n^2)
			if(root==null){
				return 0;
			}
			int ld = Diameter(root.left);
			int lh = HeightFind(root.left);
			int rd = Diameter(root.right);
			int rh = HeightFind(root.right);
			int selfDiam = lh+rh+1;
			return Math.max(selfDiam,Math.max(ld,rd));
		}
		
		public static boolean isSubtree(Node root,Node subRoot){
			if(root==null){
				return false;
			}
			if(root.data == subRoot.data){
				if(isIdentical(root,subRoot)){
					return true;
				}
			}
			boolean leftAns = isSubtree(root.left,subRoot);
			boolean rightAns = isSubtree(root.right,subRoot);
			return leftAns || rightAns;
		}
		public static boolean isIdentical(Node node,Node subRoot){
			if(node==null && subRoot==null){
				return true;
			} else if (node==null||subRoot==null||node.data!=subRoot.data) {
				return false;
			}
			if(!isIdentical(node.right,subRoot.right)){
				return false;
			}
			if(!isIdentical(node.right,subRoot.right)){
				return false;
			}
			return true;
		}
	
	}
	static class Info{
		int diam,ht;
		
		public Info(int diam, int ht) {
			this.diam = diam;
			this.ht = ht;
		}
		
		
	}
	public static Info diameter(Node root){
		if(root==null){
			return new Info(0,0);
		}
		Info leftInfo = diameter(root.left);
		Info rightInfo = diameter(root.right);
		int diam = Math.max(leftInfo.ht+rightInfo.ht+1,Math.max(leftInfo.diam,rightInfo.diam));
		int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
		return new Info(diam,ht);
	}
	static class Infor {
		Node node;
		int hd;
		
		public Infor(Node node, int hd) {
			this.node = node;
			this.hd = hd;
		}
	}
	public static void topView(Node root){
		//Level order traversal
		Queue<Infor> q = new LinkedList<>();
		HashMap<Integer,Node> map = new HashMap<>();
		int min=0,max=0;
		q.add(new Infor(root,0));
		q.add(null);
		while (!q.isEmpty()){
			Infor curr=q.remove();
			if(curr==null){
				if(q.isEmpty()){
					break;
				}
				else {
					q.add(null);
				}
			}
			else{
				if(!map.containsKey(curr.hd)){ //first time my horizontal distance is occuring
					map.put(curr.hd,curr.node);
				}
				if(curr.node.left!=null){
					q.add(new Infor(curr.node.left,curr.hd-1));
					min = Math.min(min,curr.hd-1);
				}
				if(curr.node.right!=null){
					q.add(new Infor(curr.node.right,curr.hd+1));
					max = Math.max(max,curr.hd+1);
				}
			}
		}
		for (int i = min; i <=max; i++) {
			System.out.println(map.get(i).data+" ");
		}
		System.out.println();
	}
	
	//Finding elements at kth level
	public static void KthLevel(Node root,int level,int k){
		if(root==null){
			return;
		}
		if(k==level){
			System.out.print(root.data+" ");
			return;
		}
		KthLevel(root.left,level+1,k);
		KthLevel(root.right,level+1,k);
	}
//		public static boolean isIdentical(Node node, Node subRoot){
//			if(node==null && subRoot==null){
//				return true;
//			} else if (node==null||subRoot==null||node.data!=subRoot.data) {
//				return false;
//			}
//			if(!isIdentical(node.right,subRoot.right)){
//				return false;
//			}
//			if(!isIdentical(node.right,subRoot.right)){
//				return false;
//			}
//			return true;
//		}
	public static boolean getPath(Node root,int n,ArrayList<Node> path){
		if(root==null){
			return false;
		}
		path.add(root);
		if(root.data==n){
			return true;
		}
		boolean foundleft=getPath(root.left,n,path);
		boolean foundright=getPath(root.right,n,path);
		if(foundleft||foundright){
			return true;
		}
		path.remove(path.size()-1);
		return false;
	}
	public static Node lca(Node root,int n1,int n2){
		ArrayList<Node> path1 = new ArrayList<>();
		ArrayList<Node> path2 = new ArrayList<>();
		getPath(root,n1,path1);
		getPath(root,n2,path2);
		int j=0;
		for (j = 0; j <path1.size() && j<path2.size() ; j++) {
			if(path1.get(j)!=path2.get(j)){
				break;
			}
		}
	Node lca = path1.get(j-1);
		return lca;
		
	}
	public static int lcaDist(Node root,int n){
		if(root==null){
			return -1;
		}
		if(root.data ==n){
			return 0;
		}
		int leftDist = lcaDist(root.left,n);
		int rightDist = lcaDist(root.right,n);
		if(leftDist==-1 && rightDist==-1){
			return -1;
		}
		else if(leftDist==-1){
			return rightDist+1;
		}
		else{
			return leftDist+1;
		}
	}
	
	public static int FindDistance(Node root,int n1,int n2){
		Node lca = lca(root,n1,n2);
		int dist1 = lcaDist(lca,n1);
		int dist2 = lcaDist(lca,n2);
		return dist1+dist2;
	}
	public static void main(String[] args) {
//		System.out.println("Let us start learning Tree data structure");
//		int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,- 1};
		BinaryTree tree = new BinaryTree();
//		Node root = tree.buildTree(nodes);
//		System.out.println(root.data);
////		tree.Postorder(root);
//		tree.Inorder(root);
//		System.out.println();
//		tree.LevelOrder(root);
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
//		System.out.println(tree.HeightFind(root));
//		System.out.println(tree.NodeFind(root));
		System.out.println(BinaryTree.NodeSum(root));
		
		//Find Diameter of a tree
//		System.out.println(tree.Diameter(root));
//		Info inf = diameter(root);
//		System.out.println(inf.diam);
//		System.out.println(inf.ht);
//		//As given tree is already given let us find it contains a subtree that is 2 as root node and 4 as left child and 5 as right child
//
//		Node subroot = new Node(2);
//		subroot.left = new Node(4);
//		subroot.right = new Node(7);
//		System.out.println(tree.isSubtree(root,subroot));
//		topView(root);
		
		//let us print the kth level elements of a given tree
//		KthLevel(root,1,1);
//		KthLevel(root,0,2);
//		KthLevel(root,0,3);
		
		//Find the Lowest common ancestor of tree
//		int n1 = 4, n2  = 5;
		int n1 = 4, n2  = 6;
//		System.out.println(lca(root,n1,n2).data);
		
		
		//Find minimum distance between two nodes;
//		System.out.println(FindDistance(root,4,7));
	}
}
