/*Kaitlyn Chan
 * Math Library Program (Methods)
 * Does a bunch of cool math stuff :)
 * @9/18/16
 * 1st Period
 */
public class Calculate {
	
	public static int square (int number){
		//returns the square of the number passed
		int answer = number*number;
		return answer;
	}
	
	public static int cube (int number){
		//returns the square of the number passed
		int answer = number*number*number;
		return answer;
	}
	
	public static double average (double number1, double number2){
		//returns the average of two numbers passed to it
		double answer = (number1+number2)/2;
		return answer;
	}
	
	public static double average (double number1, double number2, double number3){
		//returns the average of three numbers passed to it and overloads the previous method
		double answer = (number1+number2+number3)/3;
		return answer;
	}
	
	public static double toDegrees (double radians){
		//converts angle measurement from radians to degrees
		double answer = (180*radians/3.14159);
		return answer;
	}
	
	public static double toRadians (double degrees){
		//converts angle measurement from degrees to radians
		double answer = (3.14159*degrees/180);
		return answer;
	}
	
	public static double discriminant (double a, double b, double c){
		//takes the coefficients of a quadratic equation in standard form and returns the discriminant
		double answer = (b*b-(4*a*c));
		return answer;
	}
	
	public static String toImproperFrac (int whole, int num, int denom){
		//takes the three numbers of a mixed number and changes it to an improper fraction
		if (denom==0){
			throw new IllegalArgumentException("can't divide by 0");
		}
		String answer = (whole*denom+num + "/" + denom);
		return answer;
	}
	
	public static String toMixedNum (int num, int denom){
		//takes the two numbers of an improper fraction and changes it to a mixed number
		if (denom==0){
			throw new IllegalArgumentException("can't divide by 0");
		}
		int wholeNumber = num/denom;
		int frac = denom%num;
		String answer = (wholeNumber+" " + frac + "/" + denom);
		return answer;
	}
	
	public static String foil (int a, int b, int c, int d, String n){
		//converts a binomial multiplication (ax+b)(cx+d) into a quadratic equation
		String answer = (a*c)+n+"^2 + "+ ((a*d)+(b*c))+n +  " +"  +(b*d);
		return answer;
	}
	
	public static boolean isDivisibleBy (int dividend, int divisor){
		//determines whether the first number is divisible by the second number
		if (divisor==0){
			throw new IllegalArgumentException("can't divide by 0");
		}
		if (dividend % divisor == 0){
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public static double absValue (double value){
		//returns the absolute value of the value passed
		if (value < 0){
			double answer = -value;
			return answer;
		}
		
		else {
			double answer = value;
			return answer;
		}
	}
	
	public static int max (int num1, int num2){
		//returns the larger of the two numbers
		if(num1==num2){
			throw new IllegalArgumentException("can't be same number");
		}
		
		if (num1 > num2){
			int answer = num1;
			return answer;
		}
		
		else {
			int answer = num2;
			return answer;
		}
	}
	
	public static double max (double num1, double num2, double num3){
		//overloads previous method and returns the largest of three numbers
		if(num1==num2 && num2==num3){
			throw new IllegalArgumentException("can't be same number");
		}
		if (num1 > num2 && num1 > num3){
			
			double answer = num1;
			return answer;							
		}
		
		if (num2 > num1 && num2 > num3){
					
					
			double answer = num2;
			return answer;						
		}
		
		else {
			double answer = num3;
			return answer;
		}
	}
	
	public static int min (int num1, int num2){
		//returns the smaller of two numbers passed
		if(num1==num2){
			throw new IllegalArgumentException("can't be same number");
		}
		if (num1 > num2){
			
			int answer = num2;
			return answer;							
		}
		
		else {
			int answer = num1;
			return answer;
		}
	}
	
	public static double round2 (double number){
		//rounds a double to 2 decimal places
		int firststep = ((int)(number * 100));
		
		
		 if ((number * 100)-firststep >= .5){
			 double roundup = ((int)(number*100)+1)/(double)100;
			 return roundup;		
		 }
		 
		 else {
			 double rounddown = (int)(number*100)/((double)100);
			 return rounddown;
		 }
	}
	
	public static double exponent(double base, int exponent){
		//raises a value to a positive integer value
		if (exponent<0){
			throw new IllegalArgumentException("exponent must be positive");
		}
		if (exponent==0){
			return 1;
		}
		double answer = base;
		for (int i = 1; i < exponent; i++){
			answer *= base;	
		}
		
		return answer;				
	}
	
		public static int factorial(int num){
		// returns the factorial of the number passed
		if (num<0){
			throw new IllegalArgumentException("number must be positive");
		}
		int answer = num;
		if (num==0){
			answer = 1;
		}
		
		
		for (int i = num-1; i > 0 ; i--){
			answer = answer * i;	
		}
		
		return answer;
				
	}
	
	public static boolean isPrime (int num){
		//determines whether or not an integer is prime (calls on a previous method)
		
		if (num < 2){
			throw new IllegalArgumentException("n must 2 or greater");
		}
		
		boolean prime = true;
		
		for (int i = 2; i < num; i++){
			if (Calculate.isDivisibleBy(num,i)== true){
				
				prime = false; 
				
			}
			
		}
		return prime;
				
	}
	
	public static int gcf (int num1, int num2){
		//finds the greatest common factor of two integers
		if (num1 < 1 || num2 < 1){
			throw new IllegalArgumentException("numbers must be greater than 1");
		}
		int smaller = Calculate.min(num1 , num2);
		int bigger = (int) Calculate.max(num1, num2);
		
		while (bigger != smaller && bigger > 0){
			bigger = bigger - smaller;
		}
		
		if (bigger < 0){
			bigger = -bigger;
		}
		return bigger;
		
	}
	
	public static double sqrt (double num){
		//returns the square root of the value passed
		if (num<0){
			throw new IllegalArgumentException("n must be positive");
		}
		double root = 0;
		
		while (root*root > (num+.01) || root*root < (num-.01))
		{
		while ( root * root < num){
			root = root + .001;
		}
		
		if (root*root > num){
			root = root - .001;
		}
		
		}
		
		root = Calculate.round2(root);
		return root;
		
	}
	
	public static String quadForm(int a, int b, int c){
		// uses the quadratic formula the approximate the real roots
		if (Calculate.discriminant(a,b,c) < 0){
			throw new IllegalArgumentException("no real roots");

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