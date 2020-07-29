package test1;

public class Term //Q.10
{
	private int coefficient;
	private int exponent;
	public Term(int coefficient, int exponent) 
	{
		this.coefficient = coefficient;
		this.exponent = exponent;
	}
	public int getCoefficient() 
	{
		return coefficient;
	}
	public void setCoefficient(int coefficient) 
	{
		this.coefficient = coefficient;
	}
	public int getExponent() 
	{
		return exponent;
	}
	public void setExponent(int exponent) 
	{
		this.exponent = exponent;
	}
	@Override
	public String toString()
	{
		return coefficient+"-->"+exponent;
	}
}