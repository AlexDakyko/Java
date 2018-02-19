
import java.util.Arrays;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
int [][] matrixA;
matrixA = new int [2][3];

matrixA[0][0] = -1;
matrixA[0][1] = -2;
matrixA[0][2] = 1;
matrixA[1][0] = 2;
matrixA[1][1] = 3;
matrixA[1][2] = -3;

for (int i = 0; i < 2; i++) {
	for (int j=0; j<3; j++) {
		System.out.print(matrixA[i][j] + "\t"); 
		
		
}
	System.out.println();
	}

{
	System.out.print("\n");		
}


	
	int [][] matrixB;
	matrixB = new int [2][3];



	matrixB[0][0] = 0;
	matrixB[0][1] = -1;
	matrixB[0][2] = 3;
	matrixB[1][0] = 1;
	matrixB[1][1] = 2;
	matrixB[1][2] = -3;



	for (int k = 0; k < 2; k++) {
		for (int l = 0; l < 3; l++) {
			System.out.print(matrixB [k][l] + "\t");
		}
			System.out.println();
	}
	
	

int [][] multResult;
multResult = new int [2][3];
			
			multResult [0][0] = matrixA[0][0] * matrixB[0][0]; {
				multResult [0][1] = matrixA[0][1] * matrixB[0][1]; {
					multResult[0][2] = matrixA[0][2] * matrixB[0][2]; {
						multResult [1][0] = matrixA[1][0] * matrixB[1][0]; {
							multResult [1][1] = matrixA[1][1] * matrixB[1][1]; {
								multResult [1][2] = matrixA[1][2] * matrixB[1][2]; {
					}
							}
					
					
					System.out.print("\n\nMatrix MULTIPLICATION Result");
					System.out.print("\n\n");
					
					System.out.print(multResult[0][0] + "\t");
					System.out.print(multResult[0][1]+ "\t");
					System.out.print(multResult[0][2]+ "\t\n");
					System.out.print(multResult[1][0]+ "\t");
					System.out.print(multResult[1][1]+ "\t");
					System.out.print(multResult[1][2]+ "\t");
			
				}
				
		}
	
				

		}
	}
	}
}



	

	
	
	