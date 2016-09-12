
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
		String answer = (a*c)+n+"^2 + "+ ((a*d)+(b*c))+n +  " +"  +(b*d);
		return answer;
	}
	
	public static boolean isDivisibleBy (int a, int b){
		if (a<0){
			throw new IllegalArgumentException("n must be positive");
		}
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
			
			int answer = b;
			return answer;							
		}
		
		else {
			int answer = a;
			return answer;
		}
	}
	
	public static double round2 (double a){
		int answer = ((int)(a * 100));
		
		
		 if ((a * 100)-answer >= .5){
			 double roundup = ((int)(a*100)+1)/(double)100;
			 return roundup;		
		 }
		 
		 else {
			 double rounddown = (int)(a*100)/((double)100);
			 return rounddown;
		 }
	}
	
	public static double exponent(double a, int b){
		if (a<0){
			throw new IllegalArgumentException("n must be positive");
		}
		double answer = a;
		for (int i = 1; i < b; i++){
			answer *= a;	
		}
		
		return answer;
				
	}
	
		public static int factorial(int a){
		if (a<0){
			throw new IllegalArgumentException("n must be positive");
		}
		int answer = a;
		
		for (int i = a-1; i > 0 ; i--){
			answer = answer * i;	
		}
		
		return answer;
				
	}
	
	public static boolean isPrime (int a){
		
		if (a < 0){
			a = -a;
		}
		
		boolean prime = true;
		
		for (int i = 2; i < a; i++){
			if (Calculate.isDivisibleBy(a,i)== true){
				
				prime = false; 
				
			}
			
		}
		return prime;
				
	}
	
	public static int gcf (int a, int b){
		int smaller = Calculate.min(a , b);
		int bigger = (int) Calculate.max(a, b);
		
		while (bigger != smaller && bigger > 0){
			bigger = bigger - smaller;
		}
		
		if (bigger < 0){
			bigger = -bigger;
		}
		return bigger;
		
	}
	
	public static double sqrt (double a){
		if (a<0){
			throw new IllegalArgumentException("n must be positive");
		}
		double x = 1;
		
		while (x*x > (a+.1) || x*x < (a-.1))
		{
		while ( x * x < a){
			x = x + .01;
		}
		
		if (x*x > a){
			x = x - .01;
		}
		
		}
		
		x = Calculate.round2(x);
		return x;
		
	}
	
	public static String quadForm(int a, int b, int c){
		if (Calculate.discriminant(a,b,c) < 0){
			String roots = "no real roots";
			return roots; 
		}
		
		else if (Calculate.discriminant(a,b,c) == 0){
			 String roots = Calculate.round2(-b /(2*a)) + " ";
			 return roots;
		}
		
		else {
			double root1 =  Calculate.round2((-b + Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
			double root2 =  Calculate.round2((-b - Calculate.sqrt(Calculate.discriminant(a, b, c)))/(2*a));
			if (root1 > root2){
				String roots = root2 + " and " + root1;
				return roots;
			}
			else {
				String roots = root1 + " and " + root2;
				return roots;
			}
			
			}
		
		
	}
	
	
}



