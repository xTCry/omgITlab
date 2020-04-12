/**
 * The first laboratory work.
 */
package ru.xtashs.is.labs;

/**
 * @author xTCry (Vladislav Kh)
 */
public class Lab_1 {
	
	public void main(LabX lab) {
		System.out.println("Laba 1 out data;");
		Ex1();
		System.out.println("--------------\n");
		Ex2();
	}
	
	private void Ex1() {
		// Variant 7
		final double a = 4.21,
			b = 0.89,
			minX = -3,
			maxX = 3,
			delatX = 1;
		
		double x = minX;
		System.out.println("Ex1\n==========");
		System.out.println("x\t\ty\t\t");
		
		while (x <= maxX) {
			double y = 0;
			if (x <= b) {
				y = Math.sqrt(b - x);
			}
			else if (b < x && x < a) {
				y = (x + a) / (Math.exp(a) + Math.exp(x));
			}
			else if (x >= a) {
				y = a * x + b;
			}
			
			System.out.println(x + "\t\t" + y);
			x += delatX;
		}
	}
	
	private void Ex2() {
		// Variant X
		final double minX = 0.2,
			maxX = 0.8,
			delatX = 0.5,
			eps = 1e-4;

		double x = minX;
		System.out.println("Ex2\n==========");
		System.out.println("x\t\ty");

		while (x <= maxX){
			double T = 1,
				y = 0;
			int n = 1;
			
			while(Math.abs(T) > eps){
				y += T;
				T *= (Math.pow(n, 2) + 1) * x;
				T /= (Math.pow(n - 1, 2) + 1) * n * 2;
				n++;
			}
			
			System.out.println(x + "\t\t" + y);
			x += delatX;
		}
	}
}
