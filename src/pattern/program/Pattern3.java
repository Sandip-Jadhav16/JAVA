package pattern.program;

public class Pattern3 {

	public static void main(String[] args) 
	{
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=1;i<=4;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

/******************************OUTPUT************************************/
/*

*
**
***
****
***
**
*

*/
