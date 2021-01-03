package application;

import java.util.Scanner;

import entities.Search;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer line = sc.nextInt();
		Integer column = sc.nextInt();
		Integer[][] matrix = new Integer[line][column];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		Integer number = sc.nextInt();
		Search.search(matrix, number);
		
		sc.close();

	}

}
