
import java.util.Scanner;

/*for ther patrens like 
	
	*****
	*****
	*****
	*****
	*****
*/

public class Pattern1 {
	
	private static Scanner in =new Scanner(System.in);
			
	public static void main(String ...arg){
		
		System.out.print("\nEnter the iterations : > ");
		int  num=in.nextInt();
		
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
				System.out.print('*');
			
			System.out.print("\n");
		}
	}
}
