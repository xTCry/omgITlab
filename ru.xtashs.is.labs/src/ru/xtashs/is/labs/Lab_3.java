/**
 * The second laboratory work.
 */
package ru.xtashs.is.labs;

/**
 * @author xTCry (Vladislav Kh)
 */
public class Lab_3 {
	
	public void main(LabX lab) {
		System.out.println("Laba 3 out data;");
		Ex1();
	}

	/**
	 *   Осуществить циклический сдвиг элементов каждого столбца
	 * прямоугольной матрицы на К элементов влево.
	 *   Определить номер первой строки матрицы,
	 * содержащей хотя бы один положительный элемент
	 */
	private void Ex1() {
		int n = 5, m = 10;
		int[][] matrix = new int[n][m];
		int k = 2;
		
		// Создание и вывод матрицы
		System.out.printf("Матрица [%dx%d]:\n", m, n);
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[i][j] = LabX.rand(-20, 5);
				System.out.printf("%5d", matrix[i][j]);
			}
			System.out.println();
		}
		
		//   Циклический сдвиг элементов каждого столбца
		// на К элементов влево.
		for(int i = 0; i < n; i++) {
			for(int q = 0; q < k; q++) {
				int temp = matrix[i][0];
				for(int j = 0; j < m - 1; j++) {
					matrix[i][j] = matrix[i][j+1];
				}
				matrix[i][m - 1] = temp;
			}
		}

		// Вывод матрицы после сдвига
		System.out.print("\n\nМатрица после сдвига:\n");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.printf("%5d", matrix[i][j]);
			}
			System.out.println();
		}
		
		// Найти первую строку с положительным элементом
		for(int i = 0; i < n; i++) {
			int countPositive = 0;
			for(int j = 0; j < m; j++) {
				if(matrix[i][j] > 0) {
					countPositive++;
				}
			}
			
			if(countPositive > 0) {
				System.out.printf("\n Строка %d содержит %d положительных эл.", i + 1, countPositive);
				break;
			}
		}
		
	}
}
