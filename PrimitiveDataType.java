public class PrimitiveDataType{
    public static void main(String[] arg){
	   byte age = 30;
	   System.out.printf("i am %d years old%n", age);
	   
	   short quantityOfBags = 10000;
	   System.out.printf("the quantity of bags ordered is %d%n", quantityOfBags);
	   
	   int nigeriapopulation = 2000000000;
	   System.out.printf("the population of nigeria is %d%n", nigeriapopulation);
	   
	   long worldpopulation = 90000000000000L;
	   System.out.printf("the world population is %d%n", worldpopulation);
	   
	   
	   //float-point primitive data type
	   float mybalance = 6945.6000000577F;
	   System.out.printf("my account balance is %.2f%n ", mybalance);
	   
	   double cBNBalance = 9874456677656.904;
	   System.out.printf("CBN balance is %.2f%n", cBNBalance);
	   
	   //single character primitive datatype
	   char symbol = '$';
	   System.out.printf("CBN balance is %c%.2f%n", symbol,cBNBalance);
	   
	   
	   //boolean primitive data type
	   boolean isJavaFun = true;
	   System.out.printf("Do love learning java? %b", isJavaFun);
	}
}