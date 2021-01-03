package entities;

public class Search {
	
	public static void search(Integer[][] matrix, Integer number) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("left: " + matrix[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
					
				} 
			}
		}
	}

}
