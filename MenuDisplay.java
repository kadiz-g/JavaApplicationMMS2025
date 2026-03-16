import java.util.Scanner

public class MenuDisplay{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		
		String name = input.nextLine();
		System.out.printf("%s you are welcome",name);
		
		System.out.print("Enter type of food in small letters: ");
		System.out.print("rice or soup");
		String typeOfFood = input.nextLine();
		System.out.printf("%s is a great choice",typeOfFood);
		
		if(typeOfFood == rice){
		   for(String i = 0; 1 < 10; i++){
			System.out.printf("%s%n",rice[i]);
		   }
		}
		
		
		
		if else(typeOfFood == soup){
				for(String i = 0; 1 < 10; i++){
			System.out.printf("%d%n",soup[i]);
				}
		}
				
	}
	public static void typeOfFood(){
		String[] rice = {"jellof","fried","coconut","white"};
		String[] soup = {"egusi","afang","banga","okra"};
	}
}