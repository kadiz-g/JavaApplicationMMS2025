import java.time.LocalDate;
import java.time.LocalTime;

public class WorkingWithDateAndTime{
	public static void main(String[] args){
		
		LocalDate currentDate = LocalDate.now();
		LocalDate myDate = LocalDate.of(2014,5,17);
		LocalDate resumptionDate = LocalDate.parse("2026-5-16");
		
		if (myDate.equals(currentDate)){
			System.out.printf("today is your appointment day");
		}
		else{
			System.out.printf("today is not your appointment day");
		}
		
		System.out.println("working with date");
		System.out.printf("the today's date is %s%n",currentDate);
		System.out.printf("the wedding is %s%n",myDate);
		System.out.printf("the resumption date is %s%n",resumptionDate);
		System.out.printf("the Year is %s%n",currentDate.getYear());
		System.out.printf("the Month is %s%n",currentDate.getMonth());
		System.out.printf("the day is %s%n",currentDate.getDayOfMonth());
		System.out.printf("my exams will be on the %s%n",currentDate.plusDays(7));
		System.out.printf("my exams will be on the %s%n",currentDate.plusYears(2));
		
		
		
		System.out.println("working with time");
		LocalTime currentTime = LocalTime.now();
		LocalTime myTime = LocalTime.of(2,3,12);
		LocalTime resumptionTime = LocalTime.parse("3:55:17");
		
		
		
		System.out.printf("The time is %s%n",currentTime);
		System.out.printf("The wedding is %s%n",myTime);
		System.out.printf("The resumption Time is %s%n",resumptionTime);
		System.out.printf("The hour is %s%n",currentTime.getHour());
		System.out.printf("The minute is %s%n",currentTime.getMinute());
		System.out.printf("The seconds is %s%n",currentTime.getSecond());
		System.out.printf("my exams will be on the %s%n",currentTime.plusHours(2));
		System.out.printf("my exams will be on the %s%n",currentTime.plusMinutes(60));
	}
}