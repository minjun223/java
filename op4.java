package chap00;

public class op4 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			printStar(i);
			System.out.println();
		}

	}
	private static void printStar(int a) {
		int p=0, j=0;
		String k = "*";
		for(p=0; p<5; p++)
		{
			for(j=0; j<=p; j++)
			{
			System.out.print(k);
			}System.out.print("\n");
		}
		
	}

}
