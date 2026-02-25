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
		scan.nextLine();
		
		System.out.print("Enter your gender(m/f: ");
		char gender = scan.next().charAt(0);
		System.out.printf("Are you happy to learn java?(true/false: ");
		boolean isHappy = scan.nextBoolean();
		
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.printf("hello %s , How are you doing today",fullName);
		System.out.printf("nice meeting you, your living in %s",address);
		System.out.printf("%s, you are %d years old",fullName,age);
		System.out.printf("you are a %c",gender);
		System.out.printf("are you happy to learn java? %b",isHappy);
	}
}