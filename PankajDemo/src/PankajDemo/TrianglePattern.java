package PankajDemo;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k,n=3;
		int m=n*2+1;
		for (i =0;i>=n;i--)
		{
			for (j=0;j>=m;j--)
			{
				if (i==j || j == m+1 )
				{
					System.out.print('*');
				}
				else 
				{
					System.out.print(' ');	
				}
				
			}
			System.out.println();
			m++;
		}

	}

}
