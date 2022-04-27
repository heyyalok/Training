package test;
import java.util.Scanner;
public class Employee extends Admin
{
	Scanner scr = new Scanner (System.in);
	void getEmployeeData()
	{
		System.out.println("enter employee name");
		name = scr.nextLine();
		System.out.println("enter employee department name");
		department = scr.nextLine();
		System.out.println("enter employee age ");
		age = scr.nextInt();
		System.out.println("enter employee phone no");
		phone_no = scr.nextLong();
		System.out.println("enter employee collage name");
		collage_name = scr.nextLine();
	}
	void displayEmployeeData()
	{
		System.out.println("employee name is "+name);
		System.out.println("employee department is "+department);
		System.out.println("employee age is "+age);
		System.out.println("employee phone no is "+phone_no);
		System.out.println("employee college name is "+collage_name);
		
	}
}