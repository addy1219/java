package test1;

public class Poly_Main 
{
	public static void main(String[] args)
	{
		Polynomial p = new Polynomial();
		Term[] t = p.setTerm();
		           p.sort(t);
		           p.disp(t);
	}
}