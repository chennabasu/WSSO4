package TestNg;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		int rowSize = 3;
		int colSize = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 12 Values");
		String[][] arr = new String[rowSize][colSize];
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize; j++) {
				arr[i][j]=sc.next();
			}
		}
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}

}
}
