package com.denisefranke.solution;

import java.util.Scanner;

/**
 * Pangram
 * @author Denise Franke
 *
 */
public class Pangram {

	private final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	/**
	 * @param sentence
	 * @return
	 */
	public String getMissingLetters(String sentence) {
		StringBuilder missingLetters = new StringBuilder();

		sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();

		// Save time if sentence is empty
		if (sentence.isEmpty())
			return ALPHABET;

		for (char c = 'a'; c <= 'z'; c++) {
			if ((sentence.toLowerCase().indexOf(c) < 0) && (sentence.toLowerCase().indexOf((char) (c + 32)) < 0))
				missingLetters.append(c);
		}

		return missingLetters.toString();
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		scan.close();
		System.out.println(new Pangram().getMissingLetters(line));
	}

}
 