package test;
import java.util.Scanner;
public class Main 
{
public static void main(String [] args)
{
int choice;
char options;
	Scanner scr = new Scanner (System.in);
	Students students = new Students ();
	Employee employee = new Employee();
	Admin admin = new Admin();
	System.out.println("-----------------------------------");
	System.out.println("welcome to school management system");
	System.out.println("-----------------------------------");
	System.out.println("enter your details");
	admin.getAdminData();
	System.out.println("enter student details");
	students.getStudentsData();
	System.out.println("enetr employee details");
	employee.getEmployeeData();
	System.out.println("");
	do {
	System.out.println("choose what details you want to get from application");
	System.out.println("press 1 for admin infromation");
	System.out.println("press 2 for student infromation");
	System.out.println("press 3 for employee infromation");
	choice = scr.nextInt();
	switch (choice) 
	{
	case 1 :
		System.out.println("admin information ");
		admin.displayAdminData();
		break;
	case 2 :
		System.out.println("student information");
		students.displayStudentsData();
		break;
	case 3 :
		System.out.println("employee information");
		employee.displayEmployeeData();
		break;
		default :
			System.out.println("there is some error in input your choices");
	}
	System.out.println("do you want to print another data y/n");
	options = scr.next().toLowerCase().charAt(0);
	}
	while(options == 'y');
	
}
}