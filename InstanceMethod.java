public class InstanceMethod{
	public static void main(String[] args){
		InstanceMethod im = new InstanceMethod();
		
		System.out.println(im.name("mercy ben") + "is saying");
		im.greeting();
	}
	
	public void greeting(){
		int i = 1;
	    while(i <= 10){
		    System.out.printf("%d good morning class%n",i);
		    i++;
		}
	}
	public String name(String fullName){
		return fullName;
	}
}