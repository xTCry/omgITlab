/**
 * 
 */
package ru.xtashs.is.labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author stud
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
		lab1.main(lab);
	}
	
	public final static String readLine(String p) throws IOException {
		System.out.print(p);
		System.out.flush();
		return in.readLine();
	}
	
	public final static void cls() {
		// TODO: ff
	}

}
