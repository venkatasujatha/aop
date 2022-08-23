package patternprogram;

public class PatternEx12 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(j=11-2*i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
