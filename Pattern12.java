import java.util.Scanner;
/*for the patterns like
 * ABCDEABCD
 *  ABCDABC
 *   ABCAB
 *    ABA
 *     A
 */

public class Pattern12 {
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		int num,i,k,stp,j,var=65;
		
		System.out.print("\nEnter the iterations : > ");
		num=in.nextInt();
		
		if(num<1)
			System.out.println("[!] INVALID REQUEST");
		
		else{
			
			for(i=num;i>=1;i--)
			{
				for(k=1;k<=num-i;k++)
					System.out.print(" ");
				
				for(j=1;j<=2*i-1;j++)
				{
					if(j>num)
						stp=j%num;
					else
						stp=j;
					
					System.out.print((char)(var+stp-1));
				}
				
				System.out.print("\n");
			}
			
		
		}
		
	}
}