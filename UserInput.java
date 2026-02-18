import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		//creating an object of the scanner class
		Scanner scan = new Scanner(System.in);
		
		System.out.print("please enter your full name: ");
		String fullName = scan.nextLine();
		
		System.out.print("enter your address: ");
		String address = scan.nextLine();
		
		System.out.print("enter your age: ");
		int age = scan.nextInt();
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.printf("hello %s , How are you doing today",fullName);
		System.out.printf("nice meeting you, your living in %s",address);
		System.out.printf("%s, you are %d years old",fullName,age);
	}
}