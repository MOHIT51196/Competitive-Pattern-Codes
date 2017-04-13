import java.util.Scanner;

/*for patterns like 
 *    A
 *   CBC
 *  EDCDE
 * GFEDEFG
 *  IHEHI
 *   GFG
 *    G
 */

public class pattern10 {
	
	private static Scanner in=new Scanner(System.in);
	
	public static void main(String ...arg){
		
	int num,i,j,k,stp,stpj,var=65;
		
	System.out.print("\nEnter the iterations : > ");
	num=in.nextInt();
	
	for(i=1;i<=2*num-1;i++)
	{
		
		if(i<=num)
			stp=i;
		else 
			stp=num-(i%num);
		
		for(k=1;k<=num-stp;k++)
			System.out.print(" ");
		
		for(j=2*stp-1;j>=1;j--)
		{
			if(j<stp)
				stpj=i+(stp-j);
			else 
				stpj=i-(stp-j);
			
			System.out.print((char)(var+stpj-1));
		}
		
		System.out.print("\n");
	}
		
	}

}
