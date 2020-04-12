/**
 * Main file. Controller labx
 */
package ru.xtashs.is.labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xTCry (Vladislav Kh)
 *
 */
public class LabX {

	public static BufferedReader in;
	
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
		LabX lab = new LabX();

		Lab_1 lab1 = new Lab_1();
		Lab_2 lab2 = new Lab_2();
		lab2.main(lab);
	}
	
	public final static String readLine(String p) throws IOException {
		System.out.print(p);
		System.out.flush();
		return in.readLine();
	}
	
	public final static void cls() {
		// TODO: ff
	}
	
	public static int rand(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
}
