
import java.util.Scanner;

/*for ther patrens like 
	
	AAAAA
	BBBBB
	CCCCC
	DDDDD
	EEEEE
*/

public class Pattern2 {
	
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		final int var=65;
		
		System.out.print("\nEnter the iterator : > ");
		int num=in.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
				System.out.print((char)(var+i-1));
			
			System.out.print("\n");
		}
	}

}
