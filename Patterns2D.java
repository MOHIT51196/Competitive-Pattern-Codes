import java.util.Scanner;

/*for a pattern like
 *    A        A	
 *	 BAB      BAB	
 *	CBABC    CBABC	
 * DCBABCD  DCBABCD	
 *EDCBABCDEEDCBABCDE 
 */


public class Patterns2D {

	private static Scanner in=new Scanner(System.in);
	public static void main(String arg[])
	{
		
		System.out.print("\nEnter the iterations (VERTICAL) to print : > ");
		int numv=in.nextInt();
		
		System.out.print("\n\nEnter the iterations(HORIZONTAL) to print : > ");
		int numh=in.nextInt();
		
		int show;
		
		for (int iv=numv;iv>=1;iv--)
		{
			for(int ih=numh;ih>=1;ih--)
			{
			show=65;
			for(int kv=1;kv<=iv-1;kv++)
				System.out.print(" ");
			
			for(int j=numv;j>=iv;j--)
				System.out.print((char)(show+j-iv));
			
			
			for(int l=1;l<=numv-iv;l++)
				System.out.print((char)(show+l));
			
			
			for(int kh=1;kh<=(iv-1);kh++)
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		
	}

}

