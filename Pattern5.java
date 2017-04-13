import java.util.Scanner;

/*for the pattern 
 * A        A
 * AB      BA
 * ABC    CBA
 * ABCD  DCBA
 * ABCDEEDCBA
 */


public class Pattern5 {
	
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		int num,j,i,k,var=65;
		
		System.out.print("\nEnter the iteration : > ");
		num=in.nextInt();
		
		
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
				System.out.print((char)(var+j-1));
			
			j--;
			
			for(k=1;k<=2*(num-i);k++)
				System.out.print(" ");
			
			for(;j>=1;j--)
				System.out.print((char)(var+j-1));
			
			System.out.print("\n");
		}
		
		
	}

}
