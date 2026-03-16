 import java.unil.Scanner;
 
 
 public class SentinelLoop{
	 public static void main(String[] args){
		 Scanner input = new scanner(System.in);
		 int sum = 0;
		 
		 while(true){
			 System.out.print("enter any number (-1 ends the loop): ");
			 int num = input.nextInt();
			 
			 if(num == -1){
				 break;
			 }
			 sum += num;
		 }
		 System.out.printf("the sum of the numbers enter is %d",sum);
	 }
 }