import java.util.Scanner;
/*for the patterns like
 *    D
 *   CD
 *  BCD
 * ABCD
 *  BCD
 *   CD
 *    D
 */


public class Pattern8 {

	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		int num,stp,var=65;
		
		System.out.print("\nEnter the iterations  : >");
		num=in.nextInt();
				
		for(int i=1;i<=2*num-1;i++)
		{
			
			if(i>num)
				stp=num-i%num;
			else 
				stp=i;
			
			for(int k=1;k<=num-stp;k++)
				System.out.print(" ");
			
			for(int j=stp;j>=1;j--)
					System.out.print((char)(var+num-j));
			
			System.out.print("\n");
		}
				
				
	}
}