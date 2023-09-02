import java.util.*;
class Employee
{
	String name,address;
	int age,salary;
	long phone;
	Employee(String name,int age,long phone,String address,int salary)
	{
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
	}

	void printsalary()
	{
		System.out.println("SALARY:"+salary);
	}
}


class Officer extends Employee
{
	String specialization;
	Officer(String name,int age,long phone,String address,int salary,String specialization)
	{
		super(name,age,phone,address,salary);
		this.specialization=specialization;
	}
	void displayOfficer()
	{
	System.out.println("");	
	System.out.println("OFFICER\t");	
	System.out.println("NAME:" +super.name);	
	System.out.println("AGE:" +super.age);	
	System.out.println("PHONE NUMBER:" +super.phone);
	System.out.println("ADDRESS:" +super.address);
	super.printsalary();
	System.out.println("SPECIALIZATION:" +specialization);
	}
}

class Manager extends Employee
{
	String department;
	Manager(String name,int age,long phone,String address,int salary,String department)
	{
		super(name,age,phone,address,salary);
		this.department=department;
	}
	void displayManager()
	{
	System.out.println("");	
	System.out.println("MANAGER\t");	
	System.out.println("NAME:" +super.name);	
	System.out.println("AGE:" +super.age);	
	System.out.println("PHONE NUMBER:" +super.phone);
	System.out.println("ADDRESS:" +super.address);
	super.printsalary();
	System.out.println("DEPARTMENT:" +department);
	}
}
			
class EmployeeDemo
{
	public static void main(String args[])
	{
		String name,address,specialization,department;
		int age,salary;
		long phone;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nENTER MANAGER DETAILS\n");
		System.out.println("Enter the name of manager:");	
		name=sc.nextLine();
		System.out.println("Enter the age of manager:");
		age=sc.nextInt();	
		System.out.println("Enter the phone of manager:");
		phone=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the salary of manager:");
		salary=sc.nextInt();		
		System.out.println("Enter the address of manager:");
		sc.nextLine();
		address=sc.next();
		System.out.println("Enter the department of manager:");		
		department=sc.next();

		Manager obj2=new Manager(name,age,phone,address,salary,department);

		System.out.println("\nENTER OFFICER DETAILS\n");	
		System.out.println("Enter the name of officer:");
		name=sc.next();
		sc.nextLine();
		System.out.println("Enter the age of officer:");	
		age=sc.nextInt();
		System.out.println("Enter the phone of officer:");
		phone=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the address of officer:");
		address=sc.next();
		System.out.println("Enter the salary of officer:");
		salary=sc.nextInt();
		System.out.println("Enter the specialization of officer:");
		specialization=sc.next();

		Officer obj1=new Officer(name,age,phone,address,salary,specialization);

		obj1.displayOfficer();
		obj2.displayManager();
	}
}