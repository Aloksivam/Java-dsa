package Algorithms.Dynamic_Programming;
class LCs_sol{
	static void Printn(int n){
		if(n==0)
			return;
		System.out.print(n+" ");
		Printn(n-1);
	}
}
public class LCS {
	public static void main(String[] args) {
//		LCs_sol obj = new LCs_sol();
//		obj.Printn(5);
		System.out.println(LCS("abcdef","acef"));
	}
	static int LCS(String text1,String text2){
		return Solve(text1,text2,0,0);
	}
	 
	 static int Solve(String text1, String text2, int i, int j) {
		if(i==text1.length())
			return 0;
		if(j==text2.length())
			return 0;
//		int ans = 0;
		if(text1.charAt(i)==text2.charAt(j)){
			return 1+ Solve(text1,text2,i+1,j+1);
		}
		else return Math.max((1+ Solve(text1,text2,i,j+1)),(1+ Solve(text1,text2,i,j+1)));
	}
	
}
