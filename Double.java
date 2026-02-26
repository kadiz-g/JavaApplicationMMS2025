import java.util.Scanner;



public class Double{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter your name: ");
		String name = scan.nextLine();
		
		System.out.print("enter your age: ");
		
		int age = scan.nextInt();
		
		if(age >= 18){
			System.out.printf("%s is %d, oh wow, you are now an adult",name,age);
			
			
		}
		else{
			System.out.printf("%s is %d, oh wow you are still a minor",name,age);
		}
	}
}