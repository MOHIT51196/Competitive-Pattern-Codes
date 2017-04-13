import java.util.Scanner;
/*for the patterns like
 *    A
 * 	 AB
 *	ABC 
 * ABCD
 *  ABC
 *   AB
 *    A
 */


public class Pattern9 {

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
			
			for(int j=1;j<=stp;j++)
				System.out.print((char)(var+j-1));
			
			System.out.print("\n");
		}
	}
	
}