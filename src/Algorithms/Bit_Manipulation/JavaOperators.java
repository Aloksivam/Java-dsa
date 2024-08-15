package Algorithms.Bit_Manipulation;


public class JavaOperators {
	public static String baseConversion(String number, int sBase,int dbase){
		return Integer.toString(Integer.parseInt(number,sBase),dbase);
	}
	//And operator
	public static void main(String[] args) {
//		System.out.println(7&0); //and operator
//		System.out.println(7|0); //or operator
//		System.out.println(~7); //or operator
//		System.out.println(7^1); //xor operator
		System.out.println(baseConversion("33",10,2));
		
		//finding the ith bit of a number
//		we can do right shift at that many time and then do and with 1
//		let us take number as 33 its binary will be 100001
		System.out.println(baseConversion("110110",2,10));
		int n = 3,num=54;
//		int bit = (num>>n-1) & 1;
		int bit = num & (1 << (n-1));
		System.out.println(bit);
		
		//set the ith bit turn it to 1 if ith bit is 0 then make it 1 if ith bit is 1 then keep it 1;
//		int n =
	}
}
