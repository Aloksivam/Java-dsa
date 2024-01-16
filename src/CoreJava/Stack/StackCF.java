package CoreJava.Stack;
import java.util.Arrays;
import java.util.Stack;
public class StackCF {
	public static void pushAtBottom(Stack<Integer> s,int data){
		if(s.isEmpty()){
			s.push(data);
			return;
		}
		int top = s.pop();
		pushAtBottom(s,data);
		s.push(top);
	}
	public static void Rev(Stack<Integer> s){
		if(s.isEmpty()){
			return;
		}
		int top = s.pop();
		Rev(s);
		pushAtBottom(s,top);
	}
	
	public static String reverseString(String str){
		Stack<Character> s = new Stack<>();
		int idx = 0;
		while(idx<str.length()){
			s.push(str.charAt(idx));
			idx++;
		}
		StringBuilder st = new StringBuilder("");
		while(!s.isEmpty()){
			char curr = s.pop();
			st.append(curr);
		}
		return st.toString();
		
	}
	public static void Display(Stack<Integer> s){
		
		while (!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
		public static void stockSpan(int[] stocks,int[] span) {
			Stack<Integer> st = new Stack<>();
			span[0] = 1;
			st.push(0);
			for (int i = 1; i < stocks.length; i++) {
				while(stocks[st.peek()]<stocks[i]&&(!st.isEmpty())){
					st.pop();
			}  if(!st.isEmpty())
				span[i] = i-st.peek();
				else span[i] = i+1;
				st.push(i);
				
	}
		
		}
		public static void Nextgt(int[] arr,int[] ngt){
			Stack<Integer> s = new Stack<>();
			for (int i = arr.length-1; i >=0 ; i--) {
				while(!s.isEmpty()&&arr[i]>=arr[s.peek()])
				{
					s.pop();
				}
				if(s.isEmpty()){
					ngt[i] = -1;
				}
				else{
				ngt[i] = arr[s.peek()];}
				s.push(i);
			}
		}
		public static boolean isValidParenthesis(String s){
			Stack<Character> sch = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				//opening condition
				if(ch=='('|| ch=='{'||ch=='['){
					sch.push(ch);
				}
				else{
					if(sch.isEmpty()){
						return false;
					}
					if((ch==')' && sch.peek()=='(')||(ch==']' && sch.peek()=='[')||(ch=='}' && sch.peek()=='{')){
						sch.pop();
					}
					else{
						return false;
					}
				}
			}
			if(!sch.isEmpty()){
				return false;
			}
			else
			return true;
		}
		public static boolean isDuplicate(String str){
		Stack<Character> s = new Stack<>();
			for (int i = 0; i < str.length(); i++) {
				char chr = str.charAt(i);
				if(chr==')'){
					int count = 0;
					while(s.peek()!='('){
						s.pop();
						count++;
					}
					if(count<1){
						return true;
					}
					else{
						s.pop();
					}
				}
				else{
					//opening pair
					s.push(chr);
				}
			}
			return false;
	}
	public static void maxArea(int[] arr){
		//next smaller left and right calculatae kro
		int maxArea = 0;
		int nsr[] = new int[arr.length];
		int nsl[] = new int[arr.length];
		Stack<Integer> s = new Stack<>();
		for (int i = arr.length-1; i>=0; i--) {
			while(!(s.isEmpty())&& arr[s.peek()]>=arr[i]){
				s.pop();
			}
			if(s.isEmpty()){
				nsr[i] = arr.length;
			}
			else{
				nsr[i] = s.peek();
			}
			s.push(i);
		}
		s = new Stack<>();
		for (int i = 0; i<arr.length; i++) {
			while(!(s.isEmpty())&& arr[s.peek()]>=arr[i]){
				s.pop();
			}
			if(s.isEmpty()){
				nsl[i] = -1;
			}
			else{
				nsl[i] = s.peek();
			}
			s.push(i);
		}
		//Let us calculate area by width*height where width = nsr[i]-nsl[j]-1;
		
		for (int i = 0; i < arr.length; i++) {
			int width = nsr[i]-nsl[i]-1;
			if(maxArea<(width*arr[i])){
				maxArea = width*arr[i];
			}
		}
		System.out.println("Maximum area is :"+maxArea);
	}
		public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		s.push(5);
////		Display(s);
//		Rev(s);
//		Display(s);
		
//		String name = "ALok";
//		System.out.println(reverseString(name));
		
		//For stocks span problem span is defied as maximum nr of consecutive days for which stock price was lesser or equal to today's price
//		int[] stocks = {100,80,60,70,60,85,100};
//		int[] span = new int[stocks.length];
//		stockSpan(stocks,span);
//		for (int i = 0; i < span.length; i++) {
//			System.out.println(span[i]+" ");
//		}
		
		//Next greater element problem
		int[] el = {6,8,0,1,3};
		int[] ngt = new int[el.length];
//		Stack<Integer> s = new Stack<>();
		Nextgt(el,ngt);
		System.out.println(Arrays.toString(ngt));
		String name = "Alok";
			System.out.println(name.charAt(0));
//			System.out.println(n);
			
			//Check whether it is valid string or not
			
			System.out.println(isValidParenthesis("({]"));
			System.out.println(isValidParenthesis("({})[]"));
			System.out.println(isValidParenthesis("({})"));
			
			//Check whether it contains duplicate parenthesis or not
			String str1 = "((a+b))";
			String str2 = "((a+b)-c)";
			String str3 = "((a+b)+((c)))";
			System.out.println(isDuplicate(str1));
			System.out.println(isDuplicate(str2));
			System.out.println(isDuplicate(str3));
			
			//Maximum area of the histogram
			
			int arr[] = {2,1,5,6,2,3};
			maxArea(arr);
	}
}
