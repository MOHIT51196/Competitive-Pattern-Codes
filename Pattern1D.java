import java.util.Scanner;

/*for a pattern like
 *    A 
 *	 BAB  
 *	CBABC 
 * DCBABCD  
 *EDCBABCDE
 */

//code uses different logic than in PatternsJava package

public class Pattern1D {

	private static Scanner in=new Scanner(System.in);
	
	public static void main(String arg[])
	{
		
		System.out.print("\nEnter the iterations to print : > ");
		int num=in.nextInt();
		
		
		int show=65;		//or 97 for small alphabets
		
		for (int i=num;i>=1;i--)
		{
			
			for(int k=1;k<=i-1;k++)
				System.out.print(" ");
			
			for(int j=num;j>=i;j--)
				System.out.print((char)(show+j-i));
			
			
			for(int l=1;l<=num-i;l++)
				System.out.print((char)(show+l));
			
			System.out.print("\n");
		}
		
		
	}

}
