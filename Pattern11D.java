import java.util.Scanner;
/*for the patterns like
 *	   A
 *    ABC
 *   ABCDE
 *  ABCDEFG
 * ABCDEFGHI
 *  ABCDEFG
 *   ABCDE
 *    ABC
 *     A
 */

public class Pattern11D {
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		int num,i,k,stp,j,var=65;
		
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
					System.out.print((char)(var+j-1));
				
				System.out.print("\n");
			}
		}
	}

}