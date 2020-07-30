package test1;

public class Employee_Main //Q.5
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(1,"Ram   ",new Date(03,01,2019));
		System.out.println("Number : "+e1.getNumber()+" Name : "+e1.getName()
		+" Date : "+e1.getDate());
		
		Employee e2 = new Employee(2,"Mahesh",new Date(07,02,2019));
		System.out.println("Number : "+e2.getNumber()+" Name : "+e2.getName()
		+" Date : "+e2.getDate());
		
		Employee e3 = new Employee(3,"Ramesh",new Date(13,07,2019));
		System.out.println("Number : "+e3.getNumber()+" Name : "+e3.getName()
		+" Date : "+e3.getDate());
		
		Employee e4 = new Employee(4,"Simba ",new Date(15,10,2019));
		System.out.println("Number : "+e4.getNumber()+" Name : "+e4.getName()
		+" Date : "+e4.getDate());
		
		Employee e5 = new Employee(5,"Shyam ",new Date(20,12,2019));
		System.out.println("Number : "+e5.getNumber()+" Name : "+e5.getName()
		+" Date : "+e5.getDate());
	}
}