package test1;

public class Employee //Q.5
{
	int number;
	String name;
	Date date;
	public Employee(int number, String name, Date date) 
	{
		this.number = number;
		this.name = name;
		this.date = date;
	}
	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number) 
	{
		this.number = number;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Date getDate() 
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}
	@Override
	public String toString()
	{
		return number+"\t"+name+"\t";
	}
}