public class Operatorpart2{
	public static void main(String[] args){
		int num1 = 70;
		int num2 = 50;
		int num3 = 120;
		
//logical operators ( &&(AND), ||(OR), !(NOT))

		boolean andResult = (num1 > num2) && (num1 != num3);
		
		System.out.printf("the AND result is %b%n",andResult);
		
		boolean orResult = (num1 > num2) || (num1 == num3);
		System.out.printf("the OR result is %b%n",orResult);
		
		boolean notResult = !((num1 > num2) || (num1 == num3));
		System.out.printf("the not result is %b%n",orResult);
		
		//unary operators(++,--)
		
		int x = 5;
		++x;
		++x;
		int y = ++x;
		
		System.out.printf("the value of x is " + x);
		System.out.printf("the value of y is " + y);
		
		x = 5;
		y = x++;
		
		System.out.printf("the value of x is " + x);
		System.out.printf("the value of y is " + y);

	}
}