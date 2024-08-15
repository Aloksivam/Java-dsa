package Algorithms.Tries;

public class TrieIntro {
	static class Node{
		Node children[] = new Node[26];
		boolean eow = false;
		Node(){
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
		}
	}
	public static Node root = new Node();
	public static void insert(String word){
		Node curr = root;
		for (int level = 0; level < word.length(); level++) {
			int idx = word.charAt(level)-'a';
			if(curr.children[idx]==null){
				
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Let us start learning trie data structue which is k-ary search tree");
	}
}
