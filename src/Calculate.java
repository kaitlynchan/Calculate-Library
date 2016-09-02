
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
	
	public static String foil (int a, int b, int c, int d, String n){
		String answer = (a*c)+"n^2 + "+ ((a*d)+(b*c))+"n + "+(b*d);
		return answer;
	}
	
	public static boolean isDivisibleBy (int a, int b){
		if (a % b == 0){
			boolean answer = true;
			return answer;
		}
		
		else {
			boolean answer = false;
			return answer;
		}
		
		
	}
	
	public static double absValue (double a){
		if (a < 0){
			double answer = -a;
			return answer;
		}
		
		else {
			double answer = a;
			return answer;
		}
	}
	
	public static double max (int a, int b){
		if (a > b){
			double answer = a;
			return answer;
		}
		
		else {
			double answer = b;
			return answer;
		}
	}
	
	public static double max (int a, int b, int c){
		
		if (a > b && a > c){
			
			double answer = a;
			return answer;							
		}
		
		if (b > a && b > c){
					
					
			double answer = b;
			return answer;						
		}
		
		else {
			double answer = c;
			return answer;
		}
	}
	
	public static int min (int a, int b){
		
		if (a > b){
			
			int answer = a;
			return answer;							
		}
		
		else {
			int answer = b;
			return answer;
		}
	}
	
	public static double round2 (double a){
		double answer = ((a * 100) + (.5))/100;
		return answer;
	}
	

}
