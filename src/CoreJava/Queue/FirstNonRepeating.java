package CoreJava.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
	public static void FirstNonRepeatingChar(String str){
		int[] freq = new int[26];
		Queue<Character> q = new LinkedList<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			q.add(c);
			freq[c-'a']++;
			while(!q.isEmpty() && freq[q.peek()-'a']!=1){
				q.remove();
			}
			if(q.isEmpty())
				System.out.println(-1+" ");
			else{
				System.out.println(q.peek());
		}
		
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Let us find first non repeating character from a string");
		
	}
}
