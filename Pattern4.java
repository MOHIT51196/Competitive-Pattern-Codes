import java.util.Scanner;

/*for the pattern 
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 */


public class Pattern4 {
	
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
		int num,var=65;
		
		System.out.print("\nneter the iterations : > ");
		num=in.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print((char)(var+j-1));
			
			System.out.print("\n");
		}
	}

}
