//Leap Year
import java.util.*;
class Leapyear{
	public static void main(String[] args){
	int year;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a year to cehck leap year or not.");
	year=sc.nextInt();
	if(year%400==0 || year%4==0 && year%100!=0)
		System.out.println("Leap Year!");
	else
		System.out.println("Non- Leap Year!");
	}
}