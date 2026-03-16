public class LocalVariable{
	public static void main(String[] args){
		double price = 23.65;
		int quantity = 12;
		String productName = "laptop";
		
		double total = price * quantity;
		
		System.out.printf("the total amount of the %s is %.2f",productName,total);
	}

}