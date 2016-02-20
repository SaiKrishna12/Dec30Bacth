package day5;

public class WhileLoop2 {

	
	public static void main(String[] args) {
		int i=1;
		while(i<=4)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
