
public class ComplexNumbers {
	public static boolean addOn2 (int var1, int var2, int currSum){
		int newSum = currSum + var1 + var2;
		return newSum % 2 == 0;
	}
	public static void main (String[]args){
		
		System.out.println(ComplexNumbers.addOn2(1,2,3));
	}
}
