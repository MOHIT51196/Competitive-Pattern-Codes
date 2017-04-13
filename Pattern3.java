import java.util.Scanner;

/*for the pattern 
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 */


public class Pattern3 {
	
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		int num,var=65;
		System.out.print("\nEnter the iterations : > ");
		num=in.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
				System.out.print((char)(var+j-1));
			
			System.out.print("\n");
		}
	}

}
