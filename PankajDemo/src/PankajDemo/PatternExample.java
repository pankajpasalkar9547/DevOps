package PankajDemo;

public class PatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i=1;i<=30;i++)
		{
			if(i%6 == 0)
			{
				System.out.print(' ');
			}
			else {
				 for (j=1;j<=30;j++)
				 {
					 if (j%6 == 0)
					 {
						 System.out.print(' ');
					 }
					 else
					 {
						 System.out.print('*');
					 }
				 }
			}
			System.out.println();
		}

	}

}
