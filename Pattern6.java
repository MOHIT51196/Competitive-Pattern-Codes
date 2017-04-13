import java.util.Scanner;

/*for the pattern 
 *     A
 *    AB
 *   ABC
 *  ABCD
 * ABCDE
 */


public class Pattern6 {
	private static Scanner in =new Scanner(System.in);
	
	public static void main(String ...arg){
		
	int num,var=65;
	
	System.out.print("\nEnter the iterations  : >");
	num=in.nextInt();
	
	for(int i=1;i<=num;i++)
	{
		for(int k=1;k<=(num-i);k++)
			System.out.print(" ");
		
		for(int j=1;j<=i;j++)	
			System.out.print((char)(var+j-1));
		
		System.out.print("\n");
	}
	
	}

}
