package test1;

public class Date //Q.5
{
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay()
	{
		return day;
	}
	public void setDay(int day) 
	{
		this.day = day;
	}
	public int getMonth() 
	{
		return month;
	}
	public int getYear() 
	{
		return year;
	}
	@Override
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
}