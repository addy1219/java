package test1;

public class String_Q // Q.6
{
	public static void main(String[] args)
	{
		System.out.println("Length of the String : "+args[0].length());
		char[] c2 = upperCase(args[0]);
		            pallin(c2);
	}
	public static char[] upperCase(String str)
	{
		char[] ch = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i++)
		{
			ch[i] = (char)(ch[i]-32);
			System.out.print(ch[i]);
		}
		return ch;
	}
	public static void pallin(char[] ch)
	{
		for(int i = 0 ; i < ch.length/2 ; i++)
		{
			if(ch[i] != ch[ch.length-1-i])
				return;
		}
		String str = new String(ch);
		System.out.println("Pallindrome string : "+str);
	}
}