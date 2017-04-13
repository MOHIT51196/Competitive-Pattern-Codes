import java.util.Scanner;
/*for the patterns like
 *     A
 *    ABA
 *   ABCAB
 *  ABCDABC
 * ABCDEABCD
 *  ABCDABC
 *   ABCAB
 *    ABA
 *     A
 */

public class Pattern12D {
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		int num,i,k,stp,stpj,j,var=65;
		
		System.out.print("\nEnter the iterations : > ");
		num=in.nextInt();
		
		if(num<1)
			System.out.println("[!] INVALID REQUEST");
		
		else{
			for(i=1;i<=2*num-1;i++)
			{
				if(i>num)
					stp=num-i%num;
				else
					stp=i;
				
				for(k=1;k<=num-stp;k++)
					System.out.print(" ");
				
				for(j=1;j<=2*stp-1;j++)
				{
					if(j>stp)
						stpj=j%stp;
					else
						stpj=j;
					
					System.out.print((char)(var+stpj-1));
				}
				
				System.out.print("\n");
			}
			
		}
	}
	
}