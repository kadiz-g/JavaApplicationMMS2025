public class Operators{
	public static void main(String[] args){
		//assignment operator (=)
		int num = 50;
		System.out.printf("the value of num is %d",num);
		
		//Arithmetic operators(+,-,*,/,%)
		int num1 = 100;
		int num2 = 500;
		
		int addition = num1 + num2;
		System.out.printf("the sum of %d and %d is %d%n",num1,num2,addition);
		
		int subtraction = num1 - num2;
		System.out.printf("the diff between %d and %d is %d%n",num1,num2,subtraction);
		
		int multiplication = num1 * num2;
		System.out.printf("the product of %d and %d is %d%n",num1,num2,multiplication);
		
		int quotient = num1/num2;
		System.out.printf("the quotient of %d/%d is %d%n",num1,num2,quotient);
		
		//typecasting the quotient
		double quotient1 = (double)num1/num2;
		System.out.printf("the quotient of %d / %d is %f%n",num1,num2,quotient1);
		
		int remainder = num1%num2;
		System.out.printf("the remainder between %d and %d is %d%n",num1,num2,remainder);
		
		//compound assignment operators
		num1 += num2;
		System.out.printf("the value of num1 is now %d%n",num1);
		
		num1 *= num2;
		System.out.printf("the value of num1 is now %d%n",num1);
		
		
		//relational operator (<,>,>=,<=,!=,==)
		int number1 = 20, number2 = 50;
		
		boolean isGreater = number1 > number2;
		System.out.printf("is %d > %d? %b%n",number1,number2,isGreater);
		
		
		
		boolean islessThan = number1 < number2;
		System.out.printf("is %d < %d? %b%n",number1,number2,islessThan);
		
		boolean isGreaterThanOrEqualTo = number1 >= number2;
		System.out.printf("is %d >= %d? %b%n",number1,number2,isGreaterThanOrEqualTo);
		
		
		
		boolean isNotEqualTo= number1 != number2;
		System.out.printf("is %d != %d? %b%n",number1,number2,isNotEqualTo);
		
		
		boolean equalTo = number1 == number2;
		System.out.printf("is %d == %d? %b%n",number1,number2,equalTo);
		
	}
}