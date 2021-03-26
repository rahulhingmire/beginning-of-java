package loops;

public class Tableof1to20 {

	public static void main(String[] args) {
	
		int i,j,result;
		for(i=1;i<=20;i++)
		{
			for(j=1;j<=10;j++) {
				result=i*j;
				System.out.print(result+" ");
			}
			System.out.println();
		}
	}

}
