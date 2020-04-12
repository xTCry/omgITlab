/**
 * The second laboratory work.
 */
package ru.xtashs.is.labs;

/**
 * @author xTCry (Vladislav Kh)
 */
public class Lab_2 {
	
	public void main(LabX lab) {
		System.out.println("Laba 2 out data;");
		Ex1();
		System.out.println("\n\n--------------\n");
		Ex2();
	}
	
	/**
	 *   Даны два одномерных целочисленных массива.
	 * Произвести поиск заданного значения в первом из них – методом
	 * последовательного перебора с использованием барьерного элемента,
	 * а во втором – бинарный поиск, предварительно отсортировав этот
	 * массив методом вставки. Первый массив отсортировать затем,
	 * выбором наименьшего элемента произвести слияние полученных массивов.
	 * 
	 *   В одномерном массиве, состоящем из n вещественных элементов, вычислить:
	 *     1) количество отрицательных элементов массива;
	 *     2) сумму модулей элементов массива,
	 *     расположенных после минимального по модулю элемента
	 */
	private void Ex1() {
		int arrSize = 10;
		int maxRand = 15;
		
		int[] arrayA = new int[arrSize];
		int[] arrayB = new int[arrSize];
		int[] arrayC = new int[arrSize * 2];

		// Задание рандомных значений в матрицы и их вывод
		System.out.print("Массив A:\n ");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA[i] = LabX.rand(0, maxRand);
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Массив B:\n ");
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = LabX.rand(0, maxRand);
			System.out.print(arrayB[i] + " ");
		}
		System.out.print("\n===\n");

		// Попытка найти рандомное значение в массиве A
		int desiredVal = LabX.rand(0, maxRand);
		boolean isFoundVal = false;
		System.out.println("Искомое значение: " + desiredVal);
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] == desiredVal) {
				System.out.println(" - Найдено с ключем: " + i);
				isFoundVal = true;
			}
		}
		if(!isFoundVal) System.out.println(" - Значение не найдено.");

		
		// Сортировка и вывод массивов
		System.out.print("Массив A после сортировки:\n ");
		for (int i = 0, min = 0; i < arrayA.length; i++) {
			min = i;
			for (int j = i + 1; j < arrayA.length; j++) {
				if (arrayA[j] < arrayA[min])
					min = j;
			}
			int tempVal = arrayA[i];
			arrayA[i] = arrayA[min];
			arrayA[min] = tempVal;
		}
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();


		System.out.print("Массив B после сортировки:\n ");
		for (int i = 1; i < arrayB.length; i++){
			for(int j = i; j > 0 && arrayB[j - 1] > arrayB[j]; j--) {
				int tempVal = arrayB[j];
				arrayB[j] = arrayB[j - 1];
				arrayB[j - 1] = tempVal;
			}
		}
		
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
		}
		System.out.print("\n===\n");

		
		// Попытка найти рандомное значение в массиве B
		int desiredVal_2 = LabX.rand(0, maxRand);
		boolean isFoundVal_2 = false;
		System.out.println("Искомое значение в массиве B: " + desiredVal_2);
		
		for(int i = 0, j = 9; i <= j;) {
			int middleIndex = (i + j) / 2;
			if (arrayB[middleIndex] == desiredVal_2) {
				System.out.println(" - Найдено с ключем: " + i);
				isFoundVal_2 = true;
				break;
				// ...ftw
			}
			else if (arrayB[middleIndex] < desiredVal_2)
				i = middleIndex + 1;
			else if (arrayB[middleIndex] > desiredVal_2)
				j = middleIndex - 1;
		}
		if(!isFoundVal_2) {
			System.out.println(" - Значение не найдено.");
		}
		
		System.out.println("===");


		System.out.println("Слияние массива A и B в C: ");
		for (int i = 0, j = 0, k = 0; i < arrayA.length && j < arrayB.length; k++) {
			if (arrayA[i] < arrayB[j]) {
				arrayC[k] = arrayA[i];
				i++;
			} else {
				arrayC[k] = arrayB[j];
				j++;
			}
			System.out.print(arrayC[k] + " ");
		}
		System.out.print("\n===\n\n");


		double[] array = new double[arrSize];
		int countNegative = 0;
		int minEl = 0;
		
		// Задание значенией массив;
		// поиск кол-во отрицательных значений;
		// поиск минимального по модулю элемента
		System.out.print("Массив X:\n ");
		for (int i = 0; i < array.length; i++) {
			array[i] = LabX.rand(-500, 600) / 10d;
			if (array[i] < 0) countNegative++;
			if (Math.abs(array[i]) < Math.abs(array[minEl])) minEl = i;
			System.out.print(array[i] + " ");
		}
		System.out.println("\n* Кол-во отрицательных элементов массива: " + countNegative);

		// Поиск суммы модулей элементов массива,
		// расположенных после минимального по модулю элемента
		double absSum = 0;
		for (int i = minEl; i < array.length; i++) {
			absSum += Math.abs(array[i]);
		}
		
		System.out.print("* Сумма модулей элементов массива,\n расположенных после минимального по модулю элемента: " + absSum);
	}

	private void Ex2() {
		Ex2("HelloW");
	}
	/**
	 * Дано слово. Произвести сортировку данного слова методом пузырька с использованием индекса.
	 * @param str
	 */
	private void Ex2(String str) {
		char[] letters = str.toCharArray();
		int[] letterKeys = new int[letters.length];

		System.out.print("Заданное слово: '" + str + "'.\n");
		
		for (int i = 0; i < letters.length; i++) {
			letterKeys[i] = i;
		}
		
		for (int i = 1; i < letters.length; i++) {
			for (int j = 0; j < letters.length - 1; j++) {
				if (letters[letterKeys[j]] > letters[letterKeys[j + 1]]) {
					letterKeys[j] += letterKeys[j + 1];
					letterKeys[j + 1] = letterKeys[j] - letterKeys[j + 1];
					letterKeys[j] = letterKeys[j] - letterKeys[j + 1];
				}
			}
		}
		
		System.out.print("Сортировка по возрастанию:\n ");
		for(int i = 0; i < letters.length; i++) {
			System.out.print(letters[letterKeys[i]] + " ");
		}
		
		System.out.print("\nСортировка по убыванию:\n ");
		for(int i = 0; i < letters.length; i++) {
			System.out.print(letters[letterKeys[letters.length - i - 1]] + " ");
		}
	}
}
