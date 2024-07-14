package CoreJava.Conversions;

public class DecimalToBinary {
	static int BinaryToDecimal(int BinNr){
		int res=0,i=0;
		while(BinNr>0){
//		int temp = BinNr %10;
		int temp = BinNr&1;
		res+=(temp*Math.pow(2,i));
		i++;
//		BinNr=BinNr/10;
		BinNr=BinNr >> 1;
		}
		return res;
	}
	static int decToBin(int n){
		int pow=0;
		int binNum=0;
		int rem=0;
		while(n!=0){
			rem = n%2;
			binNum = binNum+rem*(int)Math.pow(10,pow);
			pow++;
			n=n/2;
		}
		return binNum;
	}
	static void MissMethods(int nr){
		Math.min( 12,13);
		 Math.max(13,67);
		 Math.sqrt( 23);
		 Math.pow( 3,7);
//		 Math.avg( );
		
//				Math.abs(
	}
	public static void main(String[] args) {
		System.out.println("I am trying to convert from decimal to binary");
		System.out.println(6&1);
		System.out.println((5>>1));
//		System.out.println(BinaryToDecimal(1));
//		System.out.println(BinaryToDecimal(101));
//		System.out.println(BinaryToDecimal(10101));
		System.out.println(decToBin(12));
		System.out.println(decToBin(13));
		System.out.println(decToBin(14));
		System.out.println(decToBin(15));
	}
}
