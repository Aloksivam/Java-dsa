package Algorithms.Trees;

public class Pattern {
	public static void pattern(int i,int j){
		if(i==6){
			return;
		}
		System.out.print(j+" ");
		if(j==i && i!=6) {
			System.out.println();
			pattern(i + 1, 5);
		}
		else
		pattern(i,j-1);
	}
	public static void main(String[] args) {
		System.out.println("Let us draw some patterns");
//		for (int i = 1; i <=5 ; i++) {
//			for (int j = 5; j>=i; j--) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		pattern(1,5);
	}
}
