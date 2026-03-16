import java.util.Scanner;


public class two_Array{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int[] marks = new int[10];
		int counter = 1;
		
		for(int i = 0; i < 10; i++){
			System.out.printf("enter the %d element : ",counter);
			
			marks[i] = scan.nextInt();
			
			counter++;
		}
			
		for(int k = 0; k < 10; k++){
			System.out.printf("%d ",marks[k]);
		}
			
			
	}
}	