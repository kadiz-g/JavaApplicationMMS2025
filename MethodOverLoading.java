public class MethodOverLoading{
	public static void main(String[] args{
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. calculate area of a square");
		System.out.println("2. calculate area of a rectangle");
		System.out.println("3. calculate area of a triangle");
		
		
		System.out.print("Enter your choice ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			System.out.print("enter the length of the square");
			int squareLength = input.nextInt();
			Method.OverLoading.area(squareLength);
			break;
			
			case 2:
			System.out.print("enter the length of the rectangle ");
			int rectangleLength = input.nextInt();
			
			System.out.print("enter the breath of the rectangle ");
			int breadthLength = input.nextInt();
			
			MethodOverLoading.area(rectangleLength,breadthLength);
			break;
			
			case 3;
			
			 
			
		
	}
	
	public static void area(int length){
		int areaOfSquare = (int) Math.pow(length,2);
		System.out.printf("the area of the square is %d",areaOfSquare);
		
	}
	
	public static void area(int length,int breadth){
		int areaOfRectangle = length * breath;
		System.out.printf("the area of the rectangle is %d",areaOfRectangle);
		
		
	}
	
	public static void area(int length,double base){
		double areaOfTriangle = 0.5 * length * base;
		System.out.printf("the area of the triangle is %.2f",areaOfTriangle);
	}
	
	

}