package patternprogram;

public class PatternEx14 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				if(i==1||i==5||j==1||j==2*i-1)
				{
				System.out.print("*");
			    }
				else
				{
					System.out.println(" ");
				}
			}
		}
		System.out.println();

	}

}
