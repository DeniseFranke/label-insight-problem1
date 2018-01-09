package com.denisefranke.solution1;

import java.util.Scanner;

/**
 * Pangram
 * @author Denise Franke
 *
 */
public class Pangram {

	private final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	/**
	 * No-arg constructor
	 */
	public Pangram() {
	}
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String line = "" ;
		if (scan.hasNextLine())
		    line = scan.nextLine();
		scan.close();
		//only run from main constructor if arguments were provided.
		if (!line.isEmpty()) {
			System.out.println(new Pangram().getMissingLetters(line));
		}
	}

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
}
 