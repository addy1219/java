package test1;

public class Matrix
{
	private int row;
	private int column;
	int A[][];
	int B[][];
	public Matrix()
	{
	}
	public Matrix(int row, int column)
	{
		this();
		this.row = row;
		this.column = column;
		this.A = new int[row][column];
		this.B = new int[row][column];
	}
	public void setElement(int r, int c, int value)
	{
		A[r][c] = value;
	}
	void display()
	{
		System.out.println("Original matrix:\n");
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < column ; j++)
				System.out.print(A[i][j]+" ");
			System.out.println("\n");
		}
		
		System.out.println("Transposed matrix:\n");
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < column ; j++)
				System.out.print(B[i][j]+" ");
			System.out.println("\n");
		}
	}
	void transpose()
	{
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < column ; j++)
				B[i][j] = A[j][i];
		}
	}
}