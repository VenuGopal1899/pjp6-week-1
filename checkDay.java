import java.util.Scanner;

class Test{
	Day day;
	public Test(Day day){
		this.day = day;
	}

	public void dayIsLike(){
		switch(day){
			case MONDAY:
				System.out.println("Mondays are bad.");
				break;
			case FRIDAY:
				System.out.println("Fridays are better.");
				break;
			case SATURDAY:
// 				Below 2 lines have been added on remote repository as part of Question 1.viii
				System.out.println("Guess you got time to catch your breath.");
				break;
			case SUNDAY:
				System.out.println("Weekends are best.");
				break;
			default:
				System.out.println("Midweek days are so so.");
				break;
		}
	}	
}

enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	THURSDAY, FRIDAY, SATURDAY;
}

public class checkDay{
	public static void main(String[] args){
		String str = "MONDAY";
		Test t1 = new Test(Day.valueOf(str));
		t1.dayIsLike();
	}
}
