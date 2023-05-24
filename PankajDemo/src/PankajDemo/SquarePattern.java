package PankajDemo;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,n=5;
		for (i=0;i<=n;i++)
		{
			for (j=0;j<=n;j++)
			{
				if ( i == 0 || j == 0 || i==n || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
