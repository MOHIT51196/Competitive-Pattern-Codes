import java.util.Scanner;
/*for the patterns like
 * ABCDEFGHI
 *  ABCDEFG
 *   ABCDE
 *    ABC
 *     A
 */

public class Pattern11 {
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		int num,i,k,j,var=65;
		
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
					System.out.print((char)(var+j-1));
				
				System.out.print("\n");
			}
		}
	}

}
