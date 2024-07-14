package Algorithms.Hashing;
import java.security.Key;
import java.util.*;

public class HashExample{
	static class HashMap<K,V>{
		private class Node{
			K key;
			V value;
			
			public Node(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}
		private int n; //total no of nodes added in my linkedlist
		private int N; // no of buckets
		private LinkedList<Node>[] buckets;//N= buckets.length
		
		public HashMap() {
			this.N = 4;
			this.buckets= new LinkedList[4];
			for (int i = 0; i < 4; i++) {
				this.buckets[i] = new LinkedList<>();
			}
		}
		private int hashFunction(K key ){
			int hc = key.hashCode();
			return Math.abs(hc)%buckets.length;
		}
		private int SearchInLL(K key,int bi){
			LinkedList<Node> ll = buckets[bi];
			int di = 0;
			for (int i = 0; i < ll.size(); i++) {
				Node node = ll.get(i);
				if(node.key==key){
					return di;
				}
				di++;
			}
			return -1;
		}
		private void rehash(){
			LinkedList<Node>[]  oldBuck= buckets;
			buckets = new LinkedList[N*2];
			N=2*N;
			for (int i = 0; i < buckets.length; i++) {
				buckets[i] = new LinkedList<>();
			}
			//nodes -> add in buckets
			for (int i = 0; i < oldBuck.length; i++) {
					LinkedList<Node> ll = oldBuck[i];
				for (int j = 0; j < ll.size(); j++) {
					Node node = ll.remove();
					put(node.key,node.value);
			}
				}
		}
		public void put(K key, V value){
			int bi = hashFunction(key);
			int di = SearchInLL(key,bi); //dataindex
			if(di!=-1){
				Node node = buckets[bi].get(di);
				node.value = value;
			}else {
				buckets[bi].add(new Node(key,value));
				n++;
			}
			double lambda = (double)n/N;
			if(lambda>2.0){
				rehash();
			}
			
		}
		public boolean containsKey(K key){
			int bi = hashFunction(key);
//			LinkedList<Node> ll = buckets[bi];
//			for (int i = 0; i < ll.size(); i++) {
//				Node node= ll.get(i);
//				if(node.key==key){
//					return true;
//				}
//			}
//			return false;
			int di = SearchInLL(key,bi);
			if(di==-1){
				return true;
			}
			
				return false;
			
		}
		public V remove(K key){
			int bi = hashFunction(key);
			int di = SearchInLL(key,bi); //dataindex
			if(di!=-1){
				Node node = buckets[bi].remove(di);
				n--;
				return node.value;
			}else {
				return null;
			}
		}
		public V get(K key){
			int bi = hashFunction(key);
			int di = SearchInLL(key,bi); //dataindex
			if(di!=-1){
				Node node = buckets[bi].get(di);
				return node.value;
			}else {
				return null;
			}
		}
		public ArrayList<K> keySet(){
			ArrayList<K> keys = new ArrayList<>();
			for (int i = 0; i < buckets.length; i++) {
				LinkedList<Node> ll = buckets[i];
				for (Node node:
					 ll) {keys.add(node.key);
					
				}
			}
			return keys;
		}
		public boolean isEmpty(){
			return n==0;
		}
	}
	public static void main(String[] args) {
		System.out.println("Let us understand the hashmap");
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India",100);
		hm.put("China",120);
		hm.put("Nepal",60);
		ArrayList<String > keys = hm.keySet();
		System.out.println(keys);
		for (String key:
			 keys) {
			System.out.println(hm.get(key));
		}
		
//		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
//		lhm.put("India",100);
//		lhm.put("China",120);
//		lhm.put("Nepal",60);
//		System.out.println(lhm);
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("India",100);
		tm.put("China",120);
		tm.put("Nepal",60);
		System.out.println(tm);
//		System.out.println('A');
	}
}
