package day5;

public class Array3 {

	public static void main(String[] args) {
		int[] a={10,30,25,90,80};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
