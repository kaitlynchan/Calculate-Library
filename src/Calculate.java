
public class Calculate {
	
	public static double square (double number){
		double answer = number*number;
		return answer;
	}
	
	public static double cube (double number){
		double answer = number*number*number;
		return answer;
	}
	
	public static double average (double number1, double number2){
		double answer = (number1+number2)/2;
		return answer;
	}
	
	public static double toDegrees (double radians){
		double answer = (180*radians/3.14159);
		return answer;
	}
	
	public static double toRadians (double degrees){
		double answer = (3.14159*degrees/180);
		return answer;
	}
	
	public static double discriminant (double a, double b, double c){
		double answer = (b*b-(4*a*c));
		return answer;
	}
	
	public static String toImproperFrac (int whole, int num, int denom){
		String answer = (whole*denom+num + "/" + denom);
		return answer;
	}
	
	public static String toMixedNum (int whole, int num, int denom){
		String answer = (whole*denom+num + "/" + denom);
		return answer;
	}
	
	

}
