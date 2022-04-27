package test;
import java.util.Scanner;
public class Students extends Admin
{
	Scanner scr = new Scanner(System.in);
	void getStudentsData() 
	{
		System.out.println("enter student name");
		name = scr.nextLine();
		System.out.println("enter student department name");
		department = scr.nextLine();
		System.out.println("enter student age ");
		age = scr.nextInt();
		System.out.println("enter student passing year");
		passing_year = scr.nextInt();
		System.out.println("enter student phone no");
		phone_no = scr.nextLong();
		System.out.println("enter student collage name");
		collage_name = scr.nextLine();
	}
	void displayStudentsData()
	{
		System.out.println("student name is "+name);
		System.out.println("student department is "+department);
		System.out.println("student age is "+age);
		System.out.println("student passing year is "+passing_year);
		System.out.println("student phone no is "+phone_no);
		System.out.println("student college name is "+collage_name);
		
	}
}