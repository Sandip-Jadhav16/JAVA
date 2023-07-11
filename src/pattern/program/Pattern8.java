package pattern.program;

public class Pattern8 {

	public static void main(String[] args) 
	{
		int i,j,k,l;
/*		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
*/
		//Aother logic/Way...
		
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<(i*2);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/**********************************OUTPUT**************************/
/*

    *
   ***
  *****
 *******

*/
