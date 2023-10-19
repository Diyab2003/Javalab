 /* 
 *File         : EmployeeDetail
 * Description : To get the Employee Details
 * Author      : Diya Benny
 * Version     : 1.0
 * Date        : 10/10/2023
 */

import java.util.Scanner;
public class EmployeeDetail {
	public static void main(String[] args) {
		Officer officer=new Officer();
		Manager manager=new Manager();
		officer.getdetails();
		officer.getspecialization();
		System.out.println();
	    System.out.println("Details of the officer:");
	    officer.printdetails();
		officer.printSalary();
		officer.printspecialization();
		//manager
		System.out.println();
		manager.getdetails();
		manager.getdepartment();
		System.out.println();
		System.out.println("Details of the manager:");
		manager.printdetails();
		officer.printSalary();
	    manager.printdepartment();
		}
	}
class Employee{
   Scanner sc=new Scanner(System.in);
   int salary,age;
   String name,address;
   long phone;
	public void getdetails() {
		System.out.println("enter the following details:");
		System.out.print("name:");
		name =sc.nextLine();
		System.out.print("age:");
		age=sc.nextInt();
		System.out.print("phone number:");
		phone=sc.nextLong();
		System.out.print("salary:");
		salary=sc.nextInt();
		sc.nextLine();
		System.out.print("address:");
	    address=sc.nextLine();	
	}
	public void printSalary() {
		System.out.println("salary:"+salary);
		}
	public void printdetails() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("phone number:"+phone);
		System.out.println("address:"+address);
	}
}
class Officer extends Employee{
	String specialize;
	public void getspecialization() {
		System.out.println("enter your specialisation:");
		specialize=sc.nextLine();
	}
	public void printspecialization() {
		System.out.println("specialisation:"+specialize);
		}
}
class Manager extends Employee{
	String department;
	public void getdepartment() {
		System.out.println("enter your department:");
		department=sc.next();
	}
	public void printdepartment() {
		System.out.println("department:"+department);
	}
}