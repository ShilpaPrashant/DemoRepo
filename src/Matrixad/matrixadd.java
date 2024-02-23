package Matrixad;

public class matrixadd {

	public static void main(String[] args) {
		int A[][]= {{1,2},{3,4}};
		int B[][]= {{1,2},{3,4}};
		int C[][]=new int[2][2];
		
		for(int i=0;i<=A.length-1;i++)
		{
			for(int j=0;j<=A[i].length-1;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
				System.out.println(C[i][j]);
			}
			
		}
 
	}

}
