import java.util.*;


class Employee
{
    String name,address;
    int age,salary;
    long phone;


    Employee(String N,int A,long PH,String Add,int Sal)
    {
        this.name=N;
        this.age=A;
        this.phone=PH;
        this.address=Add;
        this.salary=Sal;  
    }


    void printSalary();
    {
        System.out.println("SALARY: "+salary);
    }
}


class Officer extends Employee
{
    String specialization;
    Officer(String N,int A,long PH,String Add,int Sal,String spcl)
    {
        super(N,A,PH,Add,Sal);
        this.specialization=spcl;
    }


    System.out.println("OFFICER:\t");
    System.out.println("NAME:"+N);
    System.out.println("AGE:"+A);
    System.out.println("PHONE:"+PH);
    System.out.println("ADDRESS:"+Add);
    System.out.println("SALARY:"+Sal);
    System.out.println("SPECIALIZATION:"+specialization);
}


class Manager extends Employee
{
    String department;
    Manager(String N,int A,long PH,String Add,int Sal,String dept)
    {
        super(N,A,PH,Add,Sal);
        department=dept;
    }


    System.out.println("MANAGER\t");
    System.out.println("NAME:"+N);
    System.out.println("AGE:"+A);
    System.out.println("PHONE:"+PH);
    System.out.println("ADDRESS:"+Add);
    super.printSalary();
    System.out.println("DEPARTMENT:"+dept);
}


class EmployeeDemo
{
    public static void main(String args[])
    {
        String name,address,spcl,dept;
        int age,salary;
        long phone;


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter manager details: ");
        System.out.println("Enter manager name: ");
        name=sc.nextLine();
        System.out.println("Enter manager age: ");
        age=sc.nextLine();
        System.out.println("Enter manager phone: ");
        phone=sc.nextLine();
        System.out.println("Enter manager salary: ");
        salary=sc.nextLine();
        System.out.println("Enter manager address: ");
        address=sc.nextLine();
        System.out.println("Enter manager department: ");
        dept=sc.next();
       
        Manager obj2=new Manager(name,age,phone,address,salary,dept);


       
        System.out.println("Enter officer details: ");
        System.out.println("Enter officer name: ");
        name=sc.nextLine();
        System.out.println("Enter officer age: ");
        age=sc.nextLine();
        System.out.println("Enter officer phone: ");
        phone=sc.nextLine();
        System.out.println("Enter officer salary: ");
        salary=sc.nextLine();
        System.out.println("Enter officer address: ");
        address=sc.nextLine();
        System.out.println("Enter officer specialization: ");
        spcl=sc.next();


        Officer obj1=new Officer(name,age,phone,salary,address,spcl);



    }
}

