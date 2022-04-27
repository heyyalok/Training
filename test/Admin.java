package test;
import java.util.Scanner;
public class Admin 
{
	Scanner scr = new Scanner(System.in);
	String name;
	String department;
	int age;
	int passing_year;
	long phone_no;
	String collage_name;
	
	void getAdminData()
	{
		System.out.println("enter admin name");
		name = scr.nextLine();
		System.out.println("enter admin age ");
		age = scr.nextInt();
		System.out.println("enter admin phone no");
		phone_no = scr.nextLong();
	}
	void displayAdminData() 
	{
		System.out.println("your name is "+name);
		System.out.println("your age is "+age);
		System.out.println("your phone no is "+phone_no);
	}
}